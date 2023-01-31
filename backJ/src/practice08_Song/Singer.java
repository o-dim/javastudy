package practice08_Song;

import java.util.Iterator;

public class Singer {
	private String name;
	private Song[] songs;
	private int idx;
	
	public Singer(String name, int count) {
		super();
		this.name = name;
		songs = new Song[count];
	}
	
	public void addSong(Song song) {
		if(idx == songs.length) {
			System.out.println("더 이상 노래를 추가할 수 없습니다");
			return;
		}
		if(song != null) {
			songs[idx++] = songs;
			System.out.println(song.getTitle() + " 노래를 추가하였습니다.");
		}
	}
	
	public void changeSong(String title, Song song) {
		if(idx == 0) {
			System.out.println("등록된 노래가 없습니다");
			return;
		}
		if (title != null && song != null) {
			for(int i = 0; i < idx; i++) {
				if(title.equals(songs[i].getTitle())) {
					songs[i] = song;
					return;
				}
			}
		}
		System.out.println(title + "노래가 존재하지 않습니다.");
	}
	
	public void info() {
		System.out.println("가수 이름 : " + name);
		System.out.println("대표곡 목록");
		for(int i = 0; i < idx; i++) {
			System.out.println(songs[i]);
		}
		
	}
	
}
