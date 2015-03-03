package com.example.tugasapmob;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CariObat extends Activity {

	private Button button_cari;
	private EditText nama_obat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout1);

		nama_obat = (EditText) findViewById(R.id.nama_obat);
		button_cari = (Button) findViewById(R.id.button_cari);

		button_cari.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(CariObat.this, HasilCariObat.class);
				i.putExtra("judul_obat", nama_obat.getText().toString());
				startActivity(i);
			}
		});
	}

}
