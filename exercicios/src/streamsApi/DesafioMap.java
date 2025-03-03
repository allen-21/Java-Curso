package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        /*
         * 1. Numero para String binaria.. 6=>"100"
         * 2. Reserter a String... "100"=>"011"
         * 3.Converter de volta inteiro => "011" =>
         */
        //Numero para String binaria.. 6=>"100"
       // Function<Integer, String> converterBinario = num -> Integer.toBinaryString(num);
        //Reserter a String... "100"=>"011"
        Function<String, String> reverterBinario = s -> new StringBuilder(s).reverse().toString();
        //Converter de volta inteiro => "011"
        Function<String, Integer> inteiros = s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(reverterBinario)
                .map(inteiros)
                .forEach(System.out::println);



    }
}
