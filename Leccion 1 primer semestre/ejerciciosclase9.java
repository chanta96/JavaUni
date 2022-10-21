import java.util.Scanner;
public class ejerciciosclase9 {
    public static void main(String[] args) {
        //ej5
        Scanner input = new Scanner(System.in);
        float suma_calificaciones =0;
        for (int i=0;i<=2;i++){
            suma_calificaciones += Integer.parseInt(input.nextLine());
        }
        System.out.println(suma_calificaciones);
        input.close();

        //ej6
        System.out.println("ingrese lo que posee guillermo: ");
        int guillermo = Integer.parseInt(input.nextLine());
        int luis = guillermo /2;
        int juan = (guillermo + luis)/2;
        int total =  guillermo + luis + juan;
        System.out.println(total);

        //ej 7
        //ejercicio en archivo de clases

        input.close();
    }
}
