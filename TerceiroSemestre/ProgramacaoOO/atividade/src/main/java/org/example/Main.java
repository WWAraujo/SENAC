package org.example;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = null;

        veiculo = new Caminhao("CAM", 2020, 4);
        veiculo.exibirDados();
        veiculo.imprimirRelatorio();

        veiculo = new Onibus("BUS", 2015, 50);
        veiculo .exibirDados();
        veiculo.imprimirRelatorio();
    }
}