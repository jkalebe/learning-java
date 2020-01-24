package br.com.abc.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Olá");
        nomes.add("Boa");
        nomes.add("Ok test");
        nomes.add("Add foreach");
        
        // for(Object a:nomes){
        //     System.out.println(a);
        // }

        nomes.forEach(System.out::println);

        for(Object a:nomes){
            System.out.println(a);
        }
        nomes.add("add + 1");
        
        for(Object a:nomes){
            System.out.println(a);
        }

        List<Integer> numeros = new ArrayList<Integer>();
    }
}