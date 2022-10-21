package caja;
import Caja.java;
public class pruebaAnimal {
    public static void main(String[] args) {
        Caja miAnimal = new Caja();
        miAnimal.setNombre("miAnimal");
        System.out.println("el nombre es:"+ miAnimal.getNombre());
        System.out.println(" tiene" + miAnimal.getEdad());
    }
}
