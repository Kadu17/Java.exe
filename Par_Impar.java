import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0 ) {
            System.out.printf("the number %d is even ", num);
        }
        else{
            System.out.printf("the number %d is odd", num);
        }


    }
}
