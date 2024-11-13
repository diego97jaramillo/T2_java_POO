import java.util.ArrayList;

public class Ejercicio16 {
    public static void main(String[] args) {
        Inventario16 tienda = new Inventario16();
        System.out.println(tienda.agregar("gaseosa", "bebidas", 10));
        System.out.println(tienda.agregar("papas", "alimentos", 5));
        System.out.println(tienda.buscarXNombre("gaseosa").nombre);
        tienda.eliminar("gaseosa");
        System.out.println("Quedaron " + tienda.venta("papas", 3) + " papas en stock.");
    }
}

class Producto16 {
    String nombre;
    String categoria;
    int stock;

    public Producto16(String nombre, String categoria, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }
}


class Inventario16 {
    ArrayList<Producto16> inventario= new ArrayList<>();

    public Inventario16() {}

    public String agregar(String nombre, String categoria, int stock) {
        inventario.add(new Producto16(nombre,categoria, stock));
        return nombre + ", " + categoria + ", " + stock;
    }

    public void eliminar(String nombre) {
        Producto16 proAEliminar= buscarXNombre(nombre);
        inventario.remove(proAEliminar);
    }

    public Producto16 buscarXNombre(String nombre) {
        for(Producto16 item: inventario) {
            if (item.nombre.equals(nombre)) {
                return item;
            }
        }
        return null;
    }
    public Producto16 buscarXCategoria(String categoria) {
        for(Producto16 item: inventario) {
            if (item.categoria.equals(categoria)) {
                return item;
            }
        }
        return null;
    }

    public int venta(String nombre, int cantidad) {
        Producto16 itemToModify = buscarXNombre(nombre);
        itemToModify.stock -= cantidad;
        return  itemToModify.stock;
    }
}