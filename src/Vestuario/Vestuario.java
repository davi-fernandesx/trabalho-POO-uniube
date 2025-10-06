package Vestuario;

public class Vestuario {

    private String Tipo;
    private String Marca;
    private String Tamanho;
    double Valor;

    public Vestuario(String tipo, String marca, String tamanho, double valor){

        this.Tipo = tipo;
        this.Marca = marca;
        this.Tamanho = tamanho;
        this.Valor = valor;

    }


    public String getTipo() {
        return Tipo;
    }


    public String getMarca() {
        return Marca;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public double getValor() {
        return Valor;
    }

    //sobrescrevendo o toString para trazer as informaçoes do vestuario
    @Override
    public  String toString(){
        return "tipo: " + getTipo() + "\t\nmarca: " + getMarca() + "\t\ntamanho: " + getTamanho() + "\t\nvalor: " + getValor();

    }
}
