package guessingmusic;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player; //외부 라이브러리 파일을 불러오는게 가능하게 만들어줌

public class MusicPlayer extends Thread {
	
	private Player player;
	protected boolean isLoop; // 음악을 틀고 끌 수 있는 trun on/off
	
	
	protected void setLoop(boolean isLoop) {
		this.isLoop = isLoop;
	}

	private File file; // file을 저장
	private FileInputStream fis;// 더블 버퍼링 기법 처음에 로딩을 할 파일을 담음, 불러올 때 시간이 있는데 똑같은걸 버퍼에다가 담아두어 버퍼에 있는걸 플레이어에 넣음
	private BufferedInputStream bis;//

	public MusicPlayer(String name, boolean isLoop) { // 파일 불러오는 생성자 생성
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name + ".mp3").toURI());// 파일을 불러옴
			fis = new FileInputStream(file); // fis에 파일을 담을
			bis = new BufferedInputStream(fis); // fis에 있는 파일을 불러옴
			player = new Player(bis); //
		} catch (Exception e) {
			System.out.println("노래를 찾을 수 없습니다");// 콘솔창에 어디에서 오류가 났는지 알려주는 메서드
		}

	}
	
	

	@Override
	public void run() { // run 메서드
		try {
			do {
				player.play();// player에 있는 mp3파일 실행
				fis = new FileInputStream(file);// 더블버퍼링구조 = 미리불러온것을 플레이어에 넣음 why? 실행할때 바로불러오면 실행시간이 긺
				bis = new BufferedInputStream(fis);
				player = new Player(bis); // stream-파일을 불러오는데 시간이 걸림 ->불러오기전에 bis라는 공간에 mp3파일을 담아놓고 player가 종료가 되면
											// file로딩시간없이
											// 파일을 불러오고 재생시키면 또 다른 파일을 미리 불러옴 = 다음에 나올걸 미리 불러와서 가져옴 bis->fis GUI의 수직동기화
											// 기법과 유사
			} while (isLoop);// 반복여부
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition();
	}

	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
/*	public void startbutton() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while (isLoop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}*/
}
