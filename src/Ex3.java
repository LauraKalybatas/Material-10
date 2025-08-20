//referente ao exercicio 5 na apostila

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total, aux;
        System.out.println("Total --> ");
        total = sc.nextInt();

        int[] x = new int[total];

        for(int i = 0; i < x.length; i++){
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
        }

        System.out.println("\nDados antes da inversão");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }

        //inversao
        for(int i = 0; i < x.length/2; i++){
            aux = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = aux;
        }


        System.out.println("\nDados depois da inversão");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
}
