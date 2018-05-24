package com.example.raiski.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		final MusicList myMusic = new MusicList();


		myMusic.addToMusicList(new Music(getString(R.string.song1_title),
				getString(R.string.song1_artist), getString(R.string.song1_album),
				getString(R.string.song1_info)));

		myMusic.addToMusicList(new Music(getString(R.string.song2_title),
				getString(R.string.song2_artist), getString(R.string.song2_album),
				getString(R.string.song2_info)));

		myMusic.addToMusicList(new Music(getString(R.string.song3_title),
				getString(R.string.song3_artist), getString(R.string.song3_album),
				getString(R.string.song3_info)));

		MusicAdapter adapter = new MusicAdapter(this, myMusic.getMusic());

		final ListView listView = (ListView) findViewById(R.id.list);

		listView.setAdapter(adapter);

		// Create a message handling object as an anonymous class.
		AdapterView.OnItemClickListener mMessageClickedHandler =
				new AdapterView.OnItemClickListener() {
					public void onItemClick(AdapterView parent, View v, int position, long id) {

						Intent intent = new Intent(MainActivity.this, MusicPlayerActivity.class);
						intent.putExtra("Song", myMusic.getSongName(position));
						intent.putExtra("Artist", myMusic.getArtistName(position));
						intent.putExtra("Album", myMusic.getAlbumName(position));
						intent.putExtra("Info", myMusic.getInfo(position));
						intent.putExtra("Position", position);

						startActivity(intent);
					}
				};

		listView.setOnItemClickListener(mMessageClickedHandler);

	}
}
