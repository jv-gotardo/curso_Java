package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.teste;

import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.dominio.*;
import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.servico.TempoMinEscrita;

public class TextoAcademicoTeste {
    public static void main(String[] args) {
        TextoAcademico artigo = new Artigo("Desafios do Futebol Moderno",
                "Educação Física", NivelAcademico.GRADUACAO, 27);
        TextoAcademico dissertacao = new Dissertacao("Investigação Metaética",
                "Filosofia", 76, NivelAcademico.MESTRADO);
        TextoAcademico tese = new Tese("Derivada do Teorema de Incompletude de" +
                " Gödel", "Matemática", 274, NivelAcademico.DOUTORADO);
//        TextoAcademico tese2 = new Tese("AAA", "AAA", 50,
//                NivelAcademico.DOUTORADO); //Como previsto, resulta numa exceção.

        TempoMinEscrita.TempoEscritaMin(artigo);
        TempoMinEscrita.TempoEscritaMin(dissertacao);
        TempoMinEscrita.TempoEscritaMin(tese);
    }
}
