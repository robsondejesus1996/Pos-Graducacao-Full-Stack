package POO.interfaceC;

public class Principal {

    public static void main(String[] args) {
        Conta cp = new Poupanca();

        cp.depositar(732);
        cp.sacar(8);
        System.out.println(cp.getSaldo());
    }
}
