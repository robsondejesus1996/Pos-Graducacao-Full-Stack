package POO;

public class Cao {

    String nome;
    String cor;
    private int idade;
    double peso;

    public void setIdade(int idade){
        idade = idade;
    }

    public int getIdade(){
        return idade;
    }


    public Cao(){
        cor = "Caramelo";
    }

    public Cao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void Anda(){
        System.out.println("Estou andando..." + cor);
    }

    public boolean VerificarIdade(){
        if(idade > 10){
            System.out.println("maior que 10");
            return true;
        }else{
            System.out.println("Menor que 10");
            return false;
        }
    }

    public void DadosCao(){
        System.out.println(nome + " tem " + idade + " anos de idade");
    }
}
