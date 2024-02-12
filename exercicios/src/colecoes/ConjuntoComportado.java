package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
       // Set<String> listaAprovados = new HashSet<>();
        TreeSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Allen");
        listaAprovados.add("Valter");
        listaAprovados.add("Bla");

        for (String candidato : listaAprovados){
            System.out.println(candidato);
        }
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
