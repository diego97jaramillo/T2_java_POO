public class Ejercicio11 {
    public static void main(String[] args) {
        Moto yz = new Moto("AGV","Yamaha", "Blanca");
        System.out.println(yz.getProperties());
    }
}

class VehiculoMaster {
    String marca;
    String color;

    public VehiculoMaster(String marca, String color) {
        this.color = color;
        this.marca = marca;
    }
}

class Moto extends VehiculoMaster {
    String tipoCasco;
    public Moto(String tipoCasco, String marca, String color) {
        super(marca, color);
        this.tipoCasco = tipoCasco;
    }

    public String getProperties() {

        return "Color: " + this.color + ". Marca: " + super.marca + ". Tipo de casco: " + this.tipoCasco + ".";
    }
}