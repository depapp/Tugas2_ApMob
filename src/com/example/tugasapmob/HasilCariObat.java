package com.example.tugasapmob;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilCariObat extends Activity {
	private TextView judul_obat;
	private TextView deskripsi_obat;
	private String hasil_cari_obat="";
	private String hasil_cari_obat2="";
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout2);
		judul_obat = (TextView) findViewById(R.id.judul_obat);
		deskripsi_obat = (TextView) findViewById(R.id.deskripsi_obat);
		
		Intent i = getIntent();
		hasil_cari_obat = i.getStringExtra("judul_obat");
		judul_obat.setText(hasil_cari_obat);
		
		Intent j = getIntent();
		hasil_cari_obat2 = j.getStringExtra("deskripsi_obat");
		deskripsi_obat.setText(hasil_cari_obat2);
	}
	
}
