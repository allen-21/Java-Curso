package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 16;
        d1.mes = 10;
        d1.ano = 1999;
        d1.obterDataFormatada();
        Data d2 = new Data();
        d2.obterDataFormatada();

    }


}
