package org.example.arvore;

public class Arvore {

    private Elemento raiz, atual;

    public Elemento getRaiz() {
        return raiz;
    }

    public void inserir(int n) {
        if (raiz == null) {
            raiz = new Elemento(n);
        } else {
            atual = new Elemento(n);
            inserir(atual, raiz);
        }
    }

    public void inserir(Elemento atual, Elemento elemento) {
        if (atual.getN() >= elemento.getN()) {
            if (elemento.getDir() == null) {
                elemento.setDir(atual);
                atual.setR(elemento);
            } else {
                inserir(atual, elemento.getDir());
            }
        } else {
            if (elemento.getEsq() == null) {
                elemento.setEsq(atual);
                atual.setR(elemento);
            } else {
                inserir(atual, elemento.getEsq());
            }
        }
    }

    public void ordem(Elemento e) {
        if (e != null) {
            ordem(e.getEsq()); // percorrer subárvore esquerda
            System.out.println(e.getN());// Visitar nó raiz
            ordem(e.getDir()); // percorrer subárvore direita
        }
    }

    public void preOrdem(Elemento e) {
        if (e != null) {
            System.out.println(e.getN());// Visitar nó raiz
            preOrdem(e.getEsq()); // percorrer subárvore esquerda
            preOrdem(e.getDir()); // percorrer subárvore direita
        }
    }

    public void posOrdem(Elemento e) {
        if (e != null) {
            posOrdem(e.getEsq()); // percorrer subárvore esquerda
            posOrdem(e.getDir()); // percorrer subárvore direita
            System.out.println(e.getN());// Visitar nó raiz
        }
    }
}
