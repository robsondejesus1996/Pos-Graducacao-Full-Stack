package POO;

import java.util.Scanner;

public class Execoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("Digite um valor: ");
            int numero1 = entrada.nextInt();
            System.out.println(numero1);

        }catch (Exception ex){
            System.out.println("Error - valor não é um numero"+ ex);
        }


    }
}
