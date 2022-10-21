package leccion;

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


