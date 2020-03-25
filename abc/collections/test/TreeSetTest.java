package abc.collections.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import abc.collections.classes.Celular;
import abc.collections.classes.Produto;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Leptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64GB", 2000.0, 0);
        Celular celular = new Celular("iPhone", "1234");
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        for (Produto produto : produtoNavigableSet) {
            System.out.println(produto);
        }
        System.out.println("---------------------------------");
        // lower < 
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(produtoNavigableSet.pollFirst());

    }
}