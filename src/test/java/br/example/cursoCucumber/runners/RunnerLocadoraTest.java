package br.example.cursoCucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/locadora",
    glue = "br.example.cursoCucumber.steps.locadora",
    monochrome = false,
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    dryRun = false)
public class RunnerLocadoraTest {

}
