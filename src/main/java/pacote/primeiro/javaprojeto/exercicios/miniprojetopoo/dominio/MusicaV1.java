package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

public class MusicaV1 {
    private String nome;
    private int ano;
    private String banda; //Criando atributos
//    private String album;
    private String genero;

    //Construtor;
    public MusicaV1(String nome, int ano, String banda, String album, String genero){
        this.nome = nome;
        this.ano = ano;
        this.banda = banda;
//        this.album = album;
        this.genero = genero;
    }

    public MusicaV1(String nome){
        this.nome = nome;
    }

    //get é criado com o mesmo tipo do atributo; set é void;
    //Métodos:
    public String getNome(){
        return nome;
    }
    public int getAno(){
        return ano;
    }
    public String getBanda(){
        return banda;
    }

    //public String getAlbum(){return album;}

    public String getGenero(){
        return genero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void SetAno(int ano){
        this.ano = ano;
    }
    public void setBanda(String banda){
        this.banda = banda;
    }
    //public void setAlbum(String album){this.album = album;}
    public void setGenero(String genero){
        this.genero = genero;
    }
}
