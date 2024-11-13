public class Ejercicio18 {
    public static void main(String[] args) {
        Empleado18 trabajador1 = new Empleado18();
        Empleado18 trabajador2 = new Empleado18();
        Empleado18 trabajador3 = new Empleado18();

        trabajador1.registrarHoras(40);
        trabajador2.registrarHoras(35);
        trabajador3.registrarHoras(50);

        System.out.println("El pago de la semana es: " + ControlDeHoras.pagoSemanal(trabajador1.horasTrabajadas));
        System.out.println("El pago de la semana es: " + ControlDeHoras.pagoSemanal(trabajador2.horasTrabajadas));
        System.out.println("El pago de la semana es: " + ControlDeHoras.pagoSemanal(trabajador3.horasTrabajadas));
    }
}

class Empleado18 {
    int horasTrabajadas;
    public Empleado18() {}

    public int registrarHoras(int horas) {
        this.horasTrabajadas += horas;
        return this.horasTrabajadas;
    }
}

class ControlDeHoras {
    final static int pagoXhora = 7;
    final static int pagoXhoraExtra = 15;
    final static int horasXsemana = 40;

    public static int pagoSemanal(int horasXsemanasTrabajadas) {
        int pago = 0;
        if (horasXsemana < horasXsemanasTrabajadas) {
            pago = horasXsemana * pagoXhora + (horasXsemanasTrabajadas-horasXsemana) * pagoXhoraExtra;
        } else {
            pago = horasXsemanasTrabajadas * pagoXhora;
        }
        return pago;
    }
}