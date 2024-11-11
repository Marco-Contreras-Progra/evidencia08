package com.example;

public class Main {
        public static void main(String[] args) {
            //creacion de equipo
            Equipo equipo1 = new Equipo("Electrics de Marsella");
             //creacion de jugadores
            Jugador jugador1 = new Jugador("Marco", "1");
            Jugador jugador2 = new Jugador("Panchito", "2");
    
            //Agregar jugadores al equipo
            equipo1.agregarJugador(jugador1);
            equipo1.agregarJugador(jugador2);

            //mostrar jugadores en el equipo
            equipo1.listarJugadores();

            //eliminar jugadores
            equipo1.eliminarJugador(jugador1);
            equipo1.eliminarJugador(jugador2);
            equipo1.listarJugadores();

             // Cambiar capitán
        equipo1.agregarJugador(jugador2);
        equipo1.asignarCapitan(jugador2);
        equipo1.listarJugadores();
    
    }
}
