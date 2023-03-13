/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wallacewagner.algorito2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author T-Gamer
 */
public class ArquivosObjetos {

    public void criarObjeto(Object object) throws Exception {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("database.db"));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
        }
    }

    public Object lerObjeto() throws Exception {
        try (FileInputStream fileInputStream = new FileInputStream(new File("database.db"));
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return objectInputStream.readObject();
        }
    }

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setNome("João da Silva");
        aluno.setCurso("ADS");
        aluno.setSerie(1);
        aluno.setValor(590.90);
        aluno.setPeriodo("Noturno");

        ArquivosObjetos arquivosObjetos = new ArquivosObjetos();
        try {
            arquivosObjetos.criarObjeto(aluno);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        Aluno aluno2 = null;
        try {
            aluno2 = (Aluno) arquivosObjetos.lerObjeto();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        System.out.println(aluno.getNome());
        System.out.println(aluno.getCurso());
        System.out.println(aluno.getSerie());
        System.out.println(aluno.getValor());
        System.out.println(aluno.getPeriodo());
    }
}
