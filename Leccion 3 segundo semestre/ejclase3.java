import java.util.Scanner;
import javax.swing.JOptionPane;
public class ejclase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //leer un numero hasta introducir un 0 e indicar si es par o impar

        var salir = false;
        var number = 1;
        while (salir == false){
            System.out.println("ingrese un numero a chequear, 0 para salir");
            number = Integer.parseInt(sc.nextLine());
            if (number == 0){
                salir = true;
            }
            else{
                if (number % 2 == 0){
                    System.out.println("es par");
                }
                else{
                    System.out.println("es impar");
                }

            }
            System.out.println("ingrese un numero a chequear");
            number = Integer.parseInt(sc.nextLine());

        }
        // int number = 1;
        // Boolean salir = false;
        // while (salir != true){
        //     number = Integer.parseInt((JOptionPane.showInputDialog("ingrese un numero a chequear, 0 para salir")));
        //     if (number == 0){
        //         JOptionPane.showMessageDialog(null, "adios");
        //         break;
        //     }
        //     else{
        //         if (number % 2 == 0){
        //             JOptionPane.showMessageDialog(null, "el numero es par");
        //         }
        //         else{
        //             JOptionPane.showMessageDialog(null, "el numero es impar");
        //         }
        //     }
            
            
        // }



        sc.close();
    }
}
