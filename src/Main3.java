
/** Funciones **/

public class Main3 {

  public static void main(String[] args) {
    /* Parte 1 */
    int dato1 = 1;
    int dato2 = 2;
    int dato3 = 5;

    int resultado = suma(dato1, dato2, dato3);

    System.out.println();
    System.out.println("Parte 1");
    System.out.println("La suma de los datos es: " + resultado);

    /* Parte 2 */
    Coche miCoche = new Coche();
    miCoche.agregoPuerta();

    System.out.println();
    System.out.println("Parte 2");
    System.out.println("Total de puertas " + miCoche.puertas);
  }

  /* Suma de la parte 1 */
  public static int suma(int a, int b, int c) {
    return a + b + c;
  }
}

/* Clase y funcion del Auto - Parter 2 */
class Coche {
  public int puertas = 3;
  public int carroceria = 1;
  public int ruedas = 4;
  public int asientos = 4;
  public String marca = "Volkswagen";
  public String colorAsientos = "Negro";

  /* Parte 2 - agrego puerta */
  public void agregoPuerta() {
    this.puertas++;
  }
}
