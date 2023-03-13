/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wallacewagner.algorito2;

/**
 *
 * @author T-Gamer
 */
public class Aluno {
    
    private String nome;
    private String curso;
    private int serie;
    private double valor;
    private String periodo;
    
    public Aluno(){
    }
    
    public Aluno(String nome, String curso, int serie, double valor, String periodo){
        this.nome = nome;
        this.curso = curso;
        this.serie = serie;
        this.valor = valor;
        this.periodo = periodo;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
    public int getSerie(){
        return serie;
    }
    public double getValor(){
        return valor;
    }
    public String getPeriodo(){
        return periodo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
     public void setCurso(String curso){
        this.curso = curso;
    }
    public void setSerie(int serie){
        this.serie = serie;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }
}
