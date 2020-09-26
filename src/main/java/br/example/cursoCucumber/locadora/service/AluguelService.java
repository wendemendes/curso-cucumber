package br.example.cursoCucumber.locadora.service;

import java.time.LocalDate;

import br.example.cursoCucumber.locadora.TipoAluguel;
import br.example.cursoCucumber.locadora.model.Filme;
import br.example.cursoCucumber.locadora.model.NotaAluguel;

public class AluguelService {

    public NotaAluguel alugar(Filme filme, TipoAluguel tipoAluguel) {

        if (filme.semEstoque()) {
            throw new RuntimeException("Filme sem estoque");
        }

        filme.decrementarEstoque();

        return new NotaAluguel(filme.getValorAluguel(), tipoAluguel);
    }

}
