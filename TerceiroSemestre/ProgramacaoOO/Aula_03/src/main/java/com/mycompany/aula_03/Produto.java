package com.mycompany.aula_03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wallace.waraujo
 */

//Classes são compostas por metodos e atributos

//A combinação de atributos e serviços são Abstração 
//
//a) Produto 
//b) nome, preço, quantidade, desconto, valor a pagar
//c) metodo para comparar a quantidade de produtos para passar o desconto, e outro para fazer o valor a ser pago com a a quantidade * valor - desconto se aplicado
//d) ... 

public class Produto {
    
    String nome;
    int quantidade;
    double preco, valorTotal, desconto;
    
    void iniciarvalor(String n, double p, int q){
        nome = n;
        preco = p;
        quantidade = q;
        
        calcularValorTotal();
    }
    
    void calcularValorTotal (){
        valorTotal = preco * quantidade ;
        calcularDesconto();
        mostrarProduto();
    }
    
    void calcularDesconto() {
        
        if ( quantidade > 50 ){
            valorTotal = valorTotal * 0.75;
        }else if ( quantidade > 20 ){
            valorTotal = valorTotal * 0.80;
        }else if ( quantidade > 10 ){
            valorTotal = valorTotal * 0.90;
        }else {
            valorTotal = valorTotal ;
        }
    }
    
    void mostrarProduto() {
        System.out.println("Você comprou "+nome+" deu um valor total : R$" + valorTotal);
    }
    
}


