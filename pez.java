public class pez {
   public String nombre;
   public int salud;


public pez(String nombre, int salud) {
    nombre = nombre;
    salud = salud;
 }

public String getNombre() {
    return nombre;
 }

public String getEstado() {
    return "nombre: " + nombre + "salud : " + salud;
 }

public void setSalud(int salud) {
    salud = salud;
 }

public void imprimirEstado() {
    System.out.println("nombre : " + nombre);
    System.out.println("salud : " + salud);
 }
}
