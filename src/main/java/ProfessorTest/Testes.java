package ProfessorTest;
import main.professor.Autenticador;
import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import main.professor.Json;
public class Testes {
    // Testes para dar ruim
    @Test
    public void testeNomeInvalidoCliente() {
        String nome = "12345";
        boolean resultado = Autenticador.validaNome(nome);
        assertFalse(resultado); // Espera-se que o resultado seja falso (nome inválido).
    }
    @Test
    public void testeSalaInvalidaInicial() {
        int sala = 35;
        boolean resultado = Autenticador.validaSala(sala);
        assertFalse(resultado);
    }
    @Test
    public void testePeriodoIndefinido() {
        String periodo = "manhã";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testeHorarioForaLimite() {
        String horario = "25:00";
        boolean resultado = Autenticador.validarHora(horario);
        assertFalse(resultado);
    }
    @Test
    public void testePredioForaDoLimite() {
        int numeroPredio = 35;
        boolean resultado = Autenticador.validaPredio(numeroPredio, 1, 30);
        assertFalse(resultado);
    }
    @Test
    public void testePredioNegativoInvalido() {
        int numeroPredio = -5;
        boolean resultado = Autenticador.validaPredio(numeroPredio, 1, 30);
        assertFalse(resultado);
    }
    @Test
    public void testePeriodoNaoDefinido() {
        String periodo = "";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testePeriodoSemDefinicao() {
        String periodo = "manhã";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testeHorarioNuloInvalido() {
        String horario = "";
        boolean resultado = Autenticador.validarHora(horario);
        assertFalse(resultado);
    }
    @Test
    public void testeSalaNulaInvalida() {
        int sala = 0; // Sala 0 é inválida.
        boolean resultado = Autenticador.validaSala(sala);
        assertFalse(resultado);
    }

    //Testes para dar  bom
    @Test
    public void testeNomeValidoCliente() {
        String nome = "João da Silva";
        boolean resultado = Autenticador.validaNome(nome);
        assertTrue(resultado); // Espera-se que o resultado seja verdadeiro (nome válido).
    }
    @Test
    public void testeHorarioDentroLimite() {
        String horario = "14:00";
        boolean resultado = Autenticador.validarHora(horario);
        assertTrue(resultado);
    }
    @Test
    public void testePeriodoDefinido() {
        String periodo = "integral";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertTrue(resultado);
    }
    @Test
    public void testeSalaValidaInicial() {
        int sala = 15;
        boolean resultado = Autenticador.validaSala(sala);
        assertTrue(resultado);
    }
    @Test
    public void testeDiaSemRestricoes() {
        String dia = "domingo";
        boolean resultado = Autenticador.validarDia(dia);
        assertTrue(resultado);
    }
    @Test
    public void testePredioDentroLimite() {
        int numeroPredio = 10;
        boolean resultado = Autenticador.validaPredio(numeroPredio, 1, 30);
        assertTrue(resultado);
    }
    @Test
    public void testePeriodoNoturnoDefinido() {
        String periodo = "noturno";
        boolean resultado = Autenticador.validaPeriodo(periodo);
        assertTrue(resultado);
    }
    @Test
    public void testeTodasInformacoesValidas() {
        // Dados de entrada válidos
        String nome = "João da Silva";
        String dia = "segunda-feira";
        String horario = "14:00";
        String periodo = "integral";
        int sala = 15;
        String jsonFile = Json.createJson(sala, nome, dia + " " + horario, periodo, sala);
        assertTrue(jsonFile != null && !jsonFile.isEmpty());
    }
    @Test
    public void testeDiaValido() {
        String dia = "segunda-feira";
        boolean resultado = Autenticador.validarDia(dia);
        assertTrue(resultado);
    }
    @Test
    public void testeSalaMinimaPermitida() {
        int sala = 1;
        boolean resultado = Autenticador.validaSala(sala);
        assertTrue(resultado);
    }
}