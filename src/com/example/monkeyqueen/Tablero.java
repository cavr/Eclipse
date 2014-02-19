package com.example.monkeyqueen;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableRow;

public class Tablero extends Activity {
	private boolean onClick = false;
	private Posicion onClickPosicion = null;
	private ArrayList<Posicion> posicionesTablero;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tablero);
		ArrayList<Posicion> posicionesTablero = new ArrayList<Posicion>();
		for (int i = 0; i < 12; i++) {
			TableRow columnaCorrespondiente = new TableRow(this);
			for (int j = 0; j < 12; j++) {
				Posicion posicionCorrespondiente = new Posicion(this, i, j,
						"liberada");

				posicionCorrespondiente
						.setOnClickListener(new OnClickListener() {

							@Override
							public void onClick(View v) {

								// TODO Auto-generated method stub

								casillaPresionada(v);

							}

						});
				posicionesTablero.add(posicionCorrespondiente);
				columnaCorrespondiente.addView(posicionCorrespondiente);
			}
			this.addContentView(columnaCorrespondiente, null);
		}
	}

	private void casillaPresionada(View view) {

		if (onClick) {
			Juego.nuevaJugada((Posicion) view, onClickPosicion,
					posicionesTablero);
			onClick = false;
		} else {
			onClick = true;
			onClickPosicion = (Posicion) view;
		}
	}

}
