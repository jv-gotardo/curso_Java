package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.dominio;

public class Dissertacao extends TextoAcademico{
    public static final int PAGINAS = 60;
    public NivelAcademico nivel;

    public Dissertacao(String nome, String area, int paginasminimo, NivelAcademico nminimo){
        super(nome, area, paginasminimo);
        this.nivel = nminimo;
        if(PAGINAS < 60){
            throw new IllegalArgumentException();
        }
        if(nivel != NivelAcademico.MESTRADO || nivel != NivelAcademico.DOUTORADO){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int tminqualidade(){
        int tminpag = 15;
        return PAGINAS*tminpag;
    }
}
