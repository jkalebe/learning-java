package abc.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import abc.collections.classes.Produto;


class ProdutoNomeComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        // TODO Auto-generated method stub
        return o1.getNome().compareTo(o2.getNome());
    }

}

public class SortProdutoTest{
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto [] arrayProduto = new Produto[4];
        
        Produto produto1 = new Produto("123", "Leptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64GB", 2000.0);        

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        arrayProduto[0] = produto1;
        arrayProduto[1] = produto2;
        arrayProduto[2] = produto3;
        arrayProduto[3] = produto4; 

        Collections.sort(produtos, new ProdutoNomeComparator());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println();
        Arrays.sort(arrayProduto, new ProdutoNomeComparator());
        for (Produto produto : arrayProduto) {
            System.out.println(produto);
        }

    }
}