import java.util.Scanner;

// import javax.swing.JOptionPane;

public class ej_num_negativos {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ingresar numeros hasta ingresar un negativo, contando cuantos se introdujeron
        int contador = 0;
        int numero;
        boolean salir = false;
        while (salir != true){
            System.out.println("ingrese un numero positivo, un 0 lo hara salir67  ");
            numero = Integer.parseInt(sc.nextLine());
            // numero = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero, o un negativo para salir"));
            if (numero >= 0){
                contador+=1;
            }
            else{
                System.out.println("cantidad de numeros: " + contador);
                // JOptionPane.showMessageDialog(null, "numeros introducidos: "+contador);
                break;
            }
        }
        
        
        sc.close();

    }
}
