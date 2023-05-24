package org.example.cliente;

import org.example.arvore.Arvore;
import org.example.arvore.Elemento;

public class UsaArvore {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(61);
        arvore.inserir(47);
        arvore.inserir(37);
        arvore.inserir(21);
        arvore.inserir(26);
        arvore.inserir(60);
        arvore.inserir(53);
        arvore.inserir(90);
        arvore.inserir(89);

        System.out.println("Maior ==========");
        Elemento elemento = arvore.getMaior(arvore.getRaiz());
        System.out.println(elemento.getN());


        //arvore.preOrdem(arvore.getRaiz());
        //arvore.posOrdem(arvore.getRaiz());


        arvore.remover(elemento, 90);

        arvore.ordem(arvore.getRaiz());
    }
}
