package abc.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Java");
        nomes.add("maratona");
        nomes.add("kalebe");
        nomes.add("devdojo");

        Collections.sort(nomes);
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.8);
        numeros.add(1.9);
        numeros.add(2d);

        Collections.sort(numeros);
        for (String string : nomes) {
            System.out.println(string);
        }

        for (Double double1 : numeros) {
            System.out.println(double1);
        }
    }
}