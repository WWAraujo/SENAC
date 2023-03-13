/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wallacewagner.algorito2;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.UUID;

/**
 *
 * @author T-Gamer
 */
public class CiriarArquivo {

    public static void main(String[] args) throws Exception {

        //Chamar a classe construtor de arquivos
        Path path = criarArquivo();
        
        String conteudo = Files.readString(path, StandardCharsets.ISO_8859_1);
        System.out.println("Conteúdo do Arquivo:\r\n" + conteudo);
        String conteudotodo = new String(Files.readAllBytes(path), StandardCharsets.ISO_8859_1);
        System.out.println("Conteúdo do Arquivo:\r\n" + conteudotodo);
    }

    public static Path criarArquivo() throws Exception {
        
        // Criando um diretorio. 
        Path novaPasta = Files.createDirectory(Path.of("./novaPasta-" + UUID.randomUUID()));
        System.out.println("Novo diretório:" + novaPasta.toAbsolutePath());
        
        // Criando um arquivo no diretorio. 
        Path novoArquivo = Files.createFile(novaPasta.resolve("novoArquivo.txt"));
        System.out.println("Novo arquivo:" + novoArquivo.toAbsolutePath());
        
        //Escrevento 10 linhas no arquivo com valores aleatórios e concatenando com uma string.  
        for (int i = 0; i <= 10; i++) {
            Files.writeString(novoArquivo, "Linha " + i + "\r\n",
                    StandardCharsets.ISO_8859_1, StandardOpenOption.APPEND);
        }
        return novoArquivo;
    }
    
/**
 * arquivo apenas para informações adicionais. 
 * @throws Exception 
 */
    public void instruções() throws Exception {

        //Criando uma classe de pacotes, que pega um pacote no sistema do windows através do caminho informano no get
        Path path = Paths.get("c:\\windows\\system.ini");
        System.out.println(path.toAbsolutePath());
        System.out.println("exists: " + Files.exists(path));

        //Passando um caminho especifico 
        path = Path.of("c:\\windows\\system.ini");
        System.out.println(path.toAbsolutePath());
        System.out.println("exists: " + Files.exists(path));

        //outra forma de passar uma url pra o pacote
        path = Path.of(new URI("file:///c:/windows/system.ini"));
        System.out.println(path.toAbsolutePath());
        System.out.println("exists: " + Files.exists(path));

        //metodo para exibir a data completa da ultima modificação de um arquivo.
        FileTime fileTime = Files.getLastModifiedTime(path);
        System.out.println("lastModifiedTime: " + fileTime);

        //mostrando que é o dono desse arquivo.
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner: " + owner);
    }
}
