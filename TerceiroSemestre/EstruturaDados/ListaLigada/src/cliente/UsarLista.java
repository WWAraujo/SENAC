package cliente;

import lista.Contato;
import lista.Lista;

public class UsarLista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Wallace","1234-5678"));
        lista.inserir(new Contato("Wagner ","1234-5678"));
        lista.inserir(new Contato("Araujo ","1234-5678"));
        lista.inserir(new Contato("Pereira","1234-5678"));

//        Object obj = lista.buscar(1);
//        if(obj!=null){
//            System.out.println(obj);
//        }else {
//            System.out.println("Nao encontrado!");
//        }
//        lista.encontrarMostrar(1);

        lista.mostrar();
        System.out.println("==========================================");

        lista.remover(3);

        lista.mostrar();
    }

}
