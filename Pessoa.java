/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_2;

import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Pessoa {

    static String nome;
    static String sexo;
    static int idade;

    public Pessoa(String nome, String sexo, int idade) {
        Pessoa.nome = nome;
        Pessoa.sexo = sexo;
        Pessoa.idade = idade;
    }

    public void setNome(String nome) {
        Pessoa.nome = nome;
    }

    public String getNome() {
        return Pessoa.nome;
    }

    public void setSexo(String sexo) {
        Pessoa.sexo = sexo;
    }

    public String getSexo() {
        return Pessoa.sexo;
    }

    public void setIdade(int idade) {
        Pessoa.idade = idade;
    }

    public int getIdade() {
        return Pessoa.idade;
    }
    static Pessoa criaPessoa(Pessoa pessoa) {
        
            Scanner nomePessoa = new Scanner(System.in);
            System.out.printf("Informe o nome da pessoa: ");
            nome = nomePessoa.next();
            
            Scanner sexoPessoa = new Scanner(System.in);
            System.out.printf("Informe o gênero da pessoa: ");
            sexo = sexoPessoa.next();
            
            Scanner idadePessoa = new Scanner(System.in);
            System.out.printf("Informe a idade da pessoa: ");
            idade = idadePessoa.nextInt();
            
            return pessoa;
    }
}
