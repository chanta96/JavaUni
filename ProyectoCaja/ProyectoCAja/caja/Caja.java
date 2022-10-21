package caja;
public class Caja {
    private Sting raza;
    private String nombre;
    private int edad;

    public Animal(String nuevoNombre){
        nombre = nuevoNombre;
   }

   public int getEdad(){
        return edad;
   }

   public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
   }
   public String getNombre(){
    return nombre;
   }
}
