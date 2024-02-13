package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    void adcionarCompras(Compra compra){
        this.compras.add(compra);
    }
    double obterTotal(){
        double total = 0;
        for(Compra compra: compras){
            total += compra.obterValorTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" +
                "Total gasto; " + this.obterTotal();
    }
}
