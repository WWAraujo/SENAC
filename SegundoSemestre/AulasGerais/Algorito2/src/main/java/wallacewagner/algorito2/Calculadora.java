/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wallacewagner.algorito2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.UUID;
/**
 *
 * @author T-Gamer
 */
public class Calculadora {
    
    public static void main(String[] args) throws Exception{
     
        double resposta = 0; 
        double x = primeiroValor();
        double y = segundoValor();
        String operador = qualOperacao();
        
        switch (operador) {
            case ("+") -> resposta = Soma(x,y);
            
            case ("-") -> resposta = Subtracao(x,y);
                
            case ("/") -> resposta = Divisao(x,y);
            
            case ("*") -> resposta = Multiplicacao(x,y); 
        
            default -> {
                System.out.println("Digite um operador valido ex: + ou - ou * ou /");
                
            }
        }
        
        String gravar = (x+" " + operador + " " + y + " = " + resposta);
        criarArquivo (gravar);
        
    }
    
    public static double primeiroValor (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o pimeiro numero: ");
        double x = entrada.nextDouble();
        return x;
    }
    
    public static double segundoValor (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o pimeiro numero: ");
        double y = entrada.nextDouble();
        return y;
    }
    
    public static String qualOperacao (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual operação você quer fazer? ");
        String operador = entrada.next();
        return operador;
    }
    
    public static double Soma (double x, double y){
        double resposta;
        resposta = x + y;
        return resposta;
    }
    
    public static double Subtracao (double x, double y){
        double resposta;
        resposta = x - y;
        return resposta;
    }
    
    public static double Divisao (double x, double y){
        double resposta;
        resposta = x / y;
        return resposta;
    }
    
    public static double Multiplicacao (double x, double y){
        double resposta;
        resposta = x * y;
        return resposta;
    }
    
    public static Path criarArquivo(String r) throws Exception {
        
        // Criando um diretorio. 
        Path novaPasta = Files.createDirectory(Path.of("./novaPasta-" + UUID.randomUUID()));
        System.out.println("Novo diretório:" + novaPasta.toAbsolutePath());
        
        // Criando um arquivo no diretorio. 
        Path novoArquivo = Files.createFile(novaPasta.resolve("novoArquivo.txt"));
        System.out.println("Novo arquivo:" + novoArquivo.toAbsolutePath());
        
        //Escrevento a resposta no arquivo concatenando com uma string.
        Files.writeString(novoArquivo, "Sua resposta é: " + r + "\r\n",
                StandardCharsets.ISO_8859_1, StandardOpenOption.APPEND);
        
        return novoArquivo;
    }
}
