package br.example.cursoCucumber.steps.passagem;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassagemSteps {

    @Given("que o ticket é {string}")
    public void queOTicketÉ(String string) {

    }

    @And("que o ticket especial é {string}")
    public void queOTicketEspecialÉ(String string) {

    }


    @And("que o valor da passagem é R$ {double}")
    public void queOValorDaPassagemÉR$(Double double1) {

    }

    @And("que o nome do passageiro é {string}")
    public void queONomeDoPassageiroÉ(String string) {

    }

    @And("que o telefone do passageiro é {int}-{int}")
    public void queOTelefoneDoPassageiroÉ(Integer int1, Integer int2) {

    }

    @When("criar os steps")
    public void criarOsSteps() {

    }

    @Then("o teste vai funcionar")
    public void oTesteVaiFuncionar() {

    }

}
