//referente ao exercicio 11 da apostila

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        int total;
        double aux;

        System.out.print("Quantidade de arquivos ---> ");
        total = sc.nextInt();

        long[] tamanho = new long[total];
        String[] nome = new String[tamanho.length];

        //entrada de dados
        for(int i = 0; i < total; i++){
            sc.nextLine();
            System.out.println("========== Arquivo " + (i+1) + " ==========");
            System.out.print("Arquivo ---> ");
            nome[i] = sc.nextLine();
            System.out.print("Tamanho em bytes ---> ");
            tamanho[i] = sc.nextLong();
            System.out.println();
        }

        //saida de dados
        for(int i = 0; i < total; i++){
            aux = (double)tamanho[i] / (1024*1024);
            System.out.print(nome[i] + " | ");
            System.out.print(df.format(aux) + "(mb) | ");
            System.out.println(aux / 1024.00 + "(gb) | " );
        }


    }
}
