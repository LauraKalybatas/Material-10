//referente ao exercicio 10 na apostila

import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] a = new int[10];
        int aux;
        boolean achou;

        for(int i = 0; i < a.length; ){
            aux = rd.nextInt(15, 30);
            achou = false;
            for(int k = 0; k < i; k++){
                if(a[k] == aux){
                    achou = true;
                    break;
                }
            }
            if(achou == false){
                a[i] = aux;
                System.out.print(a[i] + " ");
                i++;
            }
        }
    }
}
