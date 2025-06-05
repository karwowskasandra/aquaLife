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
}
