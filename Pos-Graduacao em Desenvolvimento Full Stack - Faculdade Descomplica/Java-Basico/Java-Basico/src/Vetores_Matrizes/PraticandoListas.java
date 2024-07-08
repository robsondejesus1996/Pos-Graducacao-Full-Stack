package Vetores_Matrizes;

import java.util.ArrayList;

public class PraticandoListas {

    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<String>();

        bandas.add("Kiss");
        bandas.add("Beatless");
        bandas.add("iron Maide");

        System.out.println(bandas);

        bandas.add(bandas.indexOf("Kiss"), "Capital Inicial");
        System.out.println(bandas);

        bandas.clear();
        System.out.println(bandas);


    }
}
