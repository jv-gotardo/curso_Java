package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.dominio;

public enum NivelAcademico {
    GRADUACAO("Graduação"),
    POSGRAD_LATOSENSU("Pós-Graduação"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado");
    public String nivel;
    NivelAcademico(String nivel){
        this.nivel = nivel;
    }
}
