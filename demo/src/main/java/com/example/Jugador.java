package com.example;

public class Jugador {
	private String nombre;
    private String rut;
    private Equipo equipo;
    private boolean esCapitan = false;

	public Jugador(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

   public void asignarEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void establecerCapitan() {
        this.esCapitan = true;
    }
	public String getNombre() {
        return nombre;
    }
}