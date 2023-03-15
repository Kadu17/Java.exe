import java.util.Scanner;

public class ConverterC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double C = sc.nextDouble();
        double F = (C - 32) * 1.8;
        System.out.println("A temperatura em Celsius é:"  + F);
    }
}
