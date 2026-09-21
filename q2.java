import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];

        for (int i = 0; i < 6; i++) {
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(vet[i]);
        }
        sc.close();
    }
}
