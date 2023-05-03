package lista;

public class Lista {

    private Elemento inicio, atual, aux;
    private int v = 1;

    public boolean verificar() {
        return inicio == null ;
    }

    public void inserir(Object objeto){
        if (verificar()) {
            inicio = new Elemento(objeto,null,null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto,null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void inserirNoMeio(int id){
    }


    public void exibir(){
        Elemento e = inicio;
        while (e!=null){
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    public void encontrarMostrar(int id){
        Elemento e = inicio;
        Contato c;

        while (e!=null){
            c=(Contato)e.getObjeto();
            if (id== c.getId()){
                System.out.println(e.getObjeto());
                break;
            }
            e = e.getProx();
        }
    }

    public Elemento buscar(int id){
        Elemento e = inicio;
        Contato c;

        while (e!=null){
            c=(Contato)e.getObjeto();
            if (id== c.getId()){
                return e;
            }
            e = e.getProx();
        }
        return null;
    }

    public void remover(int id){

        Elemento e=buscar(id);
        if (e!=null){
            if (e==inicio) {
                inicio = e.getProx();
                e.setProx(null);
                inicio.setAnt(null);
            } else if (e==atual){
                aux = e.getAnt();
                atual = aux ;
                e.setAnt(null);
                atual.setProx(null);
            } else {
                e.getAnt().setAnt(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setAnt(null);
                e.setProx(null);
            }
        } else {
            System.out.println("Nao encontrado");
        }
    }

    public int contador(){
        int contador = 0;
        Elemento e = inicio;
        while (e!=null){
            contador++;
            e = e.getProx();
        }
        return contador;
    }


}
