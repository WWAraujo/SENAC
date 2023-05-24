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

    public Elemento pesquisar(Elemento e, int n){
        if (e != null) {
            if (n == e.getN()) {
                return  e;
            } else if (n > e.getN()) {
                return pesquisar(e.getDir(),n);
            } else {
                return pesquisar(e.getEsq(), n);
            }
        }
        return null;
    }

    public Elemento getMaior(Elemento e) {
        if (e.getDir() != null) {
            return getMaior(e.getDir());
        }
        return e;
    }

    public int grau(Elemento e, int n) {
        Elemento pesq = pesquisar(e, n);
        if (pesq != null) {
            if (pesq.getDir() == null && pesq.getEsq() ==  null) {
                return 0;
            }
            if (pesq.getDir() != null && pesq.getEsq() != null) {
                return 2;
            } else {
                return 1;
            }
        }
        return -1;
    }

    public void  remover(Elemento e, int n) {
        Elemento pesq = pesquisar(e, n);
        if (pesq != null) {
            if (grau(e, n) == 0) {
                if (pesq.getR().getDir() == pesq) {
                    pesq.getR().setDir(null);
                    pesq.setR(null);
                } else {
                    pesq.getR().setEsq(null);
                    pesq.setR(null);
                }
            }
        } else if (grau(e, n) == 1) {
            if (pesq.getDir() != null) {
                pesq.setN(pesq.getDir().getN());
                remover(pesq.getDir(), pesq.getDir().getN());
            } else {
                pesq.setN(pesq.getEsq().getN());
                remover(pesq.getEsq(), pesq.getEsq().getN());
            }
        }
    }


}
