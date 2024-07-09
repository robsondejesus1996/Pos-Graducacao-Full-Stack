package POO.pratica;

public class Principal {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setNome("Bidu");

        Gato g = new Gato();
        g.setNome("Lola");

        c.mostrar();

        g.mostar();
    }
}
