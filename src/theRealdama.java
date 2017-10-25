import java.util.*;
public class theRealdama {

	public static void main(String[] args) {
		theRealMethod myDama = new theRealMethod();
		Scanner scan = new Scanner(System.in);	
		Random rand = new Random();//랜덤변수
		
			int set;
			System.out.println("안녕하세요 1조의 다마고치 입니다.");
			try { Thread.sleep(1100); } catch (InterruptedException e) {}
			System.out.println("당신은 자신의 다마고치를 어떤 식으로 키우실 건가요?");
			try { Thread.sleep(1300); } catch (InterruptedException e) {}
			System.out.println("운동가? 학자? 음악가? 뭐든 좋습니다 자신의 다마고치를 ");
			try { Thread.sleep(1400); } catch (InterruptedException e) {}
			System.out.println("소중히 키워서 이상의 다마고치를 길러보세요!!");
			try { Thread.sleep(1500); } catch (InterruptedException e) {}
	
			myDama.SetName();
			
			while(true) { 
				//다마의 상태를 보고 조건문 출력
				if(myDama.health <=0) {
					System.out.println(myDama.name +"이/가 아사했습니다");
					myDama.dead();
				}
				if(myDama.health <=10) {
					System.out.println(myDama.name +"이/가 배고파 합니다");
					
				}
				if((myDama.health>=50)&&(myDama.health<=60)) {
					System.out.println(myDama.name +"이/가 과식사 했습니다");
					myDama.dead();
				}
				if(myDama.feeling <=-10) {
					System.out.println(myDama.name +"이/가 스트레스가 심해져 죽었습니다");
					myDama.dead();
				}
				if((myDama.health>=20)&&(myDama.health<=40)) {
					if(myDama.feeling>=50) {
						System.out.println(myDama.name + "이/가 행복해 보입니다");
					}					
				}
				// 다마  엔딩 조건
				if((myDama.health>=20)&&(myDama.health<=40)) { //수영선수 엔딩
					if(myDama.swim>=90) {
						System.out.println(myDama.name + "이/가 드디어 올림픽 200M 수영부분에서 금매달을 차지했습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("이제는 독립을 할 시기가 된 것 같습니다");
						try { Thread.sleep(1000); } catch (InterruptedException e) {}
						System.out.println("잘있어! "+myDama.name + "END");
						break;
					}					
				}
				if((myDama.health>=20)&&(myDama.health<=40)) { //단거리달리기 선수 엔딩
					if(myDama.run>=90) {
						System.out.println(myDama.name + "이/가 드디어 올림픽 100M 단거리 달리기 부분에서 금매달을 차지했습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("이제는 독립을 할 시기가 된 것 같습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("잘있어! "+myDama.name + "END");
						break;
					}					
				}
				if((myDama.health>=20)&&(myDama.health<=40)) { //축구선수 엔딩
					if(myDama.soccer>=90) {
						System.out.println(myDama.name + "이/가 드디어 월드컵 트로피를 차지했습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("이제는 독립을 할 시기가 된 것 같습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("잘있어! "+myDama.name + "END");
						break;
					}					
				}
				if((myDama.health>=20)&&(myDama.health<=40)) { //국어학자 엔딩
					if(myDama.language>=90) {
						System.out.println(myDama.name + "이/가 드디어 국문학자가 되었습니다!");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("이제는 독립을 할 시기가 된 것 같습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("잘있어! "+myDama.name + "END");
						break;
					}					
				}
				if((myDama.health>=20)&&(myDama.health<=40)) { //수학학자 엔딩
					if(myDama.math>=90) {
						System.out.println(myDama.name + "이/가 드디어 수학자가 되었습니다!");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("이제는 독립을 할 시기가 된 것 같습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("잘있어! "+myDama.name + "END");
						break;
					}					
				}
				if((myDama.health>=20)&&(myDama.health<=40)) { //과학자 엔딩
					if(myDama.science>=90) {
						System.out.println(myDama.name + "이/가 드디어 과학자가 되었습니다!");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("이제는 독립을 할 시기가 된 것 같습니다");
						try { Thread.sleep(1500); } catch (InterruptedException e) {}
						System.out.println("잘있어! "+myDama.name + "END");
						break;
					}					
				}
				if(myDama.injury >=25) { //부상으로 인한 엔딩
					System.out.println(myDama.name +"이/가 잦은 부상으로 더이상 운동을 할 수 없는 몸이 되었습니다");
					try { Thread.sleep(1500); } catch (InterruptedException e) {}
					System.out.println(myDama.name +"이/가 실의에 빠져 시름시름 앓다가 죽었습니다");
					try { Thread.sleep(1500); } catch (InterruptedException e) {}
					System.out.println("부디 천국에서는 좋아하는 운동을 맘껏 할 수 있기를... END");
					break;
				}
				if(myDama.slump >=25) { //슬럼프로 인한 엔딩
					System.out.println(myDama.name +"이/가 잦은 슬럼프로 더이상 공부에 흥미를 잃었습니다");
					try { Thread.sleep(1500); } catch (InterruptedException e) {}
					System.out.println(myDama.name +"이/가는 방구석 폐인이 되어 더이상 아무것도 안하고있습니다");
					try { Thread.sleep(1500); } catch (InterruptedException e) {}
					System.out.println("END");
					break;
				}
				System.out.println("--------------------------------------");
	            System.out.println("1 밥을 준다         2 같이 놀아준다");	            
	            System.out.println("3 운동을 시킨다    4 공부를 시킨다");	            
	            System.out.println("5 재운다             6 문제를 풉니다 ");
	            System.out.println("9 다마의 스테이터스를 봅니다   0 다마고치를 종료합니다");
	            System.out.println("--------------------------------------");
	            set=scan.nextInt();
	            int ram = rand.nextInt(100)+1; //랜덤 변수생성
	            
	            label:if(set==1) { //label 랜덤문에서 중첩을 일으키지 않고 빠져나온다           		
            		System.out.println("무엇을 먹을까요 1 한식 2 중식 3 일식");
            		set=scan.nextInt();
            		
            		if(set==1) {
            			if(ram<=10) { //10% 확률로 편식을 한다
            				System.out.println(myDama.name + "이/가 편식을 합니다");  
            				myDama.noEat();
            				myDama.marry();
            				break label;
            			}           			
            			System.out.println(myDama.name + "/이가 한식을 먹고 있습니다\n한국인의 밥상입니다");
            			try { Thread.sleep(1000); } catch (InterruptedException e) {}
            			myDama.eat(3);
            		}
            		else if(set==2) {
            			if(ram<=10) { //10% 확률로 편식을 한다
            				System.out.println(myDama.name + "이/가 편식을 합니다");  
            				myDama.noEat();
                    		myDama.marry();
            				break label;
            			}
            			System.out.println(myDama.name + "/이가 중식을 먹고 있습니다\n볶음밥은 중국 음식인걸까");
            			try { Thread.sleep(1000); } catch (InterruptedException e) {}
            			myDama.eat(3);
            		}            		            		
            		else if(set==3) {
            			if(ram<=10) { //10% 확률로 편식을 한다
            				System.out.println(myDama.name + "이/가 편식을 합니다");  
            				myDama.noEat();
            				myDama.marry();
            				break label;
            			}
            			System.out.println(myDama.name + "/이가 일식을 먹고 있습니다\n일본에 한걸음 더 가까워진듯한 느낌이 듭니다");
            			try { Thread.sleep(1000); } catch (InterruptedException e) {}
            			myDama.eat(3);
            		}
            		
            	}
            		
            		else if(set==2) {
	            		System.out.println("무엇을 하고 놀까요? 1 장난감 놀이 2 소꿉놀이 3 모노폴리");
	            		set=scan.nextInt();	   
	            		
	            		if(set==1) {
	            			if(ram<=10) { //10% 확률
	            				System.out.println(myDama.name + "이/가의 장간감이 망가졌습니다");  
	            				myDama.destroy();
	            				break label;
	            			}
	            			System.out.println(myDama.name + "이/가 장난감 놀이를 하고 있습니다 \n장난감이 불쌍해 보입니다");
	            			try { Thread.sleep(1000); } catch (InterruptedException e) {}
	            			myDama.feeling(3);
	            		}
	            		else if(set==2) {
	            			if(ram<=10) { //10% 확률
	            				System.out.println(myDama.name + "이혼을 선고받았습니다");  
	            				myDama.destroy();
	            				break label;
	            			}
	            			System.out.println(myDama.name + "이/가 소꿉놀이를 하고 있습니다 \n흥미진진한 스토리군요");
	            			try { Thread.sleep(1000); } catch (InterruptedException e) {}
	            			myDama.feeling(3);
	            		}
	            		else if(set==3) {
	            			if(ram<=10) { //10% 확률
	            				System.out.println(myDama.name + "빠르게 파산했습니다");  
	            				myDama.destroy();
	            				break label;
	            			}
	            			System.out.println(myDama.name + "이/가 모노폴리를 하고 있습니다 \n저는 할 줄 모릅니다");
	            			try { Thread.sleep(1000); } catch (InterruptedException e) {}
	            			myDama.feeling(3);
	            		}
	            		
	            	}
	            	
	            	else if(set==3) {
	            		System.out.println("무엇을 할까요? 1 수영 2 달리기 3 축구");
	            		set=scan.nextInt();	
	            			if(set==1) {
	            				if(ram<=10) { //10% 확률
		            				System.out.println(myDama.name + "이/가 수영중 입니다");  
		            				myDama.injury();
		            				break label;
		            			}
	            				System.out.println("수영을 하고 있습니다");
	            				myDama.swim();
	            				myDama.exp(40);
	            				myDama.age();
	            				myDama.marry();
	           
	            			}
	            			else if(set==2) {
	            				if(ram<=10) { //10% 확률
		            				System.out.println(myDama.name + "이/가 달리기중 입니다");  
		            				myDama.injury();
		            				myDama.marry();
		            				break label;
		            			}
	            				System.out.println("달리기를 하고 있습니다");
	            				myDama.run();
	            				myDama.exp(40);
	            				myDama.age();	
	            				myDama.marry();
	            			}
	            			else if(set==3) {
	            				if(ram<=10) { //10% 확률
		            				System.out.println(myDama.name + "이/가 축구연습중 입니다");  
		            				myDama.injury();
		            				break label;
		            			}
	            				System.out.println("축구를 하고 있습니다");
	            				myDama.soccer();
	            				myDama.exp(40);
	            				myDama.age();	 
	            				myDama.marry();
	            			}
	            		
	            		
	            	}   
	            	else if(set==4) {
	            		System.out.println("무엇을 할까요? 1 국어 2 수학 3 과학");
	            		set=scan.nextInt();	
            			if(set==1) {
            				if(ram<=10) { //10% 확률
	            				System.out.println(myDama.name + "이/가 국어 공부중입니다");  
	            				myDama.slump();
	            				break label;
	            			}
            				System.out.println("국어공부를 하고 있습니다");
            				myDama.language();
            				myDama.marry();
            				
            					       					            				
            			}
            			else if(set==2) {
            				if(ram<=10) { //10% 확률
	            				System.out.println(myDama.name + "이/가 수학공부중 입니다");  
	            				myDama.slump();
	            				break label;
	            			}
            				System.out.println("수학공부를 하고 있습니다");
            				myDama.math();
            				myDama.marry();
            					       					            				
            			}
            			else if(set==3) {
            				if(ram<=10) { //10% 확률
	            				System.out.println(myDama.name + "이/가 과학공부중 입니다");  
	            				myDama.slump();
	            				break label;
	            			}
            				System.out.println("과학공부를 하고 있습니다");
            				myDama.science();
            				myDama.marry();
            				
            				       					            				
            			}
            		
            		
            	   
	            	}
	            	else if(set==5) {
	            		System.out.println(myDama.name +"를 재웁니다");
	            		myDama.sleep();
	            	}
	            	else if(set==6) {
	            		System.out.println(myDama.name +"이/가 문제를 풉니다");
	            		myDama.exam();
	            		myDama.marry();
	            	}
	            	else if(set==9) {
	            		myDama.printDama();
	            		try { Thread.sleep(3000); } catch (InterruptedException e) {}
	            	}
	            	else if(set==0) {
	            		System.out.println("1조의 다마고치를 즐겨주셔서 감사합니다!!");	        
	            		System.out.println("제작자: 임홍기, 김주은, 오상민");
	            		break;
	            	}        
	            	else{
	         			  System.out.println("잘못 선택했습니다");  
	            	}
			}
	}
}