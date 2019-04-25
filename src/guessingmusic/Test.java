package guessingmusic;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<MusicPlayer> player = new ArrayList<MusicPlayer>();
		String[] musiclist = { "friend.mp3", "missyou.mp3", "achoo.mp3", "love.mp3", "some.mp3", "liarliar.mp3",
				"tt.mp3" };
		for (int i = 0; i < musiclist.length; i++) {
			player.add(new MusicPlayer(musiclist[i], false));
		}
		player.get(4).start();
	}
}
