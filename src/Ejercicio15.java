import java.util.ArrayList;
import java.util.List;

public class Ejercicio15 {
    public static void main(String[] args) {
        Flota.setVehiculo("Nissan", "GTR", 140000);
        Flota.setVehiculo("Toyota", "Supra", 180000);
        System.out.println(Flota.listaFlota.get(0).toString());
        System.out.println(Flota.listaFlota.get(1).toString());
    }
}

class Vehiculo15 {
    String marca;
    String modelo;
    int kilometraje;
    String mantenimiento;

    public Vehiculo15(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.mantenimiento = "5 mil kms";

    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " con " + kilometraje + "kms, y tiene el mantinimiento de " + this.mantenimiento;
    }
}

class Flota {
     static List<Vehiculo15> listaFlota= new ArrayList<>();

    public static void setVehiculo(String marca, String modelo, int kilometraje) {
        Flota.listaFlota.add(new Vehiculo15(marca, modelo, kilometraje));
    }
}
