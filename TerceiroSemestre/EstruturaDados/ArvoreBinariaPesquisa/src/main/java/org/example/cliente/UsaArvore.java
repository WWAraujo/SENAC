package org.example.cliente;

import org.example.arvore.Arvore;

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

        //arvore.preOrdem(arvore.getRaiz());
        arvore.posOrdem(arvore.getRaiz());
        //arvore.ordem(arvore.getRaiz());
    }
}
