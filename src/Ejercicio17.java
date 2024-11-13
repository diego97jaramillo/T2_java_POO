import java.util.ArrayList;
import java.util.List;

class Producto17 {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto17(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean actualizarInventario(int cantidadComprada) {
        if (cantidadComprada <= cantidad) {
            cantidad -= cantidadComprada;
            return true;
        } else {
            System.out.println("No hay suficiente inventario para " + nombre);
            return false;
        }
    }
}

class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
}

class Pedido {
    private Cliente cliente;
    private List<ItemPedido> productos;
    private double total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    public void agregarProducto(Producto17 producto, int cantidad) {
        if (producto.actualizarInventario(cantidad)) {
            productos.add(new ItemPedido(producto, cantidad));
            total += producto.getPrecio() * cantidad;
        } else {
            System.out.println("Producto " + producto.getNombre() + " no agregado por falta de inventario.");
        }
    }

    public double calcularTotal() {
        return total;
    }

    public void realizarCompra() {
        System.out.println("Compra realizada por " + cliente.getNombre());
        System.out.println("Resumen del pedido:");
        for (ItemPedido item : productos) {
            System.out.println(item.getProducto().getNombre() + " - Cantidad: " + item.getCantidad() + " - Subtotal: $" + (item.getProducto().getPrecio() * item.getCantidad()));
        }
        System.out.println("Total: $" + calcularTotal());
    }
}

class ItemPedido {
    private Producto17 producto;
    private int cantidad;

    public ItemPedido(Producto17 producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto17 getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}

public class Ejercicio17 {
    public static void main(String[] args) {
        Producto17 producto1 = new Producto17("Laptop", 1000, 5);
        Producto17 producto2 = new Producto17("Mouse", 50, 10);

        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@example.com");

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(producto1, 2);
        pedido.agregarProducto(producto2, 1);

        pedido.realizarCompra();
    }
}