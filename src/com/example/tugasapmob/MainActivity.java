package com.example.tugasapmob;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void klikCari(View v) {
		Intent intentcariobatview = new Intent(this, CariObat.class);
		startActivity(intentcariobatview);
	}
	
	public void klikTambah(View v) {
		Intent intenttambahobatview = new Intent(this, TambahObat.class);
		startActivity(intenttambahobatview);
	}
	
}
