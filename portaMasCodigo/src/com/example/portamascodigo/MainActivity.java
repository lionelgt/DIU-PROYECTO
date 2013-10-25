package com.example.portamascodigo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageButton d=(ImageButton)findViewById(R.id.imageButton1);
		d.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent a= new Intent(getApplicationContext(),actividadDirectorio.class);
				startActivity(a);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
