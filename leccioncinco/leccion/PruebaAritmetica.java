package leccion;

import java.io.Console;
import java.lang.reflect.Constructor;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica arit1 = new Aritmetica(0, 0);
        arit1.a = 15;
        arit1.b = 5;
        arit1.sumarAritmetica();

        Persona persona1 = new Persona("gonzalo","gramajo");
        System.out.println("persona = "+ persona1);
        System.out.println("nombre :"+persona1.nombre);
        System.out.println("apellido"+ persona1.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;

    Persona(String nombre,String apellido){//constructor
        super();
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this :" + this);
    }
}

class Imprimir{
    public Imprimir(){
        super();
    }
    public void imprimir(Persona persona){
        System.out.println("persona desde la clase imprimir:"+persona);
        System.out.println("impresion del objetos actual :"+ this);
    }
}