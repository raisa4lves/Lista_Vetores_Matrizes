import java.util.Scanner;

public class q5_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Encontrado na Linha " + i + ", Coluna " + j);
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }

        if (!encontrado) {
            System.out.println("não encontrado");
        }
        sc.close();
    }
}
