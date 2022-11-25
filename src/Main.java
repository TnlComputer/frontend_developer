/** Tema 8 - Encapsulacion **/

public class Main {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(57);
    persona.setTelefono(1149156462);
    persona.setNombre("Jorge");

    int edad = persona.getEdad();
    int telefono = persona.getTelefono();
    String nombre = persona.getNombre();

    System.out.println("Edad -> " + edad);
    System.out.println("Nombre -> " + nombre);
    System.out.println("Teléfono -> " + telefono);
  }
}

class Persona {
  private int edad;
  private int telefono;
  private String nombre;

  // public Persona(int edad, int telefono, String nombre) {
  // this.edad = edad;
  // this.telefono = telefono;
  // this.nombre = nombre;
  // }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return edad;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public int getTelefono() {
    return telefono;
  }
}