package br.example.cursoCucumber.locadora.model;

public class Filme {

    private int estoque;
    private int valorAluguel;

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }


    public int getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(int valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void decrementarEstoque(){
        estoque--;
    }

    public boolean semEstoque() {
        return estoque == 0;
    }
}
