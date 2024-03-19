package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;

public class SopaDeTomate extends RecetaBase {
  public SopaDeTomate() {
    super(
        30,
        new Ingrediente[] {
          new Ingrediente("Tomates", 4), new Ingrediente("Sal", 1), new Ingrediente("Pimienta", 1)
        },
        "Licúa los tomates, cocina la mezcla en una olla, añade sal y pimienta al gusto.");
  }
}
