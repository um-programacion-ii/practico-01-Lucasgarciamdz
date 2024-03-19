package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;

public class Helado extends RecetaBase {
  public Helado() {
    super(0, new Ingrediente[] {new Ingrediente("Helado", 1)}, "Sirve el helado.");
  }
}
