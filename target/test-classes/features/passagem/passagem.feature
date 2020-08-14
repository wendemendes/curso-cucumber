@Passagens
Feature: Compra de passagem

  Scenario: Deve criar steps genéricos para estes passos
    Given que o ticket é "AF345"
    And que o valor da passagem é R$ 230,45
    And que o nome do passageiro é "Fulano da Silva"
    And que o telefone do passageiro é 9999-9999
    When criar os steps
    Then o teste vai funcionar

  Scenario: Deve reaproveitar os steps "Dado" do cenário anterior
    Given que o ticket é "AB167"
    And que o ticket especial é "AB167"
    And que o valor da passagem é R$ 1120,23
    And que o nome do passageiro é "Cicrano de Oliveira"
    And que o telefone do passageiro é 9888-8888
