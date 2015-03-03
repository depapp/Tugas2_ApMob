package com.example.tugasapmob;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TambahObat extends Activity {

	private EditText nama_obat;
	private EditText deskripsi_obat;
	private Button button_tambah;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout3);

		nama_obat = (EditText) findViewById(R.id.namaTambahObat);
		deskripsi_obat = (EditText) findViewById(R.id.deskripsi_obat);
		button_tambah = (Button) findViewById(R.id.button_tambah);
		
		button_tambah.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(TambahObat.this, HasilCariObat.class);
				i.putExtra("judul_obat", nama_obat.getText().toString());
				i.putExtra("deskripsi_obat", deskripsi_obat.getText().toString());
				startActivity(i);
			}
		});
	}
}
