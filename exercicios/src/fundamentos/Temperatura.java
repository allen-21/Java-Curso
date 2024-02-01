package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        //(ºF -32)*5/9=ºC
      double fahrenheit = 86;
      final double ajuste = 32;
      final double fator = 5.0/9.0;
      double celsius =(fahrenheit - ajuste)*fator;

        System.out.println("Fahrenheit " +fahrenheit+ "ºF = " +celsius+ "ºC");

    }
}
