package oo.composicao;

public class Motor {


    boolean ligado = false;
    double fataorInjecao = 1;
    int giros(){
        if(!ligado){
            return 0;
        }else {
            return (int) Math.round(fataorInjecao * 3000);
        }
    }
}
