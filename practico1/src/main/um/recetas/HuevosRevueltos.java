package src.main.um.recetas;

import src.main.um.entidades.Ingrediente;

public class HuevosRevueltos extends RecetaBase {
  public HuevosRevueltos() {
    super(
        5,
        new Ingrediente[] {
          new Ingrediente("Huevos", 2), new Ingrediente("Sal", 1), new Ingrediente("Mantequilla", 1)
        },
        "Bate los huevos, derrite la mantequilla en una sartén, añade los huevos, revuelve hasta que estén cocidos, añade sal al gusto.");
  }
}
