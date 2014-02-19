package com.example.monkeyqueen;

import android.content.Context;
import android.widget.Button;

public class Posicion extends Button{
	
	private int fila;
	private int columna;
	private String estado; //Liberada //MonoA //Bebe //MonoB

	public Posicion(Context context, int fila, int columna, String estado) {
		super(context);
		this.fila = fila;
		this.columna = columna;
		this.estado = estado;	
		// TODO Auto-generated constructor stub
	}
	
	
	public void setFila(int fila){
		this.fila = fila;
	}
	
	
	public void setColumna(int columna){
		this.columna = columna;
	}
	
	
	public void setEstado(String estado){
		this.estado= estado;
	}
	
	
	public int getFila()
	{
		return fila;
	}
	
	
	public int getColumna()
	{
		return columna;
	}
	
	public String getEstado()
	{
		return estado;
	}
	
	
	

}
