package classe;

public class Data {

    int dia;
    int mes;

    int ano;

    Data (){
        this(1,1,1970);

    }

    public Data(int dia , int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String inprimirDataFormatada(){
        return String.format("%d/%d/%d", dia,mes,ano);
    }

    void obterDataFormatada(){
        System.out.printf("%d/%d/%d", dia,mes,ano);
    }
}
