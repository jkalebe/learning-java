package collections.test;

import collections.classes.Celular;

public class EqualsTest{
    public static void main(String[] args) {
        String nome1 = "Willian Susane";
        String nome2 = new String("Willian Susane");
        //compara endereços de memória e não value
        System.out.println(nome1 == nome2);

        //comparando value
        System.out.println(nome1.equals(nome2));

        Integer int1 = 5;
        Integer int2 = 5;
        //compara endereços de memória e não value
        System.out.println(int1 == int2);

        //comparando values
        System.out.println(int1.equals(int2));

        Celular c1 = new Celular("iPhone", "1234");
        Celular c2 = new Celular("iPhone", "1234");

        System.out.println("c1.equals(c2): " + c1.equals(c2));
    }
}