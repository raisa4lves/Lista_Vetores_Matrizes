import java.util.Scanner;

public class q7_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int acima = 0, abaixo = 0, diagPrinc = 0, diagSec = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) acima += mat[i][j];
                if (i > j) abaixo += mat[i][j];
                if (i == j) diagPrinc += mat[i][j];
                if (i + j == 2) diagSec += mat[i][j];
            }
        }

        System.out.println("Acima da diagonal: " + acima);
        System.out.println("Abaixo da diagonal: " + abaixo);
        System.out.println("Diagonal principal: " + diagPrinc);
        System.out.println("Diagonal secundaria: " + diagSec);
        sc.close();
    }
}
