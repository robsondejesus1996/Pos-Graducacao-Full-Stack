package conditional;

import java.util.Scanner;

public class CadastroSwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n");
        System.out.println("1 - Cadastrar aluno: \n");
        System.out.println("2 - Cadastrar notas: \n");
        System.out.println("3 - Listar alunos e nota: \n");

        int numero = entrada.nextInt();

        switch (numero){
            case 1:
                System.out.println("Vamos cadastrar aluno");
            break;

            case 2:
                System.out.println("Vamos cadastrar nota");
            break;

            case 3:
                System.out.println("Vamos listar alunos");
            break;

            default:
                System.out.println("Operação invalida");
        }
    }
}
