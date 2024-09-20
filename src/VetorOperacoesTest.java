import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VetorOperacoesTest {
    private VetorOperacoes vetorOperacoes;
    private int[] vetor;

    @BeforeEach
    public void setUp() {
        vetorOperacoes = new VetorOperacoes();
        vetor = new int[]{5, 4, 3, 2, 1};
    }

    @Test
    public void testSomarVetor() {
        int numero = 3;
        int[] resultadoEsperado = {8, 7, 6, 5, 4};
        int[] resultado = vetorOperacoes.somarVetor(vetor, numero);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSomarVetorComZero() {
        int numero = 0;
        int[] resultadoEsperado = {5, 4, 3, 2, 1};
        int[] resultado = vetorOperacoes.somarVetor(vetor, numero);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testOrdenarVetor() {
        int[] resultadoEsperado = {1, 2, 3, 4, 5};
        int[] resultado = vetorOperacoes.ordenarVetor(vetor);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testOrdenarVetorJaOrdenado() {
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        int[] resultadoEsperado = {1, 2, 3, 4, 5};
        int[] resultado = vetorOperacoes.ordenarVetor(vetorOrdenado);
        assertArrayEquals(resultadoEsperado, resultado);
    }
}
