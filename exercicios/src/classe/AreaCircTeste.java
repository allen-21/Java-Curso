package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(5.6);
        System.out.println(a1.area());
        AreaCirc a2 = new AreaCirc(5);
       // a2.pi = 5;
        //AreaCirc.pi = 3.1415;
        System.out.println(a1.area());
    }
}
