public class Ejercicio14 {
    public static void main(String[] args) {
        PagoEfectivo pago1 = new PagoEfectivo();
        PagoTarjeta pago2 = new PagoTarjeta();

        System.out.println(pago1.procesarPago());
        System.out.println(pago2.procesarPago());

    }
}

class Pago {
    public String procesarPago() {
        return "";
    }
}

class PagoTarjeta extends Pago {
    public PagoTarjeta() {}

    public String procesarPago() {
        return "Procesado y pagado con tarjeta.";
    }
}

class PagoEfectivo extends Pago {
    public PagoEfectivo() {}
    public String procesarPago() {
        return "Procesado y pagado con efectivo.";
    }
}