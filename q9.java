public class q9 {
    public static void main(String[] args) {
        int[] vet = new int[100];
        int pos = 0;
        int num = 0;

        while (pos < 100) {
            if (num % 7 != 0 || num % 10 == 7) {
                vet[pos] = num;
                pos++;
            }
            num++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(vet[i]);
        }
    }
}
