package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.servico;

import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo2.dominio.TextoAcademico;

//Uso do polimorfismo
public class TempoMinEscrita {
    public static void TempoEscritaMin(TextoAcademico texto){
        System.out.println("Tipo de Texto: " + texto.getNome());
        System.out.println("Mínimo de Páginas: " + texto.getPaginasminimo());
        System.out.println("Tempo de Escrita: " + texto.tminqualidade());
    }
}
