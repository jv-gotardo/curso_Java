package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.dominio;

public class Artigo extends TextoAcademico{
    public static final int PAGINAS = 15;

    public NivelAcademico nivel;

    public Artigo(String nome, String area, NivelAcademico nminimo, int paginasminimo){
        super(nome, area, paginasminimo);
        this.nivel = nminimo;
        if(PAGINAS < 15){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int tminqualidade(){
        int tminpag = 7;
        return PAGINAS*tminpag;
    }
}
