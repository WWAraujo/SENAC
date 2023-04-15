package atividade;

import java.math.BigDecimal;
import java.util.BitSet;

public class Produto {

    private String nome;
    private Double preco;
    private int codigo;


    public Produto(String nome, Double preco, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mostrarProduto() {
    }


    public void mostrar() {
        System.out.println("Codigo "+getCodigo());
        System.out.println("Nome "+getNome());
        System.out.println("Preco "+getPreco());
    }
}
