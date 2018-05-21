package com.example.raiski.musicplayer;

/**
 * Created by raiski on 16/05/2018.
 */

public class Music {

	private String mSong;
	private String mArtist;
	private String mAlbum;
	private String mInfo;

	public Music(String song, String artist, String album, String info) {
		mSong = song;
		mArtist = artist;
		mAlbum = album;
		mInfo = info;
	}

	public String getSong() {
		return mSong;
	}

	public String getArtist() {
		return mArtist;
	}

	public String getAlbum() {
		return mAlbum;
	}

	public String getInfo() {
		return mInfo;
	}

}
