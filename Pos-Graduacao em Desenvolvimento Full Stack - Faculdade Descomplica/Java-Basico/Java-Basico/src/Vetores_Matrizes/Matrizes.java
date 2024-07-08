package Vetores_Matrizes;

public class Matrizes {

    public static void main(String[] args) {
        //linhas, colunas
        int[][] dados = new int[3][3];


        //dados[0][0] = 1;
        //dados[0][1] = 2;
        //dados[0][2] = 3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                dados[i][j] = j;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(dados[i][j]);
            }
        }



    }
}
