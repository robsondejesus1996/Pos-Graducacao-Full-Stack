package POO.pratica;

public class Animal {

    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void Comer(){
        System.out.println("Eu gosto de comer.");

    }
}
