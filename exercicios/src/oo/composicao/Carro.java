package oo.composicao;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        if(motor.fataorInjecao < 2.6){
            motor.fataorInjecao += 0.4;
        }
    }
    void frear(){
        if(motor.fataorInjecao > 0.5){
            motor.fataorInjecao -= 0.4;
        }

    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }

    Boolean estaLigado(){
        return motor.ligado;
    }
}

