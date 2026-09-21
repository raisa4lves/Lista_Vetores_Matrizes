import java.util.Scanner;

public class q4_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int maior = Integer.MIN_VALUE, linha = 0, coluna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maior + " na Linha: " + linha + ", Coluna: " + coluna);
        sc.close();
    }
}
