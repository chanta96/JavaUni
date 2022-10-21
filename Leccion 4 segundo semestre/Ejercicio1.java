import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        var sumatoria = 0;
        while (numero != 0){
            //numero = Integer.parseInt(sc.nextLine());
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero"));
            sumatoria += numero;
        }
        // System.out.println(sumatoria);
        JOptionPane.showMessageDialog(null,String.format("sumatoria %d",sumatoria));
        sc.close();
    }
}
