package com.example.raiski.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MusicPlayerActivity extends AppCompatActivity {

	String playingSong;
	String playingArtist;
	String playingAlbum;
	String info;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music_player);

		Intent intent = getIntent();

		playingSong = intent.getStringExtra("Song");
		playingArtist = intent.getStringExtra("Artist");
		playingAlbum = intent.getStringExtra("Album");
		info = intent.getStringExtra("Info");
		String playingPosition = intent.getStringExtra("Position");

		Button infoButton = (Button) findViewById(R.id.artist_info_button);

		TextView song = (TextView) findViewById(R.id.song_name_text_view);
		TextView artist = (TextView) findViewById(R.id.artist_name_text_view);
		TextView album = (TextView) findViewById(R.id.album_name_text_view);

		song.setText(playingSong);
		artist.setText(playingArtist);
		album.setText(playingAlbum);

		infoButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent infoIntent = new Intent(MusicPlayerActivity.this, InfoActivity.class);

				infoIntent.putExtra("InfoArtist", playingArtist);
				infoIntent.putExtra("Info", info);

				startActivity(infoIntent);
			}
		});

	}

	public void previousSong(int i) {

	}

	public void nextSong(int i) {

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString("playingSong", playingSong);
		outState.putString("playingArtist", playingArtist);
		outState.putString("playingAlbum", playingAlbum);
		outState.putString("info", info);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		playingSong = savedInstanceState.getString("playingSong");
		playingArtist = savedInstanceState.getString("playingArtist");
		playingAlbum = savedInstanceState.getString("playingAlbum");
		info = savedInstanceState.getString("info");
	}
}
