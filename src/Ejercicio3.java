public class Ejercicio3 {}

class Vehiculo {
    String marca;
    String modelo;
    private int velocidadMaxima = 120;
    int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public int acelerar(int kmsAcelerado) {
        if (this.velocidadActual + kmsAcelerado > this.velocidadMaxima) {
            return this.velocidadMaxima;
        } else {
            this.velocidadActual += kmsAcelerado;
            return this.velocidadActual;
        }
    }

    public int frenar(int kmsFrenados) {
        if (kmsFrenados > 0) {
           System.out.println("para frenar tiene que ser negativo");
            return this.velocidadActual;
        } else if (this.velocidadActual + kmsFrenados < 0) {
            return 0;
        } else {
            this.velocidadActual += kmsFrenados;
            return this.velocidadActual;
        }
    }

    public static void main(String[] args) {
        Vehiculo newInstance = new Vehiculo("Toyota", "Corolla", 110);

        System.out.println(newInstance.acelerar(15));
        System.out.println(newInstance.frenar(-105));
    }
}
