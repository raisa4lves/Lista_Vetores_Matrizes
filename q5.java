import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[20];

        for (int i = 0; i < 20; i++) {
            vet[i] = sc.nextInt();
        }

        System.out.println("Elementos com conteúdo ímpar:");
        for (int i = 0; i < 20; i++) {
            if (vet[i] % 2 != 0) {
                System.out.println(vet[i]);
            }
        }

        System.out.println("Elementos das posições pares:");
        for (int i = 0; i < 20; i += 2) {
            System.out.println(vet[i]);
        }
        sc.close();
    }
}
