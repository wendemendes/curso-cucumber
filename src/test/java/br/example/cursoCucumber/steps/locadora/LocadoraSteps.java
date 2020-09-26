package br.example.cursoCucumber.steps.locadora;

import java.time.LocalDate;

import br.example.cursoCucumber.locadora.TipoAluguel;
import br.example.cursoCucumber.locadora.model.Filme;
import br.example.cursoCucumber.locadora.model.NotaAluguel;
import br.example.cursoCucumber.locadora.service.AluguelService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LocadoraSteps {

    private Filme filme;
    private AluguelService aluguelService = new AluguelService();
    private NotaAluguel notaAluguel;
    private String mensagemValidacao;
    private TipoAluguel tipoAluguel;

    @Given("Dado um filme com estoque com {int} unidades")
    public void dadoUmFilmeComEstoqueComUnidades(Integer estoque) {
        filme = new Filme();
        filme.setEstoque(estoque);
    }


    @Given("que o preço do aluguel seja R$ {int}")
    public void queOPreçoDoAluguelSejaR$(Integer valorAluguel) {
        filme.setValorAluguel(valorAluguel);
    }

    @When("alugar")
    public void alugar() {
        try {
            notaAluguel = aluguelService.alugar(filme, tipoAluguel);
        } catch (RuntimeException e) {
            mensagemValidacao = e.getMessage();
        }

    }

    @Then("o preço do aluguel será de R$ {int}")
    public void oPreçoDoAluguelSeráDeR$(Integer precoEsperado) {
        assertEquals(precoEsperado, notaAluguel.getPrecoFinalAluguel(), 0);
    }

    @Then("o estoque do filme será {int} unidade")
    public void oEstoqueDoFilmeSeráUnidade(Integer estoqueEsperado) {
        assertEquals(estoqueEsperado, filme.getEstoque(), 0);
    }

    @Then("não será possível por falta de estoque")
    public void nãoSeráPossívelPorFaltaDeEstoque() {
        assertEquals("Filme sem estoque", mensagemValidacao);
    }

    @Given("^o tipo de alugue seja (.*)$")
    public void oTipoDeAlugueSeja(String tipoAluguel) {
        this.tipoAluguel = TipoAluguel.valueOf(tipoAluguel.toUpperCase());
    }

    @Then("^a data de entrega será em (\\d+) dias?$")
    public void aDataDeEntregaSeráEmDias(Integer dias) {
        LocalDate dataDeAmanha = LocalDate.now().plusDays(dias);
        assertEquals(dataDeAmanha, notaAluguel.getDataEntrega());
    }
    @Then("a pontuação recebida será de {int} pontos")
    public void aPontuaçãoRecebidaSeráDePontos(Integer pontuacaoEsperada) {
        assertEquals(pontuacaoEsperada, notaAluguel.getPontuacao(), 0);

    }

}
