package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

public class AlbumV1 {
    private String nome;
    private int[] faixas; //O int[] foi substituído por MusicaV1[];

    //associação
    private MusicaV1[] faixas2; //Cria uma nova lista de faixas, dessa vez com MusicaV1 invés de int

    private static double preco = 19.99;
    //O modificador static indica que o preço é inerente à classe e não às suas instâncias.

    //bloco de inicialização
//    {
//        faixas = new int[70];
//        for(int i = 0; i <= faixas.length; i++){
//            faixas[i] = i;
//        }
//    }

    public AlbumV1(String nome, MusicaV1[] faixas2){
        this.nome = nome;
        //Inicializando o atributo no construtor:
//        for(int faixa:this.faixas){
//            System.out.println(faixa);
//        }
        //Para cada faixa na lista de faixas, imprima a faixa (length: length de faixas (9));
        this.faixas2 = faixas2;

    }

    public void impressaoFaixas(){
        for(MusicaV1 musica : this.faixas2){
            System.out.println(musica.getNome()); //Se você não colocar o getNome(), serão
            //impressas as posições da memória, obviamente.
        }
    }

    public String getNome(){
        return nome;
    }
    public int[] getFaixas(){
        return faixas;
    }

    public static double getPreco(){
        return preco;
    }

    public MusicaV1[] getFaixas2(){
        return faixas2;
    }

    public void setFaixas2(MusicaV1[] faixas2){
        this.faixas2 = faixas2;
    }

}
