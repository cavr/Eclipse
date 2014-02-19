package com.example.monkeyqueen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MonkeyQueen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_monkey_queen);
		Button boton = (Button) findViewById(R.id.botonJugar);
		boton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(MonkeyQueen.this, Tablero.class);
				EditText campoNombre = (EditText) findViewById(R.id.campoTexto);
				Bundle campos = new Bundle();
				campos.putString("JUGAdOR", campoNombre.getText().toString());
				intent.putExtras(campos);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.monkey_queen, menu);
		return true;
	}

}
