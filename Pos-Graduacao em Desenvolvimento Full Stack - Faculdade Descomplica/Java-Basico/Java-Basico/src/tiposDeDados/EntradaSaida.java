package tiposDeDados;

import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        System.out.println("Olá mundo");
        System.out.print("Ola mundo");
        System.out.print("Ola mundo");
        System.out.printf("Olá mundo");
        System.out.println("\n");

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nInforme o seu nome\n");
        String palavra;
        palavra = entrada.nextLine();
        System.out.println(palavra);
    }
}
