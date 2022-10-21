import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hola xd", new_str = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            new_str = ch + new_str;

        }
        System.out.println(new_str);
        sc.close();
    }
}
