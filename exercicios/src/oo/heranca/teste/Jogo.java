package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Monstro(10,10);

        Jogador j2 = new Heroi(10,10);

        System.out.println("Vida do hereoi "+ j2.vida);
        System.out.println("Vida Do Mostro" + j1.vida);
        j1.atacar(j2);

        System.out.println("Vida do hereoi "+ j2.vida);
        System.out.println("Vida Do Mostro" + j1.vida);
    }
}
