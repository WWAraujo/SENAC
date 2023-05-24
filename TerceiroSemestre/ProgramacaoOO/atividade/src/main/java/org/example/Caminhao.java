package org.example;

public class Caminhao extends Veiculo{

    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa "+getPlaca());
        System.out.println("Ano "+getAno());
        System.out.println("eixos "+getEixos());
    }

    @Override
    public void imprimirRelatorio() {
        System.out.println("Ralatorio completo do Caminhão");
        System.out.println("Placa "+getPlaca());
        System.out.println("Ano "+getAno());
        System.out.println("eixos "+getEixos());
    }
}
