/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.aula08;

import java.util.Scanner;

public class Animal {
    private String especie;
    private String nome;
    private int idade;

    private int pos;

    public Animal (String especie, String nome , int idade, int pos){
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Animal(){
        
    }
    public Animal (String especie, String nome , int idade){
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Animal inserir(){
        Scanner sc = new Scanner(System.in);
        Animal novoAnimal = new Animal();
        System.out.print("Especie");
        novoAnimal.setEspecie(sc.next());
        
        System.out.print("Nome");
        novoAnimal.setNome(sc.next());
        
        System.out.print("Idade: ");
        novoAnimal.setIdade(sc.nextInt());
        
        return novoAnimal;
    }
    
    public void mostrarAnimal(){
        System.out.println("Espécie: "+getEspecie()+"\n"+
                           "Nome: "+getNome()+"\n"+
                           "Idade: "+getIdade()+"\n"+
                           "------------------------------");
    }
    
}
