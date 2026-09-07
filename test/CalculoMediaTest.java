import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculoMediaTest {
    @Test
    public void testarCenarioAprovado() {
        // Instancia a classe que será testada
        CalculoMedia app = new CalculoMedia();

        // Simulando com notas fixas, para média ser igual a 8.0 e status APROVADO
        double mediaCalculada = app.calcularMediaFinal(7.0, 8.0, 9.0);
        String statusVerificado = app.verificarStatusMediaFinal(mediaCalculada);

        assertEquals(8.0, mediaCalculada, 0.001);
        assertEquals("APROVADO", statusVerificado);
    }

    @Test
    public void testarCenarioEmRecuperacao() {
        CalculoMedia app = new CalculoMedia();

        // Simulando com notas fixas, para média igual a 6.0 e status EM RECUPERAÇÃO
        double mediaCalculada = app.calcularMediaFinal(8.0, 6.0, 4.0);
        String statusVerificado = app.verificarStatusMediaFinal(mediaCalculada);

        assertEquals(6.0, mediaCalculada, 0.001);
        assertEquals("EM RECUPERAÇÃO", statusVerificado);

    }

    @Test
    public void testarCenarioReprovado() {
        CalculoMedia app = new CalculoMedia();

        // Simulando com notas fixas, para média igual a 2.0 e status "REPROVADO"
        double mediaCalculada = app.calcularMediaFinal(2.0, 3.0, 1.0);
        String statusVerificado = app.verificarStatusMediaFinal(mediaCalculada);

        assertEquals(2.0, mediaCalculada, 0.001);
        assertEquals("REPROVADO", statusVerificado);
    }
}