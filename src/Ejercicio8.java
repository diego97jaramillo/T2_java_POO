import java.util.ArrayList;

public class Ejercicio8 {}

class ProductoInventario {
    String nombre;
    float precio;
    String categoria;

    public ProductoInventario(String nombre, float precio, String categoria) {
        this.nombre = nombre.toLowerCase();
        this.precio = precio;
        this.categoria = categoria.toLowerCase();
    }

    @Override
    public String toString() {
        return "el producto: " + this.nombre + ", de la categoria: " + this.categoria + " tiene el precio de: " + this.precio;
    }

    public static void main(String[] args) {
        ProductoInventario product1 = new ProductoInventario("papa", 1500.5f, "legumbres");
        ProductoInventario product2 = new ProductoInventario("Tv", 1000000.56f, "electrodomesticos");

        Inventario.addProducts(product1);
        Inventario.addProducts(product2);

        System.out.println(Inventario.buscarXCategoria(
                "ElecTrodoMESTICOS").toString());
        System.out.println(Inventario.valorTotal());
    }
}

class Inventario {
    static ArrayList<ProductoInventario> inventario = new ArrayList<>();

    static public void addProducts(ProductoInventario producto) {
        inventario.add(producto);
    }

    static public ProductoInventario buscarXCategoria(String categoriaInput) {
        for(ProductoInventario producto : inventario) {
            if (producto.categoria.equals(categoriaInput.toLowerCase())) {
                return producto;
            }
        }
        return null;
    }

    static public float valorTotal() {
        float total = 0f;
        for(ProductoInventario producto : inventario) {
            total += producto.precio;
        }
        return total;
    }
}
