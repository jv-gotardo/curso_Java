package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.teste;

import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio.AlbumV1;
import pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio.MusicaV1;
import pacote.primeiro.javaprojeto.javanced.Goptional.dominio.Musica;

public class AlbumV1Teste {
    public static void main(String[] args) {
        //Teste de classes em associação;
        MusicaV1 mv1 = new MusicaV1("Atrocity Exhibition");
        MusicaV1 mv2 = new MusicaV1("Isolation");
        MusicaV1 mv3 = new MusicaV1("Passover");
        MusicaV1 mv4 = new MusicaV1("Colony");
        MusicaV1 mv5 = new MusicaV1("A Means to An End");
        MusicaV1 mv6 = new MusicaV1("Heart and Soul");
        MusicaV1 mv7 = new MusicaV1("Twenty Four Hours");
        MusicaV1 mv8 = new MusicaV1("The Eternal");
        MusicaV1 mv9 = new MusicaV1("Decades");
        MusicaV1[] lav1 = {mv1, mv2, mv3, mv4, mv5, mv6, mv7, mv8, mv9};
        AlbumV1 albumv1 = new AlbumV1("Closer", lav1);
        //Para impressão:
        System.out.println(albumv1.getNome() + "\n");
        albumv1.impressaoFaixas();
    }
}
