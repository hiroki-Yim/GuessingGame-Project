package guessingmusic;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<MusicPlayer> player = new ArrayList<MusicPlayer>();
		String [] musiclist = {"안재욱_친구.mp3","김연우_이별택시.mp3","러블리즈_achoo.mp3",
				"백지영_사랑안해.mp3","볼빨간사춘기_썸탈거야.mp3","오마이걸_liarliar.mp3","트와이스_tt.mp3"};
		for(int i = 0 ; i < musiclist.length ; i++) {
			player.add(new MusicPlayer(musiclist[i],false));
		}
			player.get(4).start();
	}
}
