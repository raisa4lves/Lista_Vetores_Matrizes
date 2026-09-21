import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];

        for (int i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }

        System.out.println("Elementos pares:");
        for (int i = 0; i < 10; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
