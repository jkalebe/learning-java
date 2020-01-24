package learningjava.enumereations.classes;

public class Restaurante{
    private TipoItem tipoItem;


    public Restaurante(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }


    @Override
    public String toString() {
        return "{" +
            " tipoItem='" + tipoItem + "'" +
            " Item: " + tipoItem.getNome()+
            " Value: " + tipoItem.getValue()+
            " Quantidade: " + tipoItem.getQuantidade()+
            "}";
    }

    
    
}