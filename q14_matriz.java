import java.util.Scanner;

public class q14_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            int faltas = 0;
            String diasFaltas = "";

            for (int dia = 1; dia <= 30; dia++) {
                String presencia = sc.next();
                if (presencia.equals("F")) {
                    faltas++;
                    diasFaltas += dia + " ";
                }
            }

            if (faltas > 10) {
                System.out.println(nome + " dias: " + diasFaltas);
            }
        }
        sc.close();
    }
}
