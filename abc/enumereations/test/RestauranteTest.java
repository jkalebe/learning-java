package abc.enumereations.test;

import abc.enumereations.classes.Restaurante;
import abc.enumereations.classes.TipoItem;

public class RestauranteTest{
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(TipoItem.BEBIDA);
        System.out.println(restaurante.toString());
    }
}