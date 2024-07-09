package POO.sobreescrita;


class Linguagem{
    public void mostarInformacao(){
        System.out.println("Lingua Portuguesa");
    }


}

class Java extends Linguagem{
    public void mostarInformacao(){
        System.out.println("Linguagem Java");
    }
}



public class main {

    public static void main(String[] args) {
        Java j1 = new Java();

        j1.mostarInformacao();

        Linguagem l1 = new Linguagem();

        l1.mostarInformacao();
    }
}
