import java.util.Scanner;

public class q13_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] teatro = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }

        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int fila = sc.nextInt() - 1;
            int poltrona = sc.nextInt() - 1;

            if (teatro[fila][poltrona] == 1) {
                System.out.println("Poltrona ja foi vendida");
            } else {
                teatro[fila][poltrona] = 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(teatro[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
