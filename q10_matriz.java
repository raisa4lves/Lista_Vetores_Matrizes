import java.util.Scanner;

public class q10_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int[] colSoma = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
                colSoma[j] += mat[i][j];
            }
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(colSoma[j]);
        }
        sc.close();
    }
}
