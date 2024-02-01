package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        // dica para elevar um numnero a potencia use o Math.pow(valor,potencia);

        double numA = Math.pow(6 *(3+2),2);
        double denA = 3 * 2;

        double numB =(1-5)* (2-7);
        double denB = 2;

        double superiorA= numA/denA;
        double superiorB= Math.pow(numB/denB,2);

        double superio = Math.pow(superiorA-superiorB,3);
        double inferior = Math.pow(10,3);

        double resultado = superio / inferior;
        System.out.println("O Resultado é " + resultado);
    }
}
