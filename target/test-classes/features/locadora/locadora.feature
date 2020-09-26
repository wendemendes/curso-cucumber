Feature: Alugar filme
  Como um usuario
  Eu quero cadastrar aluguéis de filme
  Para controlar preços e datas de entrega

  Scenario: Deve alugar um filme com sucesso
    Given Dado um filme com estoque com 2 unidades
    And que o preço do aluguel seja R$ 3
    When alugar
    Then o preço do aluguel será de R$ 3
    And a data de entrega será em 1 dia
    And o estoque do filme será 1 unidade

  Scenario: Deve alugar um filme sem estoque
    Given Dado um filme com estoque com 0 unidades
    When alugar
    Then não será possível por falta de estoque
    And o estoque do filme será 0 unidade

   Scenario Outline: Deve dar condições conforme tipo de aluguel
      Given Dado um filme com estoque com 2 unidades
      And que o preço do aluguel seja R$ <preco>
      And o tipo de alugue seja <tipoAluguel>
      When alugar
      Then o preço do aluguel será de R$ <valorAluguel>
      And a data de entrega será em <quantidadeDias> dias
      And a pontuação recebida será de <ponto> pontos
     Examples:
       | preco | tipoAluguel | valorAluguel | quantidadeDias | ponto |
       | 4     | extendido   |      8       |      3         |   2   |
       | 4     | comum       |      4       |      1         |   1   |
       | 10    | extendido   |      20      |      3         |   2   |
       | 5     | semanal     |      15      |      7         |   7   |
