package cliente;

import controller.Fila;
import controller.Pilha;
import lista.*;

import java.util.Scanner;

public class UsarLista {


    public static void main(String[] args) {
        System.out.println("\tBem vindo! \n");

        int menu = menu();

        do {
            if (menu == 1) {
                menuFila();
            } else if (menu == 2) {
                menuPilha();
            }
            menu = menu();
        } while (menu != 3);
        System.out.println("Obrigado!");
    }

    public static int menu(){
        int escolhaMenu = 0;

        System.out.println("Digite um numero");
        System.out.println( "1) Fila \n" +
                            "2) Pilha \n" +
                            "3) Sair");

        try {
            escolhaMenu = Integer.parseInt(scanner());
        } catch (Exception e){
            System.out.println("Digite apenas numeros");
            menu();
        }
        return escolhaMenu;
    }

    public static void menuFila(){

        Fila fila = new Fila();
        fila.enqueue(contato());
        fila.enqueue(contato());
        fila.enqueue(contato());

        fila.exibir();
        fila.size();
        System.out.println("Mostrar o primeiro");
        fila.front();
        fila.size();
        System.out.println("Remover primeiro");
        fila.dequeue();
        fila.size();
        System.out.println("###Inserir novo###");
        fila.enqueue(contato());
        fila.exibir();
        fila.size();
    }

    public static void menuPilha(){

        Pilha pilha = new Pilha();
        pilha.push(contato());
        pilha.push(contato());
        pilha.push(contato());

        pilha.exibir();
        pilha.size();
        System.out.println("Mostrar o ultimo");
        pilha.top();
        System.out.println("Remover ultimo");
        pilha.pop();
        pilha.size();
        System.out.println("###Inserir novo###");
        pilha.push(contato());
        pilha.exibir();
        pilha.size();
    }

    public static String scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Contato contato(){
        System.out.println("Digite o nome: ");
        String nome = scanner();

        System.out.println("Digite o telefone: ");
        String telefone = scanner();

        return new Contato(nome, telefone);
    }

}
