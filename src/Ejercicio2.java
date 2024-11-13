public class Ejercicio2 {

}


class Libro {
    public String titulo;
    public String autor;
    public int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void imprimirResumen() {
        System.out.println("El titulo: " + titulo + ", El autor: " + autor);
    }

    public String numPagesVerified() {
        if (this.numPaginas > 300) {
            return "Tiene más de " + 300 + " paginas.";
        } else {
            return "Tiene menos de " + 300 + " paginas.";
        }
    }

    public static void main(String[] args) {
        Libro newInstance = new Libro("El pato gruñon", "pepe el pollo", 350);

        newInstance.imprimirResumen();
        System.out.println(newInstance.numPagesVerified());;

    }
}
