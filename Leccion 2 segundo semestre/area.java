import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la base del cubo");
        int base = Integer.parseInt(sc.nextLine());
        System.out.println("ingrese la altura del cubo");
        int height = Integer.parseInt(sc.nextLine());
        System.out.println(area_cubo(base, height));
        
        
        sc.close();
    }
    public static int area_cubo (int a, int b){
        return a*b;
    }
}
