package com.example.raiski.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MusicPlayerActivity extends AppCompatActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music_player);

		Intent intent = getIntent();

		final String playingSong = intent.getStringExtra("Song");
		final String playingArtist = intent.getStringExtra("Artist");
		final String playingAlbum = intent.getStringExtra("Album");
		final String info = intent.getStringExtra("Info");
		String playingPosition = intent.getStringExtra("Position");

		Button infoButton = (Button) findViewById(R.id.artist_info_button);
		final Button exploreButton = (Button) findViewById(R.id.explore_button);

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

		exploreButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent exploreIntent = new Intent(MusicPlayerActivity.this, MainActivity.class);


				startActivity(exploreIntent);
			}
		});

	}

	public void previousSong(int i) {
		i--;


	}

	public void nextSong(int i) {

	}
}
