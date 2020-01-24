package collections.classes;

public class Celular{
    private String nome;
    private String IMEI;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    //Reflexivo = x.equals(x)  tem que ser true para tudo que for difente de null
    //Simetrico para x e y direfentes  de null, se x.equals(y) == true logo x.equals(x) tem que ser true
    //Transitividade para x, y, z diferente de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) também tem que ser true
    //Consistente x.equals(y) deve sempre retornar o mesmo valor
    // para x diferente de null x.equals(null) tem que retornar false;

    //Para hashCode
    //se x.equals(y) == true y.hashCode() == x.hashCode();
    //y.hashCode() == x.hasheCode() não necessariamente o equals deverá retornar true
    //x.equals(y) == false
    //y.hashCode() != x.hashCode() x.equals(y) deverá ser false

    @Override
    public int hashCode() {
        return IMEI!= null ? IMEI.hashCode() : 1;
    }

    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(this.getClass() != object.getClass()) return false;
        Celular outroCelular = (Celular) object;
        return IMEI != null && IMEI.equals(outroCelular.IMEI);
    }

}