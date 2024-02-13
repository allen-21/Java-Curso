package oo.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
   private int delta = 5;

    public Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }

    public void acelerar(){
        if(velocidadeAtual + getDelta()> VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }

    }
   public void frear(){
        if(velocidadeAtual >= delta){
            velocidadeAtual -= delta;
        }else {
            velocidadeAtual = delta;
        }

    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "velocidadeAtual=" + velocidadeAtual + "Km";
    }
}
