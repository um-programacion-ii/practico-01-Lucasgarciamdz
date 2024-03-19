package src.main.um;

import src.main.um.entidades.Despensa;
import src.main.um.entidades.Ingrediente;

public class Aplicacion {
  public static void main(String[] args) {
    // Create a new pantry with space for 5 ingredients
    Despensa despensa = new Despensa(5);

    Ingrediente azucar = new Ingrediente("Azucar", 10);
    Ingrediente sal = new Ingrediente("Sal", 20);
    Ingrediente pimienta = new Ingrediente("Pimienta", 30);

    despensa.addIngrediente(azucar);
    despensa.addIngrediente(sal);
    despensa.addIngrediente(pimienta);

    System.out.println(despensa.getIngrediente("Azucar", 5));
    System.out.println(despensa.getIngrediente("Sal", 25));
    System.out.println(despensa.getIngrediente("Pimienta", 15));

    System.out.println(despensa);
  }
}
