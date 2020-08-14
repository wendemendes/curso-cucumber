@TransformerData
Feature: Aprender Transformar data

  Scenario: Deve calcular atraso na entrega
    Given que a entrega é no dia 05/04/2020
    When e a entrega vai atrasar 2 meses
    Then a entrega será feita em 05/06/2020