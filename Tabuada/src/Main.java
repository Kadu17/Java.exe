import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
         int entrada = sc.nextInt();
         for (int n = 1; n <= 10; n++){
             System.out.println(entrada + "x" + n + " = " + n*entrada);
         }
        
        //todas as tabuadas uma na frente da outra\\
         for (int i = 1; i < 11 ; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d * %d = %d             ", i, j, i*j);
            }
            System.out.println();
    }
}
