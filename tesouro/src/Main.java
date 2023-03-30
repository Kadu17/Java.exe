import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int v = r.nextInt(5);
        int h = r.nextInt(5);
        System.out.println(v);
        System.out.println(h);
        System.out.println();
        while (true) {
            System.out.println("Digite o numero da coluna: ");
            int vt = sc.nextInt();
            System.out.println("Digite o numero da linha: ");
            int ht = sc.nextInt();
            m[vt][ht] = 1;
            if (v == vt && h == ht) {
                System.out.println("Parabens você Acertou!!");
                m[v][h] = 2;

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (m[i][j] == 0) {
                            System.out.print("-\t");
                        }else if (m[i][j] == 1){
                            System.out.print("x\t");
                        } else if (m[i][j] == 2) {
                            System.out.print("*\t");
                        }
                    }
                    System.out.println();
                }

                break;
            }
            else {
                System.out.println("Tente novamente!");
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (m[i][j] == 0) {
                        System.out.print("-\t");
                    }else if (m[i][j] == 1){
                        System.out.print("x\t");
                    }
                }
                System.out.println();
            }

        }
    }
}