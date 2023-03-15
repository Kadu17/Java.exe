import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       double peso,altura,imc;


          System.out.println("Digite  seu peso: ");
              peso = sc.nextDouble();
          System.out.println("Digite sua altura: ");
               altura = sc.nextDouble();




       imc = (peso*altura);

      System.out.println("Seu indice de massa corporal é " + imc );





    }
}

