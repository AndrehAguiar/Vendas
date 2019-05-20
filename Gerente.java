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
public class Gerente extends Empregado {

    static String nomeGerencia;
    static Vendedor[] cjVendedor;
    static Gerente[] gerentes;
    static Gerente gerente;
    static int e = 0;
    static int g = 0;

    public Gerente(String nomeGerencia, Vendedor[] cjVendedor, String cnpj, float salario, int matricula, String nome, String sexo, int idade) {
        super(cnpj, salario, matricula, nome, sexo, idade);
        Gerente.nomeGerencia = nomeGerencia;
        Gerente.cjVendedor = cjVendedor;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nome = nomeGerencia;
    }

    public String getNomeGerencia() {
        return Gerente.nomeGerencia;
    }

    public void setcjVendedor(Vendedor[] cjVendedor) {
        Gerente.cjVendedor = cjVendedor;
    }

    public Vendedor[] getcjVendedor() {
        return Gerente.cjVendedor;
    }

    static Gerente criaGerente(Gerente gerente) {

        Scanner setorGerencia = new Scanner(System.in);
        System.out.println("Informe o setor do gerente");
        System.out.println("Digite (1) para Eletrodomésticos | (2) para Roupas e Calçados");
        int setor = setorGerencia.nextInt();

        switch (setor) {
            case 1: {
                nomeGerencia = "Eletrodomésticos";
                break;
            }
            case 2: {
                nomeGerencia = "Roupas e Calçados";
                break;
            }
        }
        cjVendedor = null;
        gerentes = new Gerente[g];
        g++;
        return gerente;
    }

    static Gerente[] listaGerente(Gerente[] gerentes) {
        for (Gerente gerentee : gerentes) {
            System.out.println(gerentee);
        }
        return gerentes;
    }

    static Gerente selecionaGerente(Gerente gerente) {

        System.out.println("Informe o ID gerente: ");
        listaGerente(gerentes);
        Scanner idGerente = new Scanner(System.in);
        int id = idGerente.nextInt();
        for (int i = 0; i != id; i++) {
            if (i == id) {
                gerente = gerentes[i];
            }
        }
        return gerente;
    }
}
