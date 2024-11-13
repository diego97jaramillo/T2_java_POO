enum Sexo {masculino, femenino
}

public class Ejercicio4 {}

class Persona {

    String nombre;
    int edad;
    Sexo sexo;

    public Persona( String nombre, int edad, String sexo ) {
        this.nombre = nombre;
        this.edad = edad;

        try {
            this.sexo = Sexo.valueOf(sexo.toLowerCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Sexo invalido: " + sexo.toLowerCase());
            this.sexo = null;
        }
    }

    public static String comparacion(Persona person1, Persona person2) {
        if (person2.edad == person1.edad){
            return "Son de la misma edad";
        } else if (person2.edad > person1.edad) {
            return person2.nombre + " es mayor que " + person1.nombre;
        } else {
            return person1.nombre + " es mayor que " + person2.nombre;
        }
    }

    public static void main(String[] args) {
        Persona newInstance1 = new Persona("pepe", 40 ,"masculino" );
        Persona newInstance2 = new Persona("lili", 25 ,"femenino" );
        System.out.println(newInstance1.sexo);

        System.out.println(Persona.comparacion(newInstance1, newInstance2));

    }
}
