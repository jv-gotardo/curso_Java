package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

public class BandaV1 {
    protected String nome;
    private double cache_medio;

    public BandaV1(String nome){
        this.nome = nome;
    }

    public BandaV1(String nome, double cache_medio){
        this.nome = nome;
        this.cache_medio = cache_medio;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getCache_medio() {
        return cache_medio;
    }

    public void setCache_medio(double cache_medio) {
        this.cache_medio = cache_medio;
    }

    //toString()
    @Override //Indica que a declaração do método é feita para sobrepor uma declaração do método em um supertipo.
    public String toString(){
        return "BandaV1{" +
                "nome='" + nome + '\'' + '}';
    }
}
