package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    void adcionarItem(Produto produto, int quantidade){
        itens.add(new Item(produto,quantidade));
    }

    double obterValorTotal(){
        double total = 0;
         for (Item item: itens){
             total += item.quantidade * item.produto.preco;
         }
         return total;
    }
}
