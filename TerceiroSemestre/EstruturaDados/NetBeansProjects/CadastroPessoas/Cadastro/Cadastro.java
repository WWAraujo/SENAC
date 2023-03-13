
import java.util.Random;

public class Cadastro {

    public static void main(String[] args) {

        

        for(int i=0; i<30000 ; i++){
            Array.inserir(new Pessoa("Gerson", randomico()));
            Array.inserir(new Pessoa("Sandra", randomico()));
            Array.inserir(new Pessoa("Anna", randomico()));
            Array.inserir(new Pessoa("Jos�", randomico()));
            Array.inserir(new Pessoa("Gaia", randomico()));
            Array.inserir(new Pessoa("Mel", randomico()));
            Array.inserir(new Pessoa("Tutu", randomico()));
            Array.inserir(new Pessoa("Mumu", randomico()));
            Array.inserir(new Pessoa("Ronda", randomico())); 
        } 

        Array.mostrar();

        System.out.println("=== Removendo... ===");
        int id=2;
        if(Array.remover(id)){
            System.out.println(id+" removido com sucesso!");
        }else{
            System.out.println("N�o foi poss�vel remover!");
        }
        
        Array.mostrar();
    }

    public static int randomico(){
        Random random = new Random();
        int numero = random. nextInt(100);
        return numero;
    }

}
