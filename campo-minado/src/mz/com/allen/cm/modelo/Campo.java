package mz.com.allen.cm.modelo;

import mz.com.allen.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int linha;
    private final int coluna;

    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    // Adiciona um campo vizinho, garantindo que ele seja adjacente
    boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;
// Vizinhos ortogonais
        if (deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal) { // Vizinhos diagonais
            vizinhos.add(vizinho);
            return true;
        } else {
            return false;
        }

    }

    // Alterna a marcação do campo (usado para bandeiras)
    void alternarMarcacao() {
        if (!aberto) {
            marcado = !marcado;
        }
    }

    // Abre o campo, lançando exceção se estiver minado
    boolean abrir() {
        if (!aberto && !marcado) {
            aberto = true;
            if (minado) {
                throw new ExplosaoException();

            }
            // Se a vizinhança for segura, abre os vizinhos recursivamente
            if (vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        } else {
            return false;
        }

    }

    // Verifica se todos os vizinhos são seguros (não minados)
    boolean vizinhancaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    void minar() {
        minado = true;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public boolean isAberto() {
        return true;
    }

    public boolean isFechado() {
        return !isAberto();
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    // Verifica se o objetivo foi alcançado (campo aberto ou minado corretamente marcado)

    boolean objetivoAlcancado() {
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;

        return desvendado || protegido;
    }
    // Conta quantas minas existem nos campos vizinhos

    long minasVizinhanca() {
        return vizinhos.stream().filter(v -> v.minado).count();
    }
    // Reinicia o estado do campo

    void reiniciar() {
        aberto = false;
        minado = false;
        marcado = false;
    }
    // Representação textual do campo no jogo

    public String toString() {
        if (marcado) {
            return "x";
        } else if (aberto && minado) {
            return "*";
        } else if (aberto && minasVizinhanca() > 0) {
            return Long.toString(minasVizinhanca());

        } else if (aberto) {
            return " ";

        } else {
            return "?";
        }
    }
}
