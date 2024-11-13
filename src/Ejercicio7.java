import java.util.Scanner;

public class Ejercicio7  {
    String nombre;
    int[] listaNotas = new int[6];

    public Ejercicio7(String nombre) {
        this.nombre = nombre;
    }

    public void addNotes() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listaNotas.length; i++) {
            System.out.println("Escribe la nota a agregar (1-10): ");
            listaNotas[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public Float promedio() {
        int total = 0;
        for(int nota: listaNotas) {
            total += nota;
        }
        return (float) total / listaNotas.length;
    }

    public String aprobado(float promedio) {
        if (promedio >= 6.0) {
            return "Aprobo el panita";
        } else return "No aprobó el panita";
    }

    public static void main(String[] args) {
        Ejercicio7 newEstudiante = new Ejercicio7("pedrolas");

        newEstudiante.addNotes();
        float promedio = newEstudiante.promedio();
        System.out.println(newEstudiante.aprobado(promedio));

    }
}
