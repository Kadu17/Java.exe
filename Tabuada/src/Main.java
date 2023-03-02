import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
         int entrada = sc.nextInt();
         for (int n = 1; n <= 10; n++){
             System.out.println(entrada + "x" + n + " = " + n*entrada);
         }
    }
}