package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.dominio;

public class Tese extends TextoAcademico{
    public static final int PAGINAS = 200;
    public NivelAcademico nivel;

    public Tese(String nome, String area, int paginasminimo, NivelAcademico minimo){
        super(nome, area, paginasminimo);
        this.nivel = minimo;
        if(PAGINAS < 200){
            throw new IllegalArgumentException();
        }
        if(nivel != NivelAcademico.DOUTORADO){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int tminqualidade(){
        int tminpag = 40;
        return PAGINAS*tminpag;
    }
}
