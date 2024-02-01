package fundamentos;


public class Wrapper {
    public static void main(String[] args) {
       // Scanner entrada = new Scanner(System.in);
        //Wrapper sao a versao objeto dos tipos primitivos!
        Byte b = 100;
        Short s = 1000;
        //Integer i = Integer.parseInt(entrada.next());
        Integer i = 10000;//int
        Long l = 100000L;

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.12354;
        System.out.println(d);

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 4);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';//char
        System.out.println(c + "...");

      //  entrada.close();
    }
}
