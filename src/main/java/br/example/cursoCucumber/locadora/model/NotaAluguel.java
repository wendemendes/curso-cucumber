package br.example.cursoCucumber.locadora.model;

import java.time.LocalDate;

import br.example.cursoCucumber.locadora.TipoAluguel;

public class NotaAluguel {

    private int valorAluguel;
    private LocalDate dataEntrega;
    private TipoAluguel tipoAluguel;
    private int precoFinalAluguel;
    private int pontuacao;

    public NotaAluguel(int valorAluguel, TipoAluguel tipoAluguel) {
        this.valorAluguel = valorAluguel;
        this.tipoAluguel = tipoAluguel;
        calcular();
    }

    private void calcular() {

        if(isPeriodoExtendido()){
            pontuacao = 2;
            precoFinalAluguel = valorAluguel * 2;
            dataEntrega = LocalDate.now().plusDays(3);
        }else if(isPeriodoSemanal()){
            pontuacao = 7;
            precoFinalAluguel = valorAluguel * 3;
            dataEntrega = LocalDate.now().plusDays(7);
        }else {
            pontuacao = 1;
            precoFinalAluguel = valorAluguel;
            dataEntrega = LocalDate.now().plusDays(1);
        }
    }

    private boolean isPeriodoExtendido() {
        return TipoAluguel.EXTENDIDO.equals(tipoAluguel);
    }

    private boolean isPeriodoSemanal() {
        return TipoAluguel.SEMANAL.equals(tipoAluguel);
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public int getPrecoFinalAluguel() {
        return precoFinalAluguel;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
