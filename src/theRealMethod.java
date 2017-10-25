import java.util.*;

public class theRealMethod {

	String name;
	String marryname;
	String character; // 캐릭터
	String mancharacter;// 배우자캐릭터
	int man; // 남편 멤버변수
	int health = 20; // 포만지수
	int feeling = 0;// 감정지수
	int sick = 0;// 건강지수
	int marry = 0;// 결혼지수
	int age = 1;// 나이
	int exp = 0;// 경험치 저장
	int eexp = 100;// 다음 레벨 요구 경험치
	int dex = 10;// 지능
	int tired = 0; // 졸림상태
	int swim = 0; // 수영 지수
	int run = 0;// 달리기 지수
	int soccer = 0;// 축구 지수
	int injury = 0;// 부상 지수
	int language = 0;// 국어 지수
	int math = 0;// 수학 지수
	int science = 0;// 과학 지수
	int slump = 0;// 공부하다 슬럼프 지수
	int image;// 캐릭터선택
	int repeat = 1; // 결혼반복여부

	public void SetName() { // 이름 코드

		Scanner scan = new Scanner(System.in);

		char answer;

		while (true) {
			System.out.println("\n이름을 입력해 주세요:");
			name = scan.next();
			System.out.println(name + " 이/가 확실합니까? (Yes=1/No=2)");

			answer = scan.next().charAt(0);
			if (answer == '1') {
				System.out.println("이 이름으로 시작하겠습니다 .");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
				}
				System.out.println("캐릭터를 골라주세요");
				System.out.println("1. (ㅇ´▽`ㅇ)");
				System.out.println("2. ʕ●ᴥ●ʔ ");
				System.out.println("3. (●ʘ̅ㅈʘ̅●)");
				System.out.println("4. (●ө●)♡ ");
				System.out.println("5. @(・●・)@ ");

				image = scan.nextInt();

				switch (image) {

				case 1:
					System.out.println("당신은 " + "(❁´▽`❁) " + name + "입니다.");
					character = "(❁´▽`❁)";		
					break;
				case 2:
					System.out.println("당신은 " + name + " ʕ•ᴥ•ʔ입니다");
					character = "ʕ•ᴥ•ʔ ";
					break;
				case 3:
					System.out.println("당신은 " + name + " (●ʘ̅ㅈʘ̅●)입니다");
					character = "(●ʘ̅ㅈʘ̅●)";
					break;
				case 4:
					System.out.println("당신은 " + name + " (•ө•)♡입니다");
					character = "(•ө•)♡";
					break;
				case 5:
					System.out.println("당신은 " + name + " @(・●・)@입니다");
					character = "@(・●・)@";
					break;
				default:
					System.out.println("잘못누르셨어요! 다시 입력해주세요~");
				}
				System.out.println(" 이렇게 다마고치를 시작하겠습니다 \n 편안한 여행 되십시오.");
				break;
			} else if (answer == '2') {
				System.out.print("다시 작성하여 주십시오.");
				continue;
			} else {
				System.out.println("1이나 2중에 하나만 골라주세요! .\n 다시 돌아갑니다.");
			}
		}
	}

	public void eat(int num) { // 포만감 문

		if (health <= 40) {
			health += num;
			feeling += 1;
			System.out.println(name + "이/가 행복한듯이 밥을 먹습니다");
			System.out.println(character + "◥█̆̈◤࿉∥");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			} // 출력 지연 코드, 숫자 높이면 텀이 커진다
			System.out.println(name + "이/가의 '포만지수'가 [3] 올랐다! " + name + "이/가의 '감정지수'가 [1] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		} else if (health >= 40) {
			health += num;
			feeling -= 4;
			System.out.println(name + "이/가 배가 불러 괴로워 합니다");
			System.out.println("(՟ິͫઘ ՟ິͫ)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

	public void feeling(int num) { // 감정문, 놀아주기
		if ((0 <= feeling) && (15 > feeling)) {
			feeling += num;
			health -= 1;
			tired += 3;
			System.out.println(name + "이/가 별로 흥미를 느끼지 못하고 있습니다");
			System.out.println(character + "...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(
					name + "이/가의 '감정지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [1] 줄었다 " + name + "이/가의 '피곤지수'가 [3] 올랐다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((15 <= feeling) && (30 > feeling)) {
			feeling += num;
			health -= 1;
			tired += 3;
			System.out.println(name + "이/가 아직 어색해 보입니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(
					name + "이/가의 '감정지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [1] 줄었다 " + name + "이/가의 '피곤지수'가 [3] 올랐다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((30 <= feeling) && (50 > feeling)) {
			feeling += num;
			health -= 1;
			tired += 3;
			System.out.println(name + "이/가의 기분은 평범해 보입니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(
					name + "이/가의 '감정지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [1] 줄었다 " + name + "이/가의 '피곤지수'가 [3] 올랐다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((50 <= feeling) && (70 > feeling)) {
			feeling += num;
			health -= 1;
			tired += 3;
			System.out.println(name + "이/가 즐거워 보입니다");
			System.out.println("┖" + character + "┛");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '감정지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [1] 줄었다 " + name
					+ "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [3] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((70 <= feeling) && (100 > feeling)) {
			feeling += num;
			health -= 1;
			tired += 3;
			System.out.println(name + "이/가 무척이나 즐거워 보입니다");
			System.out.println("☝" + character + "☝");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '감정지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [1] 줄었다 " + name
					+ "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if (100 <= feeling) {
			feeling += num;
			health -= 1;
			tired += 3;
			System.out.println(name + "이/가는 인생최고로 즐거워 보입니다");
			System.out.println(character + "HAPPY");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '감정지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [1] 줄었다 " + name
					+ "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [10] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

	public void exp(int num) { // 경험치 코드
		exp += num;
		health -= 4;
		tired += 3;
		System.out.println(name + "이/가 조금 강해진 기분이 듭니다");
		System.out.println("ᕦ(ò_óˇ)ᕤ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 '경험치'가 [40] 올랐다! " + name + "이/가의 '포만지수'가 [4] 줄었다 " + name
				+ "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [10] 올랐다!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 상태: 경험치=" + exp);
		System.out.println(name + "이/가의 상태: 포만지수= " + health);
		System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
		System.out.println(name + "상태: 결혼지수= " + marry);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

	}

	public void age() { // 레벨
		if (exp >= eexp) {

			exp = exp - eexp; // 레벨업으로 인한 경험치 소모
			age = age + 1; // 레벨 상승

			System.out.println(name + "이/가 레벨업 했습니다");
			System.out.println(character + "ε=ε=ε=ε=ε=ε=┌(;￣◇￣)┘");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void dex(int num) { // 지능문
		if ((0 <= dex) && (20 > dex)) {
			dex += num;
			health -= 2;
			feeling -= 3;
			tired += 3;
			marry += 5;
			System.out.println(name + "이/가 숫자를 배우고 있습니다");
			System.out.println(character + "📖");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("흥미로운 모양입니다");
			System.out.println(character + "👍");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '지능지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [2] 줄었다\n" + name
					+ "이/가의 '감정지수'가 [3] 떨어졌다 " + name + "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 지능지수=" + dex);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((20 <= dex) && (40 > dex)) {
			dex += num;
			health -= 2;
			feeling -= 3;
			tired += 3;
			marry += 5;
			System.out.println(name + "이/가 산수를 배우고 있습니다");
			System.out.println(character + "📖");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("배우는 속도가 빠릅니다");
			System.out.println(character + "👍");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '지능지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [2] 줄었다\n" + name
					+ "이/가의 '감정지수'가 [3] 떨어졌다 " + name + "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 지능지수=" + dex);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
		} else if ((40 <= dex) && (60 > dex)) {
			dex += num;
			health -= 1;
			feeling -= 3;
			tired += 3;
			marry += 5;
			System.out.println(name + "이/가 실수를 배우고 있습니다");
			System.out.println(character + "📖");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("굉장한 몰입도입니다");
			System.out.println(character + "👍");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '지능지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [2] 줄었다\n" + name
					+ "이/가의 '감정지수'가 [3] 떨어졌다 " + name + "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 지능지수=" + dex);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
		} else if ((60 <= dex) && (80 > dex)) {
			dex += num;
			health -= 1;
			feeling -= 3;
			tired += 3;
			marry += 5;
			System.out.println(name + "이/가 기하학을 배우고 있습니다");
			System.out.println(character + "📖)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '지능지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [2] 줄었다\n" + name
					+ "이/가의 '감정지수'가 [3] 떨어졌다 " + name + "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 지능지수=" + dex);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
		} else if (80 <= dex) {
			dex += num;
			health -= 1;
			feeling -= 3;
			tired += 3;
			marry += 5;
			System.out.println(name + "이/가는 논문을 작성중입니다");
			System.out.println(character + "📖)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("더이상 다마에게 가르킬것이 없습니다");
			System.out.println(character + "X");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '지능지수'가 [3] 올랐다! " + name + "이/가의 '포만지수'가 [2] 줄었다\n" + name
					+ "이/가의 '감정지수'가 [3] 떨어졌다 " + name + "이/가의 '피곤지수'가 [3] 올랐다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 지능지수=" + dex);
			System.out.println(name + "이/가의 상태: 포만지수= " + health);
			System.out.println(name + "이/가의 상태: 감정지수=" + feeling);
			System.out.println(name + "이/가의 상태: 피곤지수=" + tired);
			System.out.println(name + "상태: 결혼지수= " + marry);
		}
	}

	public void sleep() { // 숙면 코드
		if ((tired >= 0) && (tired <= 20)) {
			System.out.println(name + " 이/가는 아직 졸리지 않은 모양입니다");
			System.out.println(character);

		} else if (tired <= 20) {
			tired -= 15;
			health -= 7;
			feeling += 5;
			System.out.println(name + "는 숙면을 취하고 있습니다");
			System.out.println(character + "..zzzZZ");
		}

	}

	public void dead() { // 다마의 죽음
		System.out.println(" Game Over ");
		System.out.println("_:(´ཀ`」 ∠):");
		System.exit(0);
	}

	public void noEat() { // 랜덤 편식
		health += 1;
		sick += 1;
		marry -= 5;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("먹기 싫은건 죽어도 안먹으려 합니다");
		System.out.println(character + "(￣^￣)ゞ");
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 포만지수가 [2] 올랐다! " + name + "이/가의 질병지수가 [1] 올랐다" + name + "이/가의 결혼지수가 [5] 줄었다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 상태: 포만지수=" + health);
		System.out.println(name + "이/가의 상태: 질병지수= " + sick);
		System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
	}

	public void destroy() { // 랜덤 파괴
		health -= 3;
		feeling -= 3;
		marry -= 5;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "의 눈에 눈물이 고입니다");
		System.out.println("｡ﾟ" + character + "ﾟ｡");
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 감정지수가 [3] 줄었다 " + name + "이/가의 포만지수가 [3] 줄었다" + name + "이/가의 결혼지수가 [5] 줄었다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 상태: 감정지수= " + feeling);
		System.out.println(name + "이/가의 상태: 포만지수= " + health);
		System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
	}

	public void injury() { // 랜덤 부상
		injury -= 2;
		feeling -= 3;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("앗!!" + name + "가 부상을 당했습니다!");
		System.out.println("_:(´ཀ`」 ∠):");
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 부상지수가 [2] 올랐다 " + name + "이/가의 기분지수가 [3] 줄었다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 상태: 부상지수= " + injury);
		System.out.println(name + "이/가의 상태: 포만지수= " + feeling);
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
	}

	public void slump() { // 랜덤 슬럼프
		slump -= 2;
		feeling -= 3;
		marry -= 5;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "에게 슬럼프가 왔습니다... 우울해 보입니다");
		System.out.println(character + "＿|￣|○");
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 슬럼프 지수가 [2] 올랐다 " + name + "이/가의 기분지수가 [3] 줄었다" + name + "이/가의 결혼지수가 [5] 줄었다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "이/가의 상태: 슬럼프 지수= " + slump);
		System.out.println(name + "이/가의 상태: 포만지수= " + feeling);
		System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
		}
	}

	public void swim() { // 수영 코드
		if ((0 <= swim) && (20 > swim)) {
			swim += 3;
			tired += 3;
			health -= 4;
			marry += 3;
			System.out.println(name + "이/가는 물장구를 치고 있습니다");
			System.out.println(character + "🏊");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수영실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [3] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수영실력=" + swim);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((20 <= swim) && (40 > swim)) {
			swim += 3;
			tired += 3;
			health -= 4;
			marry += 5;
			System.out.println(name + "이/가 수영교실에 들어갔습니다");
			System.out.println(character + "🏊");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수영실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수영실력=" + swim);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((40 <= swim) && (60 > swim)) {
			swim += 3;
			tired += 3;
			health -= 4;
			marry += 10;
			System.out.println(name + "이/가 본격적으로 수영을 배우고 있습니다");
			System.out.println(character + "🏊");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수영실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [10] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수영실력=" + swim);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((60 <= swim) && (80 > swim)) {
			swim += 3;
			tired += 3;
			health -= 4;
			marry += 15;
			System.out.println(name + "이/가 국내대회 메달을 쓸어담고 있습니다");
			System.out.println(character + "🏊🏆");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수영실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [15] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수영실력=" + swim);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if (80 <= swim) {
			swim += 3;
			tired += 3;
			health -= 4;
			marry += 20;
			System.out.println(name + "이/가 올림픽 선수로 뽑혔습니다!\n열심히 대회 준비중입니다");
			System.out.println(character + "🏊🏆");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수영실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [20] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수영실력=" + swim);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void run() { // 달리기 코드
		if ((0 <= run) && (20 > run)) {
			run += 3;
			tired += 3;
			health -= 4;
			marry += 3;
			System.out.println(name + "이/가 걸음마를 때고 있습니다");
			System.out.println(character + "🚶");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '달리기 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [3] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 달리기 실력=" + run);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((20 <= run) && (40 > run)) {
			run += 3;
			tired += 3;
			health -= 4;
			marry += 5;
			System.out.println(name + "이/가 육상부에 입부했습니다");
			System.out.println(character + "🏁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '달리기 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 달리기 실력=" + run);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((40 <= run) && (60 > run)) {
			run += 3;
			tired += 3;
			health -= 4;
			marry += 10;
			System.out.println(name + "이/가 육상부에서 뛰어난 실력을 발휘하고 있습니다/n");
			System.out.println(character + "🏁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '달리기 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [10] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 달리기 실력=" + run);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((60 <= run) && (80 > run)) {
			run += 3;
			tired += 3;
			health -= 4;
			marry += 15;
			System.out.println(name + "이/가 국내전에서 메달을 휩쓸고 있습니다");
			System.out.println(character + "🏁🏆");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '달리기 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [15] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 달리기 실력=" + run);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if (80 <= run) {
			run += 3;
			tired += 3;
			health -= 4;
			marry += 20;
			System.out.println(name + "이/가 올림픽 선수로 뽑혔습니다!/n열심히 대회 준비중입니다");
			System.out.println(character + "🏁🏆");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '달리기 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [20] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 달리기 실력=" + run);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void soccer() { // 축구 코드
		if ((0 <= soccer) && (20 > soccer)) {
			soccer += 3;
			tired += 3;
			health -= 4;
			marry += 3;
			System.out.println(name + "이/가 축구공으로 놀고 있습니다");
			System.out.println(character + "⚽");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '축구 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [3] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 축구 실력=" + soccer);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((20 <= soccer) && (40 > soccer)) {
			soccer += 3;
			tired += 3;
			health -= 4;
			marry += 5;
			System.out.println(name + "이/가 축구 교실에 들어갔습니다");
			System.out.println(character + "⚽");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '축구 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 축구 실력=" + soccer);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((40 <= soccer) && (60 > soccer)) {
			soccer += 3;
			tired += 3;
			health -= 4;
			marry += 10;
			System.out.println(name + "이/가 축구 교실에서 에이스로 뽑혔습니다");
			System.out.println(character + "⚽");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '축구 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [3] 줄었다" + name + "의 '결혼지수'가 [10] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 축구 실력=" + soccer);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((60 <= soccer) && (80 > soccer)) {
			soccer += 3;
			tired += 3;
			health -= 4;
			marry += 15;
			System.out.println(name + "이/가 진심으로 축구를 배우고 있습니다");
			System.out.println(character + "⚽🏆");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '축구 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [15] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 축구 실력=" + soccer);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if (80 <= soccer) {
			soccer += 3;
			tired += 3;
			health -= 4;
			marry += 20;
			System.out.println(name + "이/가 월드컵 선수로 뽑혔습니다!\n열심히 연습중입니다");
			System.out.println(character + "⚽🏆");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '축구 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [20] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 축구 실력=" + soccer);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void language() { // 국어 코드
		if ((0 <= language) && (20 > language)) {
			language += 3;
			tired += 3;
			health -= 4;
			marry += 3;
			System.out.println(name + "이/가 한글놀이를 하는 중입니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '국어 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [3] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 국어 실력=" + language);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((20 <= language) && (40 > language)) {
			language += 3;
			tired += 3;
			health -= 4;
			marry += 5;
			System.out.println(name + "이/가 국어 교실에 들어갔습니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '국어 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 국어 실력=" + language);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((40 <= language) && (60 > language)) {
			language += 3;
			tired += 3;
			health -= 4;
			marry += 10;
			System.out.println(name + "이/가 반에서 국어 1등을 했습니다");
			System.out.println(character + "💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '국어 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [10] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 국어 실력=" + language);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((60 <= language) && (80 > language)) {
			language += 3;
			tired += 3;
			health -= 4;
			marry += 15;
			System.out.println(name + "이/가 진심으로 국어를 배우고 있습니다");
			System.out.println(character + "💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '국어 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [15] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 국어 실력=" + language);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if (80 <= language) {
			language += 3;
			tired += 3;
			health -= 4;
			marry += 20;
			System.out.println(name + "이/가 서울대 국어국문학과에 입학했습니다!\n열심히 공부중입니다");
			System.out.println(character + "🎓💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '국어 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [20] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 국어 실력=" + language);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void math() { // 수학 코드
		if ((0 <= math) && (20 > math)) {
			math += 3;
			tired += 3;
			health -= 4;
			marry += 3;
			System.out.println(name + "이/가 수학 놀이를 하는 중입니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [3] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수학 실력=" + math);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((20 <= math) && (40 > math)) {
			math += 3;
			tired += 3;
			health -= 4;
			marry += 5;
			System.out.println(name + "이/가 수학 교실에 들어갔습니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수학 실력=" + math);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((40 <= math) && (60 > math)) {
			math += 3;
			tired += 3;
			health -= 4;
			marry += 10;
			System.out.println(name + "이/가 반에서 수학 1등을 했습니다");
			System.out.println(character + "💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [10] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수학 실력=" + math);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((60 <= math) && (80 > math)) {
			math += 3;
			tired += 3;
			health -= 4;
			marry += 15;
			System.out.println(name + "이/가 진심으로 수학를 배우고 있습니다");
			System.out.println(character + "💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [15] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수학 실력=" + math);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if (80 <= math) {
			math += 3;
			tired += 3;
			health -= 4;
			marry += 20;
			System.out.println(name + "이/가 서울대 수학과에 입학했습니다!\n열심히 공부중입니다");
			System.out.println(character + "🎓💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '수학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [20] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 수학 실력=" + math);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void science() { // 과학 코드
		if ((0 <= science) && (20 > science)) {
			science += 3;
			tired += 3;
			health -= 4;
			marry += 3;
			System.out.println(name + "이/가 과학실습 놀이를 하는 중입니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '과학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [3] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 과학 실력=" + science);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((20 <= science) && (40 > science)) {
			science += 3;
			tired += 3;
			health -= 4;
			marry += 5;
			System.out.println(name + "이/가 과학 교실에 들어갔습니다");
			System.out.println(character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '과학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [5] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 과학 실력=" + science);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((40 <= science) && (60 > science)) {
			science += 3;
			tired += 3;
			health -= 4;
			marry += 10;
			System.out.println(name + "이/가 반에서 과학 1등을 했습니다");
			System.out.println(character + "💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '과학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [10] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 과학 실력=" + science);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if ((60 <= science) && (80 > science)) {
			science += 3;
			tired += 3;
			health -= 4;
			marry += 15;
			System.out.println(name + "이/가 진심으로 과학을 배우고 있습니다");
			System.out.println(character + "💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '과학 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [15] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 과학 실력=" + science);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		} else if (80 <= science) {
			science += 3;
			tired += 3;
			health -= 4;
			marry += 20;
			System.out.println(name + "이/가 서울대 물리학과에 입학했습니다!\n열심히 공부중입니다");
			System.out.println(character + "🎓💯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 '물리 실력'이 [3] 올랐다! " + name + "이/가의 '피곤지수'가 [3] 올랐다 " + name
					+ "이/가의 '포만지수'가 [4] 줄었다" + name + "의 '결혼지수'가 [20] 올랐다!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + "이/가의 상태: 물리 실력=" + science);
			System.out.println(name + "이/가의 상태: 피곤지수= " + tired);
			System.out.println(name + "이/가의 상태: 포만지수=" + health);
			System.out.println(name + "이/가의 상태: 결혼지수= " + marry);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void exam() {
		Random rand = new Random(); // Random 객체생성 앞으로 - rand라고 사용하기위해.
		int randnum; // 난수값을 받기위한 변수
		String scanSt; // 사용자의 값을 담기위한 변수를 scanSt라고 설정하는과정.
		boolean trigger = true; // 반복문의 판단조건 설정.
		int answer = 0; // 사용자가 입력한 값의 배열 index를 담기위한 변수
		Scanner scan = new Scanner(System.in); // Scanner 객체생성.

		String sudo[][] = { { "대한민국", "서울" }, { "일본", "도쿄" }, { "레바논", "방글라데시" }, { "말레이시아", "콸라룸푸르" },
				{ "베트남", "하노이" }, { "이스라엘", "예루살렘" }, { "싱가포르", "싱가포르" }, { "조선민주주의인민공화국", "북한" }, { "중국", "베이징" },
				{ "스웨덴", "스톡홀름" }, { "노르웨이", "오슬로" }, { "리투아니아", "빌뉴스" }, { "필리핀", "마닐라" }, { "시리아", "다마스쿠스" },
				{ "쿠웨이트", "쿠웨이트" }, { "터키", "앙카라" }, { "잠비아", "루사카" }, { "중국", "베이징" }, { "이란", "테헤란" }, { "태국", "방콕" },
				{ "이집트", "카이로" }, { "프랑스", "파리" }, { "이탈리아", "로마" }, { "멕시코", "멕시코시티" }, { "호주", "캔버라" },
				{ "뉴질랜드", "웰링턴" }, { "칠레", "산티아고" }, { "캐나다", "오타와" }, { "그리스", "아테네" } };

		if (dex < 40) { //지능이 40이 넘어가면 문제를 되려 냄
			for (int j = 0; j < 3; j++) { // 문제를 3번물어보기위해 for문 사용
				while (trigger) { // true를 넣으면 while문이 계속 돌아가서 boolean을 써서
					System.out.println("국가명을 입력해 주세요!");
					scanSt = scan.next();

					for (int i = 0; i <= 28; i++) { // for문에 값이 넣어질 때 while문을 탈출해야되니까 while반복문의 판단문의 boolean값을 넣어서
													// trigger에 false값이 들어가면
						if (scanSt.equals(sudo[i][0])) { // while문을 탈출하기 위해 boolean을 사용함.
							answer = i; // 배열안의 사용자가 입력한 값이랑 맞는 배열의 index를 answer값에 넣는다는 뜻.
							trigger = false; // 넣었으면 while문을 탈출해야 되니까 trigger값에 false를 넣음.
							break; // for문도 탈출해야 되니 break를 사용
						} else if (i == 28) { // 배열안에 사용자가 입력한 값이 없으면 else if의 문이 실행.
							System.out.println("おいおいきさま　제대로 된걸 치라구~");
							System.out.println("_φ(･_･");

							trigger = true; // 잘못된 값을 받으면 while문이 계속 처음부터 시작되어야하니까 true값을 넣음.
						}
					}
				}

				while (true) { // 오답생성을 위해 사용
					randnum = rand.nextInt(29); // 배열 크기만큼의 난수생성.
					if (answer != randnum)
						break; // 생성된 난수값이 정답index와 같지않으면 while문을 탈출한다는 뜻.
				}

				int probnum = rand.nextInt(100) + 1; // 난수생성 - 확률을 위한 난수생성.

				if (probnum > 30) { // 70%의 확률로 정답 출력.
					dex += 3;
					health -= 2;
					marry += 5;
					System.out.println(sudo[answer][0] + "의 수도는 " + sudo[answer][1]);
					System.out.println("\n...정답!\n");
					System.out.println("♪───Ｏ" + character + "Ｏ────♪");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println(name + "의 '지능지수'가 [3] 올랐다!\n" + name + "의 '포만지수'가 [2] 줄었다.\n" + name
							+ "의 '결혼지수'가 [5] 올랐다!\n");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println(name + "상태: 지능지수=" + dex);
					System.out.println(name + "상태: 포만지수= " + health);
					System.out.println(name + "상태: 결혼지수= " + marry);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					// enteligence =+ 1; 맞췄을 시 지능1상승
				} else {
					dex -= 3;
					health -= 2;
					marry -= 5;
					System.out.println(sudo[answer][0] + "의 수도는 " + sudo[randnum][1]);
					System.out.println("오답!");
					System.out.println("( T_T)＼(^-^ )");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println(name + "의 '지능지수'가 [3] 줄었다.\n" + name + "의 '포만지수'가 [2] 줄었다.\n " + name
							+ "의 '결혼지수'가 [5] 줄었다.\n");
					// enteligence =- 1; 틀렸을 시 지능1하락
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println(name + "상태: 지능지수=" + dex);
					System.out.println(name + "상태: 포만지수= " + health);
					System.out.println(name + "상태: 결혼지수= " + marry);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				// System.out.println(probnum+"\n30%가 넘어가면 정답을 말하는 구조"); 몇%의 확률로 답했는지 알아보기위해 작성.
				trigger = true; // 3번 물어보기로 했으니 while문을 다시 실행하기위한 true값임.
			}
		} // end if

		else { //지능이 40이상 넘어가면 문제를 받는다
			for (int j = 0; j < 2; j++) {
				int rand1 = rand.nextInt(29); // ()안에 들아간 수 -1 = 최대값(가지수) 0부터 시작하니까 0~4-1 =4가지의 수, 뒤에 +n하면 수~n-1까지 가능하다
												// ex)5~10까지면 (5)+5 랜덤할 가지수를 생성한다.

				System.out.println(sudo[rand1][0] + "의 수도는 어디일까요?"); // [1][1] 이라고 하면 왼쪽에 있는게 큰 배열이고 오른쪽에 있는게 그 배열안에 있는
																		// 배열이다 0부터 시작함

				String scan1 = scan.next(); // 받는값도 스트링값이니 next사용
				if (sudo[rand1][1].equals(scan1)) { // 랜덤한 배열안의 수도값과 사용자가 입력한 값을 비교하는것
					feeling =+ 3;
					System.out.println("역시 주인님 똑똑하세요!"); // String은 객체니까 객체비교를 할 때 쓰는 값 String을 쓴다.
					System.out.println("♪───Ｏ" + character + "Ｏ────♪");
					System.out.println(name + "의 기분이 좋아졌다\n ");
					System.out.println(name + "상태: 감정지수=\n" + feeling);
					
				} else {
					feeling =- 3;
					System.out.println("하참 저는 어떻게 만드셨대?");
					System.out.println(name + "의 기분이 갑자기 싸해졌다\n ");
					System.out.println("( T_T)＼(^-^ )");
					System.out.println(name + "상태: 감정지수=\n" + feeling);
					
				}

				// 사용자에게 문제를 내는것.
				// 사용자가 나라를 입력한다 그러면 for문을 돌려서 다마고치에게 입력해서 답을내거나 오답을 내거나 할것.

			}

		} // end else
	}// public class end
		// 다마의 결혼

	public void marry() {
		if(repeat == 1) {
		Scanner scan = new Scanner(System.in);
		char answer;
		if (marry > 30) {
			System.out.println(name + "이/가 결혼을 해야해요!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			// 다마의 결혼대상자의 이름정하기
			System.out.println("\n결혼대상자의 이름을 입력해 주세요");
			marryname = scan.next();
			System.out.println(marryname + " 이/가 확실합니까? (Yes : 1 No : 2)");
			answer = scan.next().charAt(0);
			if (answer == '1') {
				System.out.println(marryname + "님과 결혼생활을 시작합니다.");
				name = name + "♥" + marryname;
				System.out.println("🎉💑🎉");

			} else if (answer == '2') {
				System.out.print("다시 작성하여 주십시오.");

			} else {
				System.out.println("[Yes : 1 No : 2]중에 하나만 골라주세요! .\n 다시 돌아갑니다.");
			}
			// 다마의 결혼대상자 캐릭터정하기
			System.out.println("결혼대상자의 캐릭터를 골라주세요");
			System.out.println("1.  (●OㅈO●) ");
			System.out.println("2. (─___─.) ");
			System.out.println("3. (●’o’●) ");
			System.out.println("4. o((=*ェ*=))o ");
			System.out.println("5. (.▼皿▼) ");

			man = scan.nextInt();

			switch (man) {

			case 1:
				System.out.println("당신의 결혼대상자는 (●OㅈO●) 입니다");
				mancharacter = "(●OㅈO●)";
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				character = character + " ♥ " + mancharacter;
				System.out.println(character);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				break;
			case 2:
				System.out.println("당신의 결혼대상자는 (─___─.) 입니다");
				mancharacter = "(─___─.)";
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				character = character + " ♥ " + mancharacter;
				System.out.println(character);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				;
				break;
			case 3:
				System.out.println("당신의 결혼대상자는 (●’o’●) 입니다");
				mancharacter = "(●’o’●)";
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				character = character + " ♥ " + mancharacter;
				System.out.println(character);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				break;
			case 4:
				System.out.println("당신의 결혼대상자는 o((=*ェ*=))o 입니다");
				mancharacter = "o((=*ェ*=))o";
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				character = character + " ♥ " + mancharacter;
				System.out.println(character);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				break;
			case 5:
				System.out.println("당신의 결혼대상자는 (.▼皿▼) 입니다");
				mancharacter = "(.▼皿▼)";
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				character = character + " ♥ " + mancharacter;
				System.out.println(character);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				break;
			default:
				System.out.println("잘못누르셨어요! 다시 입력해주세요~");
			}
			repeat=0;
		}
		}
	}

	public void printDama() { // 다마의 총 상태
		System.out.println("현재 " + character + " 의 스테이터스 입니다.");
		System.out.println("< " + name + " >");
		System.out.println(name + "의 캐릭터 이미지 : " + character);
		System.out.println(name + "상태: 포만지수= " + health);
		System.out.println(name + "상태: 감정지수= " + feeling);
		System.out.println(name + "의상태: 피곤지수= " + tired);
		System.out.println(name + "상태: 나이= " + age);
		System.out.println(name + "상태: 경험치= " + exp);
		System.out.println(name + "상태: 지능= " + dex);

	}
}