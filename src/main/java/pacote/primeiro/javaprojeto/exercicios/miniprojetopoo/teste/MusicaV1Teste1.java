package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.teste;

import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio.MusicaV1;

public class MusicaV1Teste1 {
    public static void main(String[] args) {
        //o new é utilizado para criar novas instâncias;
        MusicaV1 mv1a = new MusicaV1("Jigsaw Falling Into Place", 2007, "Radiohead"
            , "In Rainbows", "Rock");
        System.out.println("Nome: " + mv1a.getNome());
        System.out.println("Ano: " + mv1a.getAno());
        System.out.println("Banda: " + mv1a.getBanda());
//        System.out.println("Álbum: " + mv1a.getAlbum());
        System.out.println("Gênero: " + mv1a.getGenero());
    }
}
