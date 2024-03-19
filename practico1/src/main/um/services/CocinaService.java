package src.main.um.services;

import src.main.um.entidades.Despensa;
import src.main.um.recetas.RecetaBase;

public class CocinaService {

  Despensa despensa;

  public CocinaService(Despensa despensa) {
    this.despensa = despensa;
  }

  public String cocinar(RecetaBase receta) {
    if (receta.sePuedeCocinar(despensa)) {
      System.out.println("Cocinando: \n");
      System.out.println(receta.getPreparacion() + "\n");
      for (int i = 0; i < receta.getIngredientes().length; i++) {
        if (receta.getIngredientes()[i] != null) {
          despensa.getIngrediente(
              receta.getIngredientes()[i].getNombre(), receta.getIngredientes()[i].getCantidad());
        }
      }
      return "Se ha cocinado la receta";
    } else {
      return "No se puede cocinar la receta " + receta.getClass().getSimpleName() + "\n" + receta.queFalta(despensa);
    }
  }
}
