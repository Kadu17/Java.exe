import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = (C * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é:"  + F);







    }

}