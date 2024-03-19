package src.main.um.entidades;

public class Ingredientes {
    private String nombre;
    private int cantidad;

    public Ingredientes() {
    }

    public Ingredientes(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cantidad: " + cantidad;
    }
}
