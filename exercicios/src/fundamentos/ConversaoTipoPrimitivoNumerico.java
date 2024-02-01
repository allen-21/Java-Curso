package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        //Conversao implicita
        double a = 1;
        System.out.println(a);

        //Conversao explicita onde pode si perder informacao
        float b = (float) 1.0;
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;//Conversao explicita (CAST)
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e;//Conversao explicita (CAST)
        System.out.println(1);
    }
}
