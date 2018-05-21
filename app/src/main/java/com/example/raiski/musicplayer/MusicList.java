package com.example.raiski.musicplayer;

import java.util.ArrayList;

public class MusicList {

	private ArrayList<Music> musics = new ArrayList<Music>();

	public void setMusic(ArrayList musics) {
		this.musics = musics;
	}

	public ArrayList getMusic() {
		return musics;
	}

	public String getSongName(int i) {
		return musics.get(i).getSong();
	}

	public String getArtistName(int i) {
		return musics.get(i).getArtist();
	}

	public String getAlbumName(int i) {
		return musics.get(i).getAlbum();
	}

	public String getInfo(int i) {
		return musics.get(i).getInfo();
	}

	public void addToMusicList(Music music) {
		musics.add(music);
	}


}
