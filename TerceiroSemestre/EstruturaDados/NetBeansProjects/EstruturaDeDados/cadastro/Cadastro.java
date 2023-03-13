package cadastro;


public class Cadastro {

    public static void main(String[] args) {
        Array.inserir(new Pessoa("Gerson", 35));
        Array.inserir(new Pessoa("Sandra", 30));
        Array.inserir(new Pessoa("Anna", 90));
        Array.inserir(new Pessoa("Jos�", 100));
        Array.inserir(new Pessoa("Gaia", 100));
        Array.inserir(new Pessoa("Mel", 100));
        Array.inserir(new Pessoa("Tutu", 100));
        Array.inserir(new Pessoa("Mumu", 100));
        Array.inserir(new Pessoa("Ronda", 100)); 
        Array.mostrar();
        System.out.println("=== Removendo... ===");
        int id=9;
        if(Array.remover(id)){
            System.out.println(id+" removido com sucesso!");
        }else{
            System.out.println("N�o foi poss�vel remover!");
        }
        Array.mostrar();
    }

}
