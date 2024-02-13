package oo.composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adcionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }
    double valorTotal(){
        double totla =0;
        for (Item item: itens){
            totla += item.quantidade * item.preco;
        }
        return totla;
    }

}
