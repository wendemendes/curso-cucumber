package br.example.cursoCucumber.steps.transformedata;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class TransformeDataSteps {

    private LocalDate dataEntrega;

    @Given("que a entrega é no dia {data}")
    public void queAEntregadÉDia(LocalDate data) {
        dataEntrega = data;
    }

    @When("e a entrega vai atrasar {int} meses")
    public void eAEntregaAtrasadaMeses(Integer meses) {
        dataEntrega = dataEntrega.plusMonths(meses);
    }


    @Then("a entrega será feita em {data}")
    public void aEntregaSeráFeitaEm(LocalDate dataEsperada) {
        assertEquals(dataEsperada, dataEntrega);
    }


}
