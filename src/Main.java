
/** Sentencia de control **/

public class Main {
  public static void main(String[] args) {
    int numero = 10;
    if (numero > 0) {
      System.out.println("Positivo");
    } else if (numero < 0) {
      System.out.println("Negativo");
    } else {
      System.out.println("El número es Cero");
    }

    int recorro = 3;
    while (recorro > 0) {
      System.out.println(recorro);
      recorro--;
    }

    do {
      recorro++;
      System.out.println(recorro);
    } while (recorro < 1);

    int puntoFor[] = { 10, 20, 30, 40, 50 };
    for (int i = 0; i < puntoFor.length; i++) {
      System.out.println(puntoFor[i]);
    }
    var estacion = "Verano";

    switch (estacion) {
      case "Verano":
        System.out.println("Es Verano");
        break;
      case "Primavera":
        System.out.println("Es Primavera");
        break;
      case "Otoño":
        System.out.println("Es Otoño");
        break;
      case "Invierno":
        System.out.println("Es Invierno");
        break;
      default:
        System.out.println("No es una estación");
        break;
    }
  }
}
