public class Ejercicio13 {
    public static void main(String[] args) {
        Perro newPerro = new Perro();
        Gato newGato = new Gato();
        Pajaro newPajaro = new Pajaro();

        System.out.println(newPerro.hacerSonido());
        System.out.println(newGato.hacerSonido());
        System.out.println(newPajaro.hacerSonido());
    }
}

class Animal {

    public Animal() {}

    public String hacerSonido() {
        return "";
    }
}

class Perro extends Animal {
    public Perro() {}

    public String hacerSonido() {
        return "Guau";
    }
}

class Gato extends Animal {
    public Gato() {}
    public String hacerSonido() {
    return "Miau";
    }
}

class Pajaro extends Animal {
    public Pajaro() {}
    public String hacerSonido() {
        return "juji";
    }
}