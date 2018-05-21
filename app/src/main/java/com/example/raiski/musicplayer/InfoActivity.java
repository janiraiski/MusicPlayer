package com.example.raiski.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);

		Intent intent = getIntent();

		String artist = intent.getStringExtra("InfoArtist");
		String info = intent.getStringExtra("Info");

		TextView artistName = (TextView) findViewById(R.id.info_artist_name_text_view);
		TextView artistInfo = (TextView) findViewById(R.id.info_text_view);

		artistName.setText(artist);
		artistInfo.setText(info);

	}

}
