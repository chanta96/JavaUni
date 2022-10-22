package aritmet;

public class Aritmetica {
    int a;
    int b;

    public void sumarAritmetica() {
        int resultado = a+b;
        System.out.println(resultado);
    }


    public Aritmetica (int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("se esta ejecutando el constructor numero 2");
    }
}
package Leccion 05;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica arit1 = new Aritmetica();
        arit1.a = 15;
        arit1.b = 5;
        arit1.sumarAritmetica();
    }
}