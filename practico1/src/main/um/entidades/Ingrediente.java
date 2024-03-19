package src.main.um.entidades;

public class Ingrediente {
  private String nombre;
  private int cantidad;

  public Ingrediente() {}

  public Ingrediente(String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Cantidad: " + cantidad;
  }

  public String sacar(int cantidad) {
    if (this.cantidad >= cantidad) {
      this.cantidad -= cantidad;
      return "Se han sacado " + cantidad + " " + nombre;
    } else {
      return "No hay suficiente " + nombre + ", falta " + (cantidad - this.cantidad) + " unidades";
    }
  }
}
