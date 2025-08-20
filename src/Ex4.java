//exercicio 6 da apostila

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total;
        boolean especial = true;

        System.out.print("Total de numeros --> ");
        total = sc.nextInt();

        int[] x = new int[total];

        for(int i = 0; i < x.length; i++){
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
        }

        //verificar se o array é especial ou nao
        for(int i = 0; i < x.length-1; i++){
            if(x[i] % 2 == x[i + 1] % 2){
                especial = false;
                break;
            }
        }
        if(especial){
            System.out.println("O array eh especial :]");
        } else{
            System.out.println("O array nao eh especial :[");
        }
    }
}
