package pacote.primeiro.javaprojeto.exercicios.miniprojetopoo.dominio;

public enum TipoContrato {
    EFETIVO_COMP(1, 15000.00){
        @Override
        public double adicional(double cache){
            return cache*0.15;
        }
    },
    EFETIVO(2, 10000.00){
        @Override
        public double adicional(double cache){
            return cache*0.1;
        }
    },
    TEMPORARIO(3, 6000.00){
        @Override
        public double adicional(double cache){
            return cache*0.05;
        }
    },
    TURNE(4, 3000.00){
        @Override
        public double adicional(double cache){
            return cache*0.025;
        }
    };

    //Criação de um código para os tipos de contrato
    public final int CODIGO;
    public double salario_Base;
    //Construtor da enumeração
    TipoContrato(int codigo, double sb){
        this.CODIGO = codigo;
        this.salario_Base = sb;
    }
    //pagamento por cachê
    //um método abstrato significa que ele não existe por si mesmo, mas a partir de
    //seus usos; as enumerações devem implementá-lo.
    public abstract double adicional(double cache);
}
