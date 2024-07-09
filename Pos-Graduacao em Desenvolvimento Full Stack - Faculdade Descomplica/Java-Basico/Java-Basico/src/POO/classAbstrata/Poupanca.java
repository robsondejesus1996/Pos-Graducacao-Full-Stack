package POO.classAbstrata;

public class Poupanca extends Conta{
    @Override
    public void imprimeExtrato() {
        System.out.println("Saldo da conta: "+ this.getSaldo());
    }
}
