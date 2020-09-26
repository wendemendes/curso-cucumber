package br.example.cursoCucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/aprenderCucumber",
    tags = "@AprenderCucumber",
    glue = "br.example.cursoCucumber.steps.aprender",
    monochrome = true,
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerAprenderTest {

}
