package conditional;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinha {

    public static void main(String[] args) {
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o numero que estou pensando");

        int numero = entrada.nextInt();

        if(numero == x){
            System.out.println("Parabéns vc acertou, eu pensei no "+ x);
        }else{
            System.out.println("Voce errou, eu pensei no "+ x);
        }


    }
}
