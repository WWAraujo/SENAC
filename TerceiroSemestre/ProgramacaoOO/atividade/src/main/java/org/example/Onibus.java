package org.example;

public class Onibus extends Veiculo{

    private int assentos;

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa "+getPlaca());
        System.out.println("Ano "+getAno());
        System.out.println("eixos "+getAssentos());
    }

    @Override
    public void imprimirRelatorio() {
        System.out.println("Essa classe mostra tadas as informações do Onibus");
        System.out.println("Placa "+getPlaca());
        System.out.println("Ano "+getAno());
        System.out.println("eixos "+getAssentos());
    }
}
