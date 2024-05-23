package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

public class BandaV1 {
    protected String nome;

    public BandaV1(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //toString()
    @Override //Indica que a declaração do método é feita para sobrepor uma declaração do método em um supertipo.
    public String toString(){
        return "BandaV1{" +
                "nome='" + nome + '\'' + '}';
    }
}
