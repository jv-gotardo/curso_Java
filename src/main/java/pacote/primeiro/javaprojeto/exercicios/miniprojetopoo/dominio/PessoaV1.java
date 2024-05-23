package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

//A Classe abstrata é feita para ser extendida e ser uma superclasse;
//Métodos abstratos são obrigatórios a serem implementados; no caso das classes
//abstratas, de suas subclasses;
public abstract class PessoaV1 {
    protected String nome;

    public PessoaV1(String nome){
        this.nome = nome;
    }
    public abstract void idade(double idade);
}
