//referente ao exercicio 8 da apostila

import java.util.Random;

public class Ex6 {
    Random rd = new Random();

    int[] a = new int[10];
    int aux;

    for(int i = 0; i < a.lenght; i++){
        aux = rd.nextInt(100);
        System.out.print(a[i] + " ");
    }

    for(int j = 0; j < a.length; j++){
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[i+1]){
                aux = a[i];
                a[i] = a[i+1];
                a[i+1] = aux;
            }
        }
    }


}
