package enumereations.test;

import enumereations.classes.Restaurante;
import enumereations.classes.TipoItem;

public class RestauranteTest{
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(TipoItem.BEBIDA);
        System.out.println(restaurante.toString());
    }
}