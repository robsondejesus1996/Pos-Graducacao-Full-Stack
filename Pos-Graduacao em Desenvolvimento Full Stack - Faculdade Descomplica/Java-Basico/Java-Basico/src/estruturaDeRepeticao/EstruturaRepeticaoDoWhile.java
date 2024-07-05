package estruturaDeRepeticao;

import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Digite um valor ou 99 para sair");
            opcao = entrada.nextInt();
            System.out.println("Valor informado: "+ opcao);

        }while(opcao != 99);


    }
}
