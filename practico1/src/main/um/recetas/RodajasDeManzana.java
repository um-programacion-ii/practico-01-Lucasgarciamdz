package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;

public class RodajasDeManzana extends RecetaBase {
  public RodajasDeManzana() {
    super(2, new Ingrediente[] {new Ingrediente("Manzana", 1)}, "Corta la manzana en rodajas.");
  }
}
