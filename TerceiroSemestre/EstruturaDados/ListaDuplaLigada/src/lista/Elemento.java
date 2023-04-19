package lista;

public class Elemento {
    private Object objeto;
    private Elemento prox, ant;

    public Elemento(Object objeto, Elemento prox, Elemento ant) {
        this.objeto = objeto;
        this.prox = prox;
        this.prox = ant;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Elemento getAnt() { return ant; }

    public void setAnt(Elemento ant) { this.ant = ant; }

    @Override
    public String toString() {
        return "Elemento{" +
                "objeto= " + objeto +
                ", prox= " + prox +
                ", anterior " + ant +
                '}';
    }
}