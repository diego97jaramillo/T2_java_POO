public class Ejercicio10 {}

class Empleado {
    String nombre;
    long salarioBase;
    int anosExperiencia;

    public Empleado(String nombre, long salarioBase, int anosExperiencia) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.anosExperiencia = anosExperiencia;
    }

    public float calcularBono() {
        float resultBono = (float) (this.salarioBase * this.anosExperiencia * 0.05);
        return resultBono;
    }

    public static void main(String[] args) {
        Empleado newEmployee = new Empleado("Juan Ca", 150000L, 5);

        System.out.println(newEmployee.calcularBono());
    }
}
