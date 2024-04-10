package pacote.primeiro.javaprojeto.exercicios;

public class l5ex7 {
    public static void main(String[] args) {
        int contador = 1, linhas=5, c1=1, c2=1;
        while(c1 <= linhas){
            while(c2 <= c1){
                System.out.println(contador + " ");
                contador += 1;
            }
            System.out.println("\n");
        }
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(contador + " ");
                contador += 1;
            }
            System.out.println("\n");;
        }
    }
}