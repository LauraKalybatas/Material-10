//referente ao exercicio 9 na apostila

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;

        System.out.println("Informe a quantidade de funcionarios ---> ");
        qtd = sc.nextInt();

        String[] nome = new String[qtd];
        double[] salario = new double[qtd];
        double pagamento = 0, media = 0;

        //entrada de dados
        for(int i = 0; i < qtd; i++){
            System.out.println("Informe o nome do funcionario --> ");
            nome[i] = sc.next();
            System.out.println("Informe o salario do funcionario --> ");
            salario[i] = sc.nextDouble();
            pagamento += salario[i];
        }

        media = pagamento/qtd;

        System.out.print("Folha de pagamento ---> " + pagamento);
        System.out.print("Media salarial ---> " + media);
    }
}
