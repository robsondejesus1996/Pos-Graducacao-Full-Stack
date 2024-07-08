package POO;

public class POO {
    public static void main(String[] args) {

        Cao cao = new Cao();

        cao.nome = "Bobby";
        cao.cor = "Caramelo";
        cao.setIdade(5);
        cao.peso = 12.4;

        cao.Anda();

        Cao dog = new Cao("Lulu", 12);
        dog.DadosCao();
        dog.VerificarIdade();

        if(cao.VerificarIdade()){
            System.out.println("Ele é idoso");
        }else{
            System.out.println("é novinho");
        }
    }
}
