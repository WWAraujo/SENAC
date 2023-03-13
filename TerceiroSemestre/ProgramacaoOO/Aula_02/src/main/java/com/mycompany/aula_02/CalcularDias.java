/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_02;

import java.util.Scanner;

/**
 *
 * @author wallace.waraujo
 */
public class CalcularDias {
    
    String nome;
    int idade;
    
    void entradaNomeIdade(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nome");
        nome = entrada.nextLine();
        
        System.out.print("idade");
        idade = Integer.parseInt(entrada.nextLine());
    }
    
    void converterIdadeDias(){
        
        entradaNomeIdade();
        int dias = idade * 360;
        System.out.println(nome + "tem " + dias + " de vida");
    }
}
