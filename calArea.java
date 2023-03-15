import java.util.Scanner;

public class calArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base: ");
        Double b = sc.nextDouble();
        System.out.println("Digite a altura: ");
        Double a = sc.nextDouble();
        Double C = (b * a);
        System.out.println(C);
    }
}
