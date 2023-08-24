package org.example;

public interface InterfaceAPILista {

    public void _criarLista();

    public void _inserir(double valor);
    public boolean _inserir(double valor,int pos);

    public void _remover();
    public void _remover(int pos);

    public double _ler();
    public double _ler(int pos);

    public void _imprimir();

    public void _deletar();

    public void _pesquisar(double valor);
}
