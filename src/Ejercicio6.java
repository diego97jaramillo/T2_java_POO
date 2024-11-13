import java.util.ArrayList;

public class Ejercicio6 {}

class Contacto {
    String nombre;
    long telefono;
    String email;


    public Contacto(String nombre, long telefono, String email) {
        this.nombre = nombre.toLowerCase();
        this.telefono = telefono;
        this.email = email;
    }

    public static void main(String[] args) {
        Contacto numero1 = new Contacto("pepe", 3147483647L, "pepe@gmail.com" );
        Contacto numero2 = new Contacto("lizzy", 3164865974L, "lizzy@gmail.com");

        Agenda.addContact(numero1);
        Agenda.addContact(numero2);
        System.out.println(Agenda.findContact("lizzy" ));
        Agenda.deleteContact("pepe");
    }

    public String getName() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", telefono: " + telefono + ", email: " + email;
    }
}

class Agenda {
    static ArrayList<Contacto> listaContactos = new ArrayList<>();

    public Agenda() {}

    public static void addContact(Contacto contact) {
        listaContactos.add(contact);
        for (int i = 0; listaContactos.size() > i; i++) {
            System.out.println(listaContactos.get(i).toString());
        }
    }

    public static void deleteContact(String name) {
        for (int i = 0; listaContactos.size() > i; i++) {
            if (listaContactos.get(i).getName() == name.toLowerCase()) {
                listaContactos.remove(listaContactos.get(i));
                for (int j = 0; listaContactos.size() > j; j++) {
                    System.out.println("Lista filtrada: " + listaContactos.get(j).toString());
                }
            }
        }
    }

    public static String findContact(String name) {
        Contacto result;
        for (int i = 0; listaContactos.size() > i; i++) {
            if (listaContactos.get(i).getName() == name.toLowerCase()) {
                return listaContactos.get(i).toString();
            }
        }
        return null;
    }
}
