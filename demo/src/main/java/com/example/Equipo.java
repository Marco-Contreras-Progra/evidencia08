package com.example;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    private Jugador capitan; 

	public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

	public void agregarJugador(Jugador jugador) {
        if (!jugadores.contains(jugador)) {
            jugadores.add(jugador);
            jugador.asignarEquipo(this);
        }
    }
    

    public void asignarCapitan(Jugador jugador) {
        if (jugadores.contains(jugador)) {
            this.capitan = jugador;
            jugador.establecerCapitan();
        }
    }
	public void listarJugadores() {
        System.out.println("Jugadores en el equipo " + nombre + ":");
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en este equipo.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println("- " + jugador.getNombre() + (jugador.equals(capitan) ? " (Capitán)" : ""));
            }
        }
    }
	public void eliminarJugador(Jugador jugador) {
        if (jugadores.contains(jugador)) {
            jugadores.remove(jugador);
            jugador.asignarEquipo(null);
        }
    }

}