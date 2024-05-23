package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.teste;

import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio.BandaV1;
import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio.IntegranteV1;
import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio.TipoContrato;

public class IntegranteV1Teste {
    public static void main(String[] args) {
        BandaV1 bv1 = new BandaV1("Deep Purple", 75295.20);
        IntegranteV1 it1 = new IntegranteV1("Ian Gillan", "vocalista",
                TipoContrato.EFETIVO_COMP, bv1, 72, 12);
        IntegranteV1 it2 = new IntegranteV1("Ritchie Blackmore", "guitarrista",
                TipoContrato.EFETIVO_COMP, bv1, 48, 8);
        IntegranteV1 it3 = new IntegranteV1("Joe Satriani", "guitarrista",
                TipoContrato.TEMPORARIO, bv1, 24, 4);
        IntegranteV1 it4 = new IntegranteV1("Jon Lord", "tecladista",
                TipoContrato.EFETIVO_COMP, bv1, 72, 12);
        IntegranteV1 it5 = new IntegranteV1("Ian Paice", "baterista",
                TipoContrato.EFETIVO, bv1, 72, 12);
        IntegranteV1 it6 = new IntegranteV1("Roger Glover", "baixista",
                TipoContrato.EFETIVO, bv1, 72, 12);
        IntegranteV1 it7 = new IntegranteV1("Andrew Kettering", "violinista",
                TipoContrato.TURNE, bv1, 27, 5);
        System.out.println(it1);
        System.out.println(it2);
        System.out.println(it3);
        System.out.println(it4);
        System.out.println(it5);
        System.out.println(it6);
        System.out.println(it7);
        System.out.println(TipoContrato.EFETIVO_COMP.adicional(bv1.getCache_medio()));
        System.out.println(TipoContrato.EFETIVO.adicional(bv1.getCache_medio()));
        System.out.println(TipoContrato.TEMPORARIO.adicional(bv1.getCache_medio()));
        System.out.println(TipoContrato.TURNE.adicional(bv1.getCache_medio()));
    }
}
