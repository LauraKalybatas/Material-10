//exemplo para geração de numeros aleatorios

import java.util.Random;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        /*double aux = Math.random() * 10;
        int valor = (int)aux;
        System.out.println(aux);
        System.out.println(valor);*/

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int x = rd.nextInt()%20;
        System.out.println(x);
    }
}
