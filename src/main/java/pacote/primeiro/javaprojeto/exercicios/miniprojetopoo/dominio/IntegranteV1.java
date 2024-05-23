package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

public class IntegranteV1 extends PessoaV1 implements Cidade{
    private String nome;
    private String funcao;
    private TipoContrato contrato;
    private BandaV1 banda;
    private int showsfeitos;
    private int meses;

    public IntegranteV1(String nome, String funcao, TipoContrato contrato, BandaV1 banda,
                        int showsfeitos, int meses){
        super(nome);
        this.funcao = funcao;
        this.contrato = contrato;
        this.banda = banda;
        this.showsfeitos = showsfeitos;
        this.meses = meses;
    }

    //Sobrepõe o método da classe-pai
    @Override
    public void idade(double idade) {
        idade = 20;
    }

    //Implementação de interface
    @Override
    public String cidade(){
        return "Blackpool";
    }

    @Override
    public String toString() {
        return "IntegranteV1{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", contrato=" + contrato +
                ", banda=" + banda +
                ", showsfeitos=" + showsfeitos +
                ", meses=" + meses +
                '}';
    }

    public String getNome(){
        return this.nome;
    }

    public String getFuncao(){
        return this.funcao;
    }

    public TipoContrato getContrato(){
        return this.contrato;
    }

    public BandaV1 getBanda(){
        return this.banda;
    }

    public int getShowsfeitos(){
        return this.showsfeitos;
    }

    public int getMeses(){
        return this.meses;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public void setContrato(TipoContrato contrato){
        this.contrato = contrato;
    }

    public void setBanda(BandaV1 banda){
        this.banda = banda;
    }

    public void setShowsfeitos(int showsfeitos){
        this.showsfeitos = showsfeitos;
    }

    public void setMeses(int meses){
        this.meses = meses;
    }
}
