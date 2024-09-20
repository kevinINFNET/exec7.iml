import java.util.Arrays;

public class VetorOperacoes {

    public int[] somarVetor(int[] vetor, int numero) {
        int[] resultado = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = vetor[i] + numero;
        }
        return resultado;
    }

    public int[] ordenarVetor(int[] vetor) {
        int[] ordenado = Arrays.copyOf(vetor, vetor.length); // Cria uma cópia do vetor original
        Arrays.sort(ordenado); // Ordena o vetor usando o método sort da classe Arrays
        return ordenado;
    }
}
