package enumereations.classes;


public enum TipoItem{
    COMIDA("Frango assado", 34.00f, 1), BEBIDA("suco de polpa", 4.00f, 1);
    
    private String nome;
    private float value;
    private int quantidade;

    TipoItem(String nome, float value, int quantidade){
        this.nome = nome;
        this.value = value;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public float getValue(){
        return value;
    }

    public int getQuantidade(){
        return quantidade;
    }
}