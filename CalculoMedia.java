import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Insert a number: ");
       int n = sc.nextInt();
       int total = 0;
       double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Type it the number "+i);
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum/n;

        System.out.printf("Average: %.2f%n", avg);



        }

    }
