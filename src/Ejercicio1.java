public class Ejercicio1 { }

class Producto {
    private String nombre;
    private float precio;
    private int cantidadEnStock;

    public Producto() {
    }

    public void setVariable(String name, float precio, int cantidad) {
        this.nombre = name;
        this.cantidadEnStock = cantidad;
        this.precio = precio;
    }

    public String getAtributes() {
        return "nombre: " + nombre + ", precio:" + precio + ", cantidad:" + cantidadEnStock;
    }

    public int modifyStock(int cantidadAModificar) {
        if (this.cantidadEnStock + cantidadAModificar <= 0) {
            this.cantidadEnStock = 0;
        } else {
            this.cantidadEnStock += cantidadAModificar;
        }
        return this.cantidadEnStock;
    }


    public static void main(String[] args) {
        Producto newInstance = new Producto();
        newInstance.setVariable("pepe", 2.5F, 5);
        newInstance.modifyStock(3);
        System.out.println(newInstance.getAtributes());
        newInstance.modifyStock(-14);
        System.out.println(newInstance.getAtributes());
    }
}
