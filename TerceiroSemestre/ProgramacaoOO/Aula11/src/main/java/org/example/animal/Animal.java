package org.example.animal;

public abstract class Animal {

    protected int perna;
    protected String nome;
    public Animal() {
    }
    public abstract void comer();

    public int getPerna() {
        return perna;
    }

    public void setPerna(int perna) {
        this.perna = perna;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
