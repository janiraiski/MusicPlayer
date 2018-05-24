package com.example.raiski.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

	TextView artistName;
	TextView artistInfo;

	String artist;
	String info;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);

		artistName = (TextView) findViewById(R.id.info_artist_name_text_view);
		artistInfo = (TextView) findViewById(R.id.info_text_view);

		Intent intent = getIntent();

		artist = intent.getStringExtra("InfoArtist");
		info = intent.getStringExtra("Info");

		artistName.setText(artist);
		artistInfo.setText(info);

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString("artist", artist);
		outState.putString("info", info);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		artist = savedInstanceState.getString("artist");
		info = savedInstanceState.getString("info");
	}

}
