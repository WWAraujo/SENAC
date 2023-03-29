package lista;

public class Lista {

    private Elemento inicio, atual, aux;
    private int v = 1;
    public void inserir(Object objeto){
        Contato c = (Contato) objeto;
        c.setId(v++);

        if(inicio == null){
            inicio = new Elemento(objeto,null);
            aux = inicio;
        }else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void mostrar(){
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

    public Object[] buscar(int id){
        Object[] v = new Object[3];

        Elemento e = inicio;
        Contato c;
        while (e!=null){
            c=(Contato)e.getObjeto();
            if (id== c.getId()){
                v[0] = e;
                v[2] = c;
                return v;
            }
            e = e.getProx();
        }
        return null;
    }

    public void remover(int id){
        Object[] v = buscar(id);
        Object[] v2 = buscar(id-1);
        if(v != null){
            Elemento e = (Elemento) v[0];
            if(e == inicio){//caso 1 - remocao do primeiro elemento
                inicio = e.getProx();
                e.setProx(null);
            } else if (e.getProx()==null){
                Elemento e2 = (Elemento) v2[0];
                e2.setProx(e.getProx());
            } else {
                Elemento e2 = (Elemento) v2[0];
                e2.setProx(e.getProx());
            }
        } else {
            System.out.println("Erro ao remover! Nao encontrato");
        }
    }
}
