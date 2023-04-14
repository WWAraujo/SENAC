/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.senac.aula08;

import java.util.Scanner;


public class Aula08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        Animal novoAnimal = new Animal();
        Loja oL = new Loja(5);

        while (escolha >= 0 || escolha <= 6) {
            System.out.println("----------------");
            System.out.println("1-Inserir");
            System.out.println("2-Alterar");
            System.out.println("3-Excluir");
            System.out.println("4-mostrar");
            System.out.println("5-buscar");
            System.out.println("6-Sair");
            System.out.println("----------------");
            escolha = Integer.parseInt(sc.nextLine());
            int pos = 0;

            switch (escolha) {
                case 1:
                    novoAnimal = construtorAnimal();
                    oL.inserirAnimal(novoAnimal.getPos() , novoAnimal);
                    break;
                case 2 :
                    System.out.println("Posição");
                    pos = numero();
                    oL.alterarAnimal(pos, novoAnimal);

                case 3 :
                    System.out.println("Posição");
                    pos = numero();
                    oL.excluirAnimal(pos);
                    break;
                case 4 :
                    oL.mostarLoja();
                    break;
                case 5 :
                    System.out.println("Digite o nome: ");
                    oL.buscarAnimal(sc.next());
                    break;
                case 6 :
                    System.out.println("Obrigado, até a proxima!");
                    System.exit(0);
                    break;
                default: System.out.println("Opção invalida");
            }
            escolha = 0;
        }
    }

    private static Animal construtorAnimal() {

        System.out.println("Posição");
        int pos = numero();
        System.out.println("Especie: ");
        String es = letra();
        System.out.println("Nome: ");
        String name = letra();
        System.out.print("Idade: ");
        int idade = numero();

        Animal novoAnimal = new Animal(es, name, idade, pos);
        return novoAnimal;
    }

    private static String letra() {
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        return msg;
    }

    private static Integer numero() {
        Integer numero;
        try {
            numero = Integer.parseInt(letra());
        } catch (Exception exception){
            System.out.println("Digite apenas numero");
            numero = numero();
        }
        return numero;
    }
}
