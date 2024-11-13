public class Ejercicio9 {}

class LibroBiblioteca {
    String titulo;
    String autor;
    boolean disponible;

    public LibroBiblioteca(String titulo, String autor) {
        this.titulo = titulo.toLowerCase();
        this.autor = autor.toLowerCase();
        this.disponible = true;
    }

    public static void main(String[] args) {
        LibroBiblioteca libro1 = new LibroBiblioteca("lord of the rings", "maicol");
        LibroBiblioteca libro2 = new LibroBiblioteca("POTTER", "J.K.ROBERTS");
        LibroBiblioteca libro3 = new LibroBiblioteca("4 fun things", "isabela");
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregarLibros(libro1);
        biblioteca1.agregarLibros(libro2);
        biblioteca1.agregarLibros(libro3);

        System.out.println(biblioteca1.prestarLibro("POTTER"));
        System.out.println(biblioteca1.prestarLibro("POTER"));
        System.out.println(biblioteca1.devolverLibro("POTTER"));
        System.out.println(biblioteca1.devolverLibro("POTTER"));
    }
}

class Biblioteca {
    static LibroBiblioteca[] libros = new LibroBiblioteca[3];
    private int cantidadLibro = 0;

    public Biblioteca() {}
    public void agregarLibros(LibroBiblioteca libro) {
        if (this.cantidadLibro < libros.length) {
            libros[cantidadLibro] = libro;
            cantidadLibro++;
        }
    }

    public String devolverLibro(String titulo) {
        for (LibroBiblioteca libroInventario : libros) {
            if (libroInventario.titulo.equals(titulo.toLowerCase()) && !libroInventario.disponible) {
                libroInventario.disponible = !libroInventario.disponible;
                return "libro devuelto";
            }
        }
        return "no se habia prestado";
    }


    public String prestarLibro(String titulo) {
        String message = "";
        for (LibroBiblioteca libroInventario : libros) {
            if (libroInventario.titulo.equals(titulo.toLowerCase()) && libroInventario.disponible) {
                libroInventario.disponible = !libroInventario.disponible;
                message = "libro prestado";
                break;
            } else if (libroInventario.titulo.equals(titulo.toLowerCase()) && !libroInventario.disponible) {
                message = "ya esta prestado";
                break;
            } else {
                message = "escribiste mal el titulo";
            }
        }
        return message;
    }
}
