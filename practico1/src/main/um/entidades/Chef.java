package src.main.um.entidades;

import src.main.um.recetas.RecetaBase;
import src.main.um.services.CocinaService;

public class Chef {

  String nombre;

  int estrellasMichelin;

  public Chef() {}

  public Chef(String nombre, int estrellasMichelin) {
    this.nombre = nombre;
    this.estrellasMichelin = estrellasMichelin;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEstrellasMichelin() {
    return estrellasMichelin;
  }

  public void setEstrellasMichelin(int estrellasMichelin) {
    this.estrellasMichelin = estrellasMichelin;
  }

  public String cocinar(CocinaService cocina, RecetaBase receta) {
    System.out.println("Hola soy " + this);
    return cocina.cocinar(receta);
  }

  @Override
  public String toString() {
    return "Chef: " + nombre + ", Estrellas Michelin: " + estrellasMichelin;
  }
}
