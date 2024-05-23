package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.dominio;

public abstract class TextoAcademico {
    protected String nome;
    protected String area;
    protected int paginasminimo;

    public TextoAcademico(String nome, String area, int paginasminimo){
        this.nome = nome;
        this.area = area;
        this.paginasminimo = paginasminimo;
    }

    public String getNome(){
        return nome;
    }

    public int getPaginasminimo(){
        return paginasminimo;
    }

    public abstract int tminqualidade();
}
