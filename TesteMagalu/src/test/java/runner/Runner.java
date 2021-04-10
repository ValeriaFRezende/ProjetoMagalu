package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(


//caminho das feature
features = "src/test/resources/features/",

//pacote das classes de testes
glue = "test",

//format BDD
monochrome = true,

 // nome da tag no arquivo gherkins para executar os casos de testes correspondentes
tags ="@executa",

//formatar  visualizar do codigo no console | report html
plugin = {"pretty","html:target/report.html"},

//valida se existem feature sem steps implementados,padrao deixar false
dryRun = false)
public class Runner {

}
