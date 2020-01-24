package learningjava.enumereations.test;

import learningjava.enumereations.classes.Restaurante;
import learningjava.enumereations.classes.TipoItem;

public class RestauranteTest{
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(TipoItem.BEBIDA);
        System.out.println(restaurante.toString());
    }
}