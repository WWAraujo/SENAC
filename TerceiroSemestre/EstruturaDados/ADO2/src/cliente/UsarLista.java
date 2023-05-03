package cliente;

import lista.*;

public class UsarLista {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(new Contato("Wallace","1234-5678"));
        pilha.push(new Contato("Wagner ","1234-5678"));
        pilha.push(new Contato("Araujo ","1234-5678"));
        pilha.push(new Contato("Pereira","1234-5678"));

        pilha.exibir();
        pilha.size();
        System.out.println("ultimo");
        pilha.top();
        System.out.println("remover ultimo");
        pilha.pop();
        pilha.size();
        System.out.println("inserir novo");
        pilha.push(new Contato("Araujo ","1234-5678"));
        pilha.exibir();
        pilha.size();

        System.out.println("=====================================");

        Fila fila = new Fila();
        fila.enqueue(new Contato("Wallace","1234-5678"));
        fila.enqueue(new Contato("Wagner ","1234-5678"));
        fila.enqueue(new Contato("Araujo ","1234-5678"));
        fila.enqueue(new Contato("Pereira","1234-5678"));

        fila.exibir();
        fila.size();
        System.out.println("mostrar o primeiro");
        fila.front();
        fila.size();
        System.out.println("remover primeiro");
        fila.dequeue();
        fila.size();
        System.out.println("inserir novo");
        fila.enqueue(new Contato("Araujo ","1234-5678"));
        fila.exibir();
        fila.size();

    }

}
