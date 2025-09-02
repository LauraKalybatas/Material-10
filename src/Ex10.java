//referente ao exercicio 7 da apostila

import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] a = new int[rd.nextInt(1, 10)];
        int maior = 0, cont;

        //preenchendo o vetor e imprimindo
        for(int i = 0; i < a.length; ){
            a[i] = rd.nextInt(10, 20);
            System.out.println(a[i] + " ");
        }

        //procura pela maior frequencia
        for(int i = 0; i < a.length; i++){
            cont = 0;
            for(int k = 0; k < i; k++){
                if(a[i] == a[k]){
                    cont++;
                }
            }
            if(cont > maior){
                maior = cont;
            }
        }

        //impressao do grau do vetor
        System.out.println("\nGrau do vetor = " + maior);
    }
}
