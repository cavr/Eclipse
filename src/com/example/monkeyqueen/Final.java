package com.example.monkeyqueen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.partidafinalizada);
		TextView campoTexto = (TextView)(findViewById(R.id.campoFinaL));
		campoTexto.setText(getIntent().getCharArrayExtra("Resultado").toString());
	}	
}
