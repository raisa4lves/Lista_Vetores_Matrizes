import java.util.Scanner;

public class q1_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int cont = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] > 10) cont++;
            }
        }

        System.out.println("Quantidade de valores maiores que 10: " + cont);
        sc.close();
    }
}
