import java.util.ArrayList;

public class Ejercicio19 {
    public static void main(String[] args) {
        reservaciones.reservar("2025-01-22", 2, "pepe", 25);
        reservaciones.reservar("2025-01-22", 2, "luisa", 28);
        reservaciones.cancelarReserva("pepe");
        reservaciones.reservar("2025-01-22", 2, "luisa", 28);
        reservaciones.reservar("2025-01-15", 1, "maria", 32);
        reservaciones.listarReservas();
        reservaciones.reservar("2025-01-10", 1, "pedro", 22);
    }
}


class reservaciones {
    static ArrayList<Reserva> listaReservas = new ArrayList<>();

    public static boolean reservar(String fecha, int numAsiento, String nombre, int edad) {
        for(Reserva item : reservaciones.listaReservas) {
            if (item.numAsiento == numAsiento) {
                System.out.println("No esta disponible esa silla. ");
                return false;
            }
        }
        Pasajero nombrePasajero = new Pasajero(nombre, edad);
        Reserva reservaPasajero = new Reserva(fecha, numAsiento, nombrePasajero);
        reservaciones.listaReservas.add(reservaPasajero);
        System.out.println("Ya esta lista la reserva.");
        return true;
    }

    public static boolean cancelarReserva (String nombre) {
        for(Reserva item : reservaciones.listaReservas) {
            if (item.pasajero.nombre.equals(nombre)) {
                reservaciones.listaReservas.remove(item);
                System.out.println("Reserva de: " + item.pasajero.nombre + " Eliminado");
                return true;
            }
        }
        System.out.println("No hay reserva con ese nombre");
        return false;
    }

    public static void listarReservas() {
        for(Reserva item : reservaciones.listaReservas) {
            System.out.println(item.mostrar());
        }
    }
}

class Reserva {
    String fecha;
    int numAsiento;
    Pasajero pasajero;

    public Reserva(String fecha, int numAsiento, Pasajero pasajero) {
        this.fecha = fecha;
        this.numAsiento = numAsiento;
        this.pasajero = pasajero;
    }

    public String mostrar() {
        return "reserva de: " + pasajero.nombre + " con silla numero: " + numAsiento + " para el dia " + fecha;
    }
}

class Pasajero {
    String nombre;
    int edad;
    public Pasajero (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}