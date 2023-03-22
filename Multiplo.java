import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number: ");
        float num = sc.nextFloat();
        if(num % 2 == 0){
            System.out.println("Fizz");
        }
        else if(num % 5 == 0){
            System.out.println("Buzz");
        }
        else if(num % 2 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else{
            System.out.println("ERROR!");
        }
    }
}
