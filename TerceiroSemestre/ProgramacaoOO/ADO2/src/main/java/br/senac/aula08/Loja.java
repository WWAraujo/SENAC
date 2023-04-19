/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.aula08;

public class Loja {
    private Animal store[];
    
    public Loja(int qtd){
        store = new Animal[qtd];
    }
    
    public void inserirAnimal(int posicao, Animal a){
        if(posicao >= store.length){
            System.out.println("Posição inválida!");
        }else  {
            if(store[posicao] == null){
                store[posicao] = a;
            }
            else{
                System.out.println("Posição ocupada");
            } 
        }
        
    }
    public void mostarLoja(){
        for(int i=0; i<store.length;i++){
            if(store[i] != null)
            store[i].mostrarAnimal();
        }
    }
    public void alterarMeuAnimal(int posicao, Animal a){
       
        int cont = 0;
        while(cont < store.length){
            if(store[cont].equals(cont)){
                store[cont] =  a;
                break;
            }
            else {
                System.out.println("Posição não encontrada");
            }
            cont++;
        }
    }
    
    public void alterarAnimal(int posicao, Animal a){
        if(posicao >= store.length){
            System.out.println("Posição inválida!");
        }else  {
            if(store[posicao] != null){
                store[posicao] = a;
                System.out.println("Excluido com sucesso!");
            }
        }
    }
    
    public void excluirAnimal(int posicao){
        if(posicao >= store.length){
            System.out.println("Posição inválida!");
        }else  {
            if(store[posicao] != null){
                store[posicao] = null;
                System.out.println("Excluido com sucesso!");
            }
        }
    }
    
    public void buscarAnimal(String nome){

        for(int i=0;i<store.length;i++){
            if(store[i].getNome().equals(nome)){
                System.out.println(store[i].toString());
                break;
            }else 
                System.out.println("Animal não encontrado");
        }
    }
}
