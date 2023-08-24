package org.example;

public class ListaVetor implements InterfaceAPILista{

    private double[] vetor;

    @Override
    public void _criarLista() {
        vetor = new double[0];
    }

    private void inserirElemento(double valor, int pos){
        double temp[] = vetor;
        vetor = null;
        vetor = new double[temp.length + 1];

        for (int i = 0; i < pos; i++) {
            vetor[i] = temp[i];
        }
        vetor[pos] = valor;
        for (int i = pos+1; i < vetor.length; i++) {
            vetor[i] = temp[i];
        }
    }

    @Override
    public void _inserir(double valor) {

    }

    @Override
    public boolean _inserir(double valor, int pos) {
        if ((pos < 0) || (pos > vetor.length)){
//            System.out.println("erro ao inserir");
            return false;
        } else {
            inserirElemento(valor, pos);
            return true;
        }
    }

    @Override
    public void _remover() {

    }

    @Override
    public void _remover(int pos) {
        double temp[] = vetor;
        vetor = null;
        vetor = new double[temp.length - 1];

        for ( int i = 0; i < pos; i++){
            vetor[i] = temp[1];
        }
        for ( int i = pos; i < vetor.length; i++) {
            vetor[i] = temp[i+1];
        }
    }

    @Override
    public double _ler() {
        return 0;
    }

    @Override
    public double _ler(int pos) {
        return 0;
    }

    @Override
    public void _imprimir() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    @Override
    public void _deletar() {

    }

    @Override
    public void _pesquisar(double valor) {

    }
}
