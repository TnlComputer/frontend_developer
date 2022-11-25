/** Tema 8 - Encapsulacion **/

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();

    int edadCliente = cliente.getEdad();
    int telefonoCliente = cliente.getTelefono();
    String nombreCliente = cliente.getNombre();
    double creditoCliente = cliente.getCredito();

    cliente.setEdad(57);
    cliente.setTelefono(1149156462);
    cliente.setNombre("Jorge");
    cliente.setCredito(125000);

    System.out.println("Cliente");
    System.out.println("Edad -> " + edadCliente);
    System.out.println("Nombre -> " + nombreCliente);
    System.out.println("Teléfono -> " + telefonoCliente);
    System.out.println("Credito -> " + creditoCliente);

    Trabajador trabajador = new Trabajador();
    trabajador.setEdad(25);
    trabajador.setTelefono(113119876);
    trabajador.setNombre("Sol");
    trabajador.setSalario(85000);

    int edadTrabajador = trabajador.getEdad();
    int telefonoTrabajador = trabajador.getTelefono();
    String nombreTrabajador = trabajador.getNombre();
    double salarioTrabajador = trabajador.getSalario();

    System.out.println("");
    System.out.println("Trabajador");
    System.out.println("Edad -> " + edadTrabajador);
    System.out.println("Nombre -> " + nombreTrabajador);
    System.out.println("Teléfono -> " + telefonoTrabajador);
    System.out.println("Credito -> " + salarioTrabajador);

  }
}

abstract class Persona {
  int edad;
  int telefono;
  String nombre;

  public Persona() {
    System.out.println("contructor Persona");
  }

  abstract public String getNombre();

  abstract public void setNombre(String nombre);

  abstract public int getEdad();

  abstract public void setEdad(int edad);

  abstract public void setTelefono(int telefono);

  abstract public int getTelefono();

}

class Cliente extends Persona {
  private double credito;

  public void setCredito(double credito) {
    this.credito = credito;
  }

  public double getCredito() {
    return credito;
  }

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

class Trabajador extends Persona {
  double salario;

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

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