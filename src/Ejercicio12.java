public class Ejercicio12 {
    public static void main(String[] args) {
        Mago maG = new Mago("maG", 10);
        Guerrero zelda = new Guerrero("Zelda", 7);

        System.out.println(maG.ataque(zelda.nombre));
        System.out.println(zelda.ataque(maG.nombre, maG.nivel));
    }
}

class Personaje {
    String nombre;
    int nivel;

    public Personaje(String nombre, int nivel) {
        this.nivel = nivel;
        this.nombre = nombre;
    }

    public String ataque() {
        return "un ataque simple";
    }
}

class Guerrero extends Personaje {
    String habilidad;
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
        this.habilidad = "toque al estilo esgrima";
    }
    public String ataque(String nombre, int nivel) {
        return "atacó a: " + nombre + " de nivel " + nivel + " con su habilidad: " + this.habilidad;
    }
}

class Mago extends Personaje{
    String habilidad;
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
        this.habilidad = "encantamiento esclavitud";
    }

    public String ataque(String nombre) {
        return "atacó a: " + nombre + " con su habilidad: " + this.habilidad;
    }
}
