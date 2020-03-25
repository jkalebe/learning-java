package abc.collections.test;

import java.util.HashSet;
import java.util.Set;

import abc.collections.classes.Produto;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Leptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64GB", 2000.0, 0);
        Set<Produto> produtosSet = new HashSet<>();
        produtosSet.add(produto1);
        produtosSet.add(produto2);
        produtosSet.add(produto3);
        produtosSet.add(produto4);

        //set não possui index
        //linked possuiss
        for (Produto produto : produtosSet) {
            System.out.println(produto);
        }
    }
}