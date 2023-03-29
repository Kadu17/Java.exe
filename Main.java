import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        while (true){
            try{
                System.out.print("Digite um numero: ");
                numero=ler.nextInt();
                if (numero<20){
                    continue;
                }
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Ops... você digitou caracteres invalidos " +
                        "precisamos que digite apenas numeros");
            }
            ler.nextLine();
        }
        System.out.println(numero);
    }
}