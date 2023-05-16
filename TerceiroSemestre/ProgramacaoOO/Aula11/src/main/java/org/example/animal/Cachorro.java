package org.example.animal;

public class Cachorro extends Animal implements AnimaEstimacal,Vacilacao{

    @Override
    public void comer() {
        System.out.println("Carne");
    }

    public void brincar(){
        System.out.println("Bola");
    }

    @Override
    public void vaninar() {
        System.out.println("RAIVA");
    }
}
