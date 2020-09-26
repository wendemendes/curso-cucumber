package br.example.cursoCucumber.steps.aprender;

import java.time.LocalDate;

import br.example.cursoCucumber.service.Calculadora;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class AprenderCucumberSteps {

    private int primeiroValor;
    private int resultado;
    private LocalDate dataEntrega;

    @Given("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
        System.out.println("passou aqui 1");
    }

    @When("executá-lo")
    public void executáLo() {
        System.out.println("passou aqui 2");
    }

    @Then("a especificação deve finalizar com sucesso")
    public void aEspecificaçãoDeveFinalizarComSucesso() {
        System.out.println("passou aqui 3");
    }


    @Given("que o valor do contador é {int}")
    public void queOValorDoContadorÉ(Integer valorInformado) {
        primeiroValor = valorInformado;
    }

    @When("eu incrementar em {int}")
    public void euIncrementarEm(Integer valorASomar) {
        resultado = Calculadora.somar(primeiroValor, valorASomar);
    }

    @Then("o valor do contador será {int}")
    public void oValorDoContadorSerá(Integer valorEsperado) {
        assertEquals(valorEsperado, resultado, 0);
    }

    @Given("que a entrega é dia {int}\\/{int}\\/{int}")
    public void queAEntregaÉDia(Integer dia, Integer mes, Integer ano) {
        dataEntrega = LocalDate.of(ano, mes, dia);
    }

    @When("e a entrega atrasar {int} dias")
    public void eAEntregaAtrasarDias(Integer diasAtraso) {
        dataEntrega = dataEntrega.plusDays(diasAtraso);
    }

    @When("e a entrega atrasar {int} meses")
    public void eAEntregaAtrasarMeses(Integer mesesDeAtraso) {
        dataEntrega = dataEntrega.plusMonths(mesesDeAtraso);
    }


    @Then("a entrega será efetuada em {int}\\/{int}\\/{int}")
    public void aEntregaSeráEfetuadaEm(Integer dia, Integer mes, Integer ano) {
        LocalDate dataEsperada = LocalDate.of(ano, mes, dia);

        assertEquals(dataEsperada, dataEntrega);
    }


}
