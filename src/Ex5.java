//exercicio 4 da apostila

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};
        int[] x = new int[12];
        double[] temp = new double[mes.length];
        double media = 0;

        //entrada das temperaturas
        for(int i = 0; i < x.length; i++){
            System.out.print("Temperatura de " + mes[i] + " --> ");
            x[i] = sc.nextInt();
            media = media + temp[i];
        }

        //calculo da media
        media = media / mes.length;
        System.out.println("Temperatura media anual: " + media);

        for(int i = 0; i < temp.length; i++){
            if(temp[i] > media){
                System.out.println(mes[i] + " --> " + temp[i]);
            }
        }
    }
}
