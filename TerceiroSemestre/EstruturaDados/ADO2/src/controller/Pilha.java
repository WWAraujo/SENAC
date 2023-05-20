package controller;

import lista.Elemento;

public class Pilha {

    private Elemento inicio, atual, aux;

    private int v = 1;


    public boolean empty () {return  inicio == null;}

    public void size() {
        Elemento e = inicio;
        int cont = 0;
        while (e!=null){
            cont++;
            e = e.getProx();
        }
        System.out.println("tamanho: "+cont);
    }

    public void push (Object objeto) {
        if (empty()){
            inicio = new Elemento(objeto,null,null);
            aux=inicio;
        } else {
            atual = new Elemento(objeto,null,aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void top () {
        Elemento e = atual;
        System.out.println(e.getObjeto());
    }

    public void pop () {
        Elemento e = atual;
        aux = e.getAnt();
        atual = aux;
        e.setAnt(null);
        atual.setProx(null);

    }

    public void exibir(){
        Elemento e = inicio;
        while (e!=null){
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }


}
