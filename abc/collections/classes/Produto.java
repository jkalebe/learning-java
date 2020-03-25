package abc.collections.classes;

public class Produto implements Comparable<Produto>{
    private String serialNumber;
    private String nome;
    private Double preco;
    private int quantidade;


    public Produto(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String serialNumber, String nome, Double preco, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

    @Override
    public String toString() {
        return "{" +
            " serialNumber='" + getSerialNumber() + "'" +
            ", nome='" + getNome() + "'" +
            ", preco='" + getPreco() + "'" +
            "}";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return serialNumber.equals(produto.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber != null ? serialNumber.hashCode():0;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o) {
        //negativo se thisObject < outroObject
        //zero se thisObject == outroObject
        //Positivo se thisObject > outroObject
        //return this.nome.compareTo(o.getNome());
        //return this.serialNumber.compareTo(o.getSerialNumber());
        return this.preco.compareTo(o.getPreco());
    }

}