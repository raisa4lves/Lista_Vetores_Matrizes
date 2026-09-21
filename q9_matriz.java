import java.util.Random;

public class q9_matriz {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] bingo = new int[5][5];
        boolean[] usados = new boolean[100];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                do {
                    num = rand.nextInt(100);
                } while (usados[num]);
                
                usados[num] = true;
                bingo[i][j] = num;
            }
        }

        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(bingo[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
