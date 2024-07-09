package POO.composicao;

public class Pedido {

    private Itens i;


    //pedido tem um item => composição
    public Pedido(){
        i = new Itens();
    }
}
