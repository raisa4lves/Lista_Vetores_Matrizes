import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        for (int i = 0; i < 5; i++) x[i] = sc.nextInt();
        for (int i = 0; i < 5; i++) y[i] = sc.nextInt();

        // a. Soma
        System.out.print("Soma: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");
        System.out.println();

        // b. Produto
        System.out.print("Produto: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");
        System.out.println();

        // c. Diferença
        System.out.print("Diferenca: ");
        for (int i = 0; i < 5; i++) {
            boolean existeEmY = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { existeEmY = true; break; }
            }
            if (!existeEmY) System.out.print(x[i] + " ");
        }
        System.out.println();

        // d. Interseção
        System.out.print("Intersecao: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) System.out.print(x[i] + " ");
            }
        }
        System.out.println();

        // e. União
        System.out.print("Uniao: ");
        for (int i = 0; i < 5; i++) System.out.print(x[i] + " ");
        for (int i = 0; i < 5; i++) {
            boolean existeEmX = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) { existeEmX = true; break; }
            }
            if (!existeEmX) System.out.print(y[i] + " ");
        }
        sc.close();
    }
}
