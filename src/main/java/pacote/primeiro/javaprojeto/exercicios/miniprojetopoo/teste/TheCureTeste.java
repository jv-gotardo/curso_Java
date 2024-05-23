package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.teste;

import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio.TheCure;

public class TheCureTeste {
    public static void main(String[] args){
        String[] thecuregothicalbums = {"Seventeen Seconds", "Faith", "Pornography"};
        TheCure theCure = new TheCure("The Cure", thecuregothicalbums);
        System.out.println(theCure);
    }
}
