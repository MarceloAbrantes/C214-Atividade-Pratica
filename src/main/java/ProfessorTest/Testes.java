package ProfessorTest;
import main.professor.Autenticador;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class Testes {
    // Testes para dar ruim
    @Test
    public void testeValidacaoNomeInvalido() {
        String nome = "12345";
        boolean resultado = Autenticador.validaNome(nome);
        assertFalse(resultado); // Espera-se que o resultado seja falso (nome inválido).
    }
    @Test
    public void testeValidacaoSalaInvalida() {
        int sala = 35;
        boolean resultado = Autenticador.validaSala(sala);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoPeriodoInvalido() {
        String periodo = "manhã";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoHorarioInvalido() {
        String horario = "25:00";
        boolean resultado = Autenticador.validarHora(horario);
        assertFalse(resultado);
    }
    @Test
    public void testePredioForaDoIntervalo() {
        int numeroPredio = 35;
        boolean resultado = Autenticador.validaPredio(numeroPredio, 1, 30);
        assertFalse(resultado);
    }
    @Test
    public void testePredioNegativo() {
        int numeroPredio = -5;
        boolean resultado = Autenticador.validaPredio(numeroPredio, 1, 30);
        assertFalse(resultado);
    }
    @Test
    public void testePeriodoVazio() {
        String periodo = "";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testePeriodoInvalido() {
        String periodo = "manhã";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoHorarioVazio() {
        String horario = "";
        boolean resultado = Autenticador.validarHora(horario);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoSalaVazia() {
        int sala = 0; // Sala 0 é inválida.
        boolean resultado = Autenticador.validaSala(sala);
        assertFalse(resultado);
    }
}