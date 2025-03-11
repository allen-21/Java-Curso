package excecao.personalizadaB.personalizadaA;

public class StringVaziaException extends Exception{

    private String nomeDoAtributo;
    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;

    }

    public String getMessage(){
        return String.format("O atributo '%s' esta vazio", nomeDoAtributo);
    }
}
