import java.util.Scanner;

public class q12_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];

        System.out.println("Digite a primeira matriz 2x2:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) m1[i][j] = sc.nextDouble();

        System.out.println("Digite a segunda matriz 2x2:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) m2[i][j] = sc.nextDouble();

        System.out.println("Opçoes:\na. Somar\nb. Subtrair\nc. Adicionar constante\nd. Imprimir");
        char opcao = sc.next().charAt(0);

        if (opcao == 'a') {
            double[][] res = new double[3][3];
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++) res[i][j] = m1[i][j] + m2[i][j];
            imprimir(res, 3);
        } else if (opcao == 'b') {
            double[][] res = new double[3][3];
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++) res[i][j] = m2[i][j] - m1[i][j];
            imprimir(res, 3);
        } else if (opcao == 'c') {
            double k = sc.nextDouble();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] += k;
                    m2[i][j] += k;
                }
            }
        } else if (opcao == 'd') {
            imprimir(m1, 2);
            imprimir(m2, 2);
        }
        sc.close();
    }

    private static void imprimir(double[][] m, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
