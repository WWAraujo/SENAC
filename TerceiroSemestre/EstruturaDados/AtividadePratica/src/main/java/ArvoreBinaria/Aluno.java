package ArvoreBinaria;

public class Aluno {

    int id, faltas;
    String nome;
    double media, p1, p2;

    public Aluno(int id, String nome, int faltas, double p1, double p2) {
        this.id = id;
        this.nome = nome;
        this.faltas = faltas;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Aluno{ id = " + id + ", nome= " + nome + ", faltas= " + faltas + ", P1= " + p1 + ", P2= " + p2 + "}.";
    }

}
