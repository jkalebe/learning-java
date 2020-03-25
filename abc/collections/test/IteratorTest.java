package abc.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import abc.collections.classes.Produto;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();    
        Produto produto1 = new Produto("123", "Leptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64GB", 2000.0, 0);    
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        //use iterator para remover objetos de listas
        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext(); //next();
        while(produtoIterator.hasNext()){
            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}