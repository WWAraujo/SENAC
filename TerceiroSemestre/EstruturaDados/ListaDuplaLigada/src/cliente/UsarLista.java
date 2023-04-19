package cliente;

import lista.Contato;
import lista.Elemento;
import lista.Lista;

public class UsarLista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Wallace","1234-5678"));
        lista.inserir(new Contato("Wagner ","1234-5678"));
        lista.inserir(new Contato("Araujo ","1234-5678"));
        lista.inserir(new Contato("Pereira","1234-5678"));

        lista.remover(2);
        lista.exibir();
        int contador = lista.contador();
        System.out.println(contador);

    }

}
