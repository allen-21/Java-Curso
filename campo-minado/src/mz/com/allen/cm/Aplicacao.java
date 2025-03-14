package mz.com.allen.cm;

import mz.com.allen.cm.modelo.Tabuleiro;
import mz.com.allen.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,3);
        new TabuleiroConsole(tabuleiro);

    }
}
