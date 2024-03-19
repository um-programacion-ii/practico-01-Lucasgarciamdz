package src.main.um;

import src.main.um.entidades.Chef;
import src.main.um.entidades.Despensa;
import src.main.um.entidades.Ingrediente;
import src.main.um.recetas.*;
import src.main.um.services.CocinaService;

import javax.sound.midi.Soundbank;

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
    System.out.println();

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

    System.out.println("------------------------------------------");

    System.out.println("PROBANDO COCINA SERVICE");

    Despensa despensaCocinaService = new Despensa(10);

    Ingrediente azucarCocinaService = new Ingrediente("Azucar", 5);
    Ingrediente salCocinaService = new Ingrediente("Sal", 1);
    Ingrediente pimientaCocinaService = new Ingrediente("Pimienta", 0);
    Ingrediente huevosCocinaService = new Ingrediente("Huevos", 10);
    Ingrediente mantequillaCocinaService = new Ingrediente("Mantequilla", 5);
    Ingrediente tomatesCocinaService = new Ingrediente("Tomates", 10);
    Ingrediente manzanaCocinaService = new Ingrediente("Manzana", 5);
    Ingrediente espaguetisCocinaService = new Ingrediente("Espaguetis", 200);
    Ingrediente salsaDeTomateCocinaService = new Ingrediente("Salsa de Tomate", 150);
    Ingrediente heladoCocinaService = new Ingrediente("Helado", 2);

    despensaCocinaService.addIngrediente(azucarCocinaService);
    despensaCocinaService.addIngrediente(salCocinaService);
    despensaCocinaService.addIngrediente(pimientaCocinaService);
    despensaCocinaService.addIngrediente(huevosCocinaService);
    despensaCocinaService.addIngrediente(mantequillaCocinaService);
    despensaCocinaService.addIngrediente(tomatesCocinaService);
    despensaCocinaService.addIngrediente(manzanaCocinaService);
    despensaCocinaService.addIngrediente(espaguetisCocinaService);
    despensaCocinaService.addIngrediente(salsaDeTomateCocinaService);
    despensaCocinaService.addIngrediente(heladoCocinaService);

    System.out.println("Despensa: " + despensaCocinaService);
    Chef chef = new Chef("Linguini", 5);
    CocinaService cocinaService = new CocinaService(despensaCocinaService);

    HuevosRevueltos huevosRevueltos = new HuevosRevueltos();

    System.out.println(chef.cocinar(cocinaService, huevosRevueltos));

    SopaDeTomate sopaDeTomate = new SopaDeTomate();

    System.out.println("\n");

    System.out.println(chef.cocinar(cocinaService, sopaDeTomate));

    System.out.println(despensaCocinaService);
  }
}
