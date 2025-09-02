//exercicio 3 nas apostilas

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double nota = 0;

        int total, aprovados = 0;
        System.out.print("Total de alunos --> ");
        total = sc.nextInt();

        double[] media = new double[total];

        for(int i = 0; i < media.length; i++){
            System.out.println("Aluno " + (i + 1) + ": ");

            nota = 0;
            for(int cont = 1; cont <= 4; cont++){
                System.out.print("Nota " + cont + " --> ");
                nota += sc.nextDouble();
            }

            media[i] = nota / 4;
            System.out.println("\n----------------------------------");
        }

        for(int i = 0; i < media.length; i++){
            System.out.println("Aluno " + (i+1) + "--> " + df.format(media[i]));

            if(media[i] >= 6){
                aprovados++;
            }
        }

        System.out.println("Total de alunos aprovados: " + aprovados);


    }
}
