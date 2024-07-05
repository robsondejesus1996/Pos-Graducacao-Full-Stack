package estruturaDeRepeticao;

import java.util.Scanner;

public class EstruturaRepeticaoWhile {

    public static void main(String[] args) {
        int opcao = 0;

        while(opcao != 99){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um valor qualquer ou 99 para sair: \n");
            opcao = entrada.nextInt();
            System.out.println("Valor digitado: "+ opcao);
        }

        System.out.println("Bye Bye");





    }
}
