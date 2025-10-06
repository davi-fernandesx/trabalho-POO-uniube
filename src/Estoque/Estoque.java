package Estoque;

import Vestuario.Vestuario;

import java.util.Random;

public class Estoque {


    private Random gerador = new Random();
    private int Quantidade;
    private Vestuario vestuario;

    public Estoque(int quantidade, Vestuario vestuario){
        this.Quantidade = quantidade;
        this.vestuario = vestuario;
    }


    public int getQuantidade() {
        return Quantidade;
    }

    public Vestuario getVestuario() {
        return vestuario;
    }


    @Override
    public  String toString(){

        return "quantidade: "+ getQuantidade() + "\n vestuario:\n " + getVestuario();

    }
}
