package abc.collections.test;

import java.util.ArrayList;
import java.util.List;

import abc.collections.classes.Celular;

public class ListCelularTest{
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "123456");
        Celular celular2 = new Celular("iPhone 65", "98576218");
        Celular celular3 = new Celular("sony Xperies", "4589752");

        List<Celular> celularList = new ArrayList<Celular>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            System.out.println(celular);
        }

        Celular celular4 = new Celular("Galaxy S7", "123456");
        System.out.println(celularList.contains(celular4));


    }
}