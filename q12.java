import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int pos = 0;

        while (pos < 10) {
            int num = sc.nextInt();
            boolean repetido = false;

            for (int i = 0; i < pos; i++) {
                if (vet[i] == num) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Numero ja digitado. Digite outro:");
            } else {
                vet[pos] = num;
                pos++;
            }
        }

        System.out.println("Vetor final:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }
        sc.close();
    }
}
