package oo.heranca.desafio;

public interface Luxo {
    void ligarAr();
    void desligarAc();
    default int velocidadeDoAr(){
     return 1;
    }
}
