import java.util.Random;

public class q8_matriz {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] orig = new int[4][4];
        int[][] trans = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                orig[i][j] = rand.nextInt(20) + 1;
                trans[i][j] = (j > i) ? 0 : orig[i][j];
            }
        }

        System.out.println("Matriz Original:");
        imprimirMatriz(orig);

        System.out.println("\nMatriz Triangular Inferior:");
        imprimirMatriz(trans);
    }

    private static void imprimirMatriz(int[][] m) {
        for (int[] linha : m) {
            for (int val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
