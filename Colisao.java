import java.util.Scanner;

public class Colisao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição inicial do trem A: ");
        int psA = sc.nextInt();
        System.out.println("Digite a posição inicial do trem B: ");
        int psB = sc.nextInt();
        System.out.println("Digite a velocidade do trem A: ");
        int vlA = sc.nextInt();
        System.out.println("Digite a velocidade do trem B ");
        int vlB = sc.nextInt();

        float p = psA - psB;
        float v = vlA - vlB;
        float temp = p/v;

        double div =  vlA * temp;
        double sum = psA + div;

        double div1 = vlB * temp;
        double sum1 = psB + div1;




    }
}
