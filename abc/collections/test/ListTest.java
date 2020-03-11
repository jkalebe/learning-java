package abc.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Olá");
        nomes.add("Boa");
        nomes.add("Ok test");
        nomes.add("Add foreach");

        List<String> nomes2 = new ArrayList<String>();
        //add all
        nomes2.addAll(nomes);

        //remove all
        nomes.clear();

        
        // for(Object a:nomes){
        //     System.out.println(a);
        // }

        //foreach no java 8
        nomes.forEach(System.out::println);

        //foreach tradicional
        for(Object a:nomes){
            System.out.println(a);
        }
       
        //List<Integer> numeros = new ArrayList<Integer>();
    }
}