package Vetores_Matrizes;


import java.util.ArrayList;

public class ArrayListPratica {

    public static void main(String[] args) {

        ArrayList<String> estados = new ArrayList<>();

        estados.add("Santa Catarina");
        estados.add("São Paulo");


        estados.remove("São Paulo");

        System.out.println(estados);

        System.out.println(estados.contains("Rio de Janeiro"));
    }
}
