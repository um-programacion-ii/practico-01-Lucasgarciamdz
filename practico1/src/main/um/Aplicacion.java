package src.main.um;

import src.main.um.entidades.Despensa;
import src.main.um.entidades.Ingrediente;
import src.main.um.recetas.*;

public class Aplicacion {
  public static void main(String[] args) {
    System.out.println("------------------------------------------");
    System.out.println("PROBANDO DESPENSA");
    Despensa despensa = new Despensa(5);

    Ingrediente azucar1 = new Ingrediente("Azucar1", 10);
    Ingrediente sal1 = new Ingrediente("Sal1", 20);
    Ingrediente pimienta1 = new Ingrediente("Pimienta1", 30);

    despensa.addIngrediente(azucar1);
    despensa.addIngrediente(sal1);
    despensa.addIngrediente(pimienta1);

    System.out.println(despensa.getIngrediente("Azucar1", 5));
    System.out.println(despensa.getIngrediente("Sal1", 25));
    System.out.println(despensa.getIngrediente("Pimienta1", 15));

    System.out.println(despensa);

    System.out.println("------------------------------------------");
    System.out.println("PROBANDO RECETAS");

    Despensa despensaParaRecetas = new Despensa(10);

    Ingrediente azucar = new Ingrediente("Azucar", 5);
    Ingrediente sal = new Ingrediente("Sal", 1);
    Ingrediente pimienta = new Ingrediente("Pimienta", 0);
    Ingrediente huevos = new Ingrediente("Huevos", 10);
    Ingrediente mantequilla = new Ingrediente("Mantequilla", 5);
    Ingrediente tomates = new Ingrediente("Tomates", 10);
    Ingrediente manzana = new Ingrediente("Manzana", 5);
    Ingrediente espaguetis = new Ingrediente("Espaguetis", 200);
    Ingrediente salsaDeTomate = new Ingrediente("Salsa de Tomate", 150);
    Ingrediente helado = new Ingrediente("Helado", 2);

    despensaParaRecetas.addIngrediente(azucar);
    despensaParaRecetas.addIngrediente(sal);
    despensaParaRecetas.addIngrediente(pimienta);
    despensaParaRecetas.addIngrediente(huevos);
    despensaParaRecetas.addIngrediente(mantequilla);
    despensaParaRecetas.addIngrediente(tomates);
    despensaParaRecetas.addIngrediente(manzana);
    despensaParaRecetas.addIngrediente(espaguetis);
    despensaParaRecetas.addIngrediente(salsaDeTomate);
    despensaParaRecetas.addIngrediente(helado);

    System.out.println("Despesna: " + despensaParaRecetas);

    RecetaBase[] recetas = {
      new HuevosRevueltos(),
      new SopaDeTomate(),
      new RodajasDeManzana(),
      new Espaguetis(),
      new Helado()
    };

    for (RecetaBase receta : recetas) {

      if (receta.sePuedeCocinar(despensaParaRecetas)) {
        System.out.println("Se puede hacer la receta: " + receta.getClass().getSimpleName());
      } else {
        System.out.println(
            "No se puede hacer la receta: "
                + receta.getClass().getSimpleName()
                + "\n"
                + receta.queFalta(despensaParaRecetas));
      }
    }
  }
}
