package controller;

import lista.Elemento;

public class Fila {

    private Elemento inicio, atual, aux;

    private int v = 1;

    public boolean empty () {return  inicio == null;}

    public void size () { //tamanho
        Elemento e = inicio;
        int cont = 0;
        while (e!=null){
            cont++;
            e = e.getProx();
        }
        System.out.println("tamanho: "+cont);
    }

    public void enqueue (Object objeto) { //inserir
        if (empty()){
            inicio = new Elemento(objeto,null,null);
            aux=inicio;
        } else {
            atual = new Elemento(objeto,null,aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void front () { //primeiro
        Elemento e = inicio;
        System.out.println(e.getObjeto());
    }

    public void dequeue () { // remover
        Elemento e = inicio;
        inicio = e.getProx();
        e.setProx(null);
        inicio.setAnt(null);
    }

    public void exibir(){
        Elemento e = inicio;
        while (e!=null){
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }
}
