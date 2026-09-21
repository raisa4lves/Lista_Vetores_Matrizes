import java.util.Scanner;

public class q11_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] alunos = new int[5][4];
        int maiorNota = -1;
        int matMaiorNota = -1;
        double somaNotasFinais = 0;

        for (int i = 0; i < 5; i++) {
            alunos[i][0] = sc.nextInt(); // Matricula
            alunos[i][1] = sc.nextInt(); // Provas
            alunos[i][2] = sc.nextInt(); // Trabalhos
            alunos[i][3] = alunos[i][1] + alunos[i][2]; // Nota Final

            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                matMaiorNota = alunos[i][0];
            }
            somaNotasFinais += alunos[i][3];
        }

        System.out.println("Matricula maior nota: " + matMaiorNota);
        System.out.println("Media das notas finais: " + (somaNotasFinais / 5.0));
        sc.close();
    }
}
