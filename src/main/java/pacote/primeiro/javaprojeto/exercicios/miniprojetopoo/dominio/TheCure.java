package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

import java.util.Arrays;

public class TheCure extends BandaV1{
    private String[] albuns;

    //uso do FINAL
    private final int ANO_FUND = 1977;

    //uso da herança
    public TheCure(String nome, String[] albuns){
        super(nome); //Usando o super para herdar o nome
        this.albuns = albuns;
    }

    public void imprimirAlbuns(){
        for(String album : albuns){
            System.out.println(album);
        }
    }

    @Override
    public String toString(){
        //a classe Arrays tem um método para converter os elementos de uma array de Strings; contudo,
        //se for requisitada a impressão de elementos separados, deve-se ainda usar o foreach.
        return "Nome: " + nome + "\nÁlbuns: " + Arrays.toString(albuns) +
                "\nAno de Fundação: " + ANO_FUND;
    }
}
