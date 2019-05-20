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
public class Vendedor extends Empregado {
    
    static Venda[] cjVendas;
    static int v;
    static int vd;
    static Vendedor vendedor;
    static Vendedor[] vendedores;
    
    public Vendedor(String cnpj, float salario, Venda[] cjVendas, int matricula, String nome, String sexo, int idade) {
        super(cnpj, salario, matricula, nome, sexo, idade);
        cjVendas = Vendedor.cjVendas;
    }

    public Venda[] getcjVendas() {
        return Vendedor.cjVendas;
    }

    public void setcjVendas(Venda[] cjVendas) {
        Vendedor.cjVendas = cjVendas;
    }

    static Vendedor criaVendedor(Vendedor vendedor) {
        cjVendas = null;
        vendedores = new Vendedor[v];
        v++;
        
        return vendedor;
    }

    static Vendedor[] listaVendedor(Vendedor[] vendedores) {
        for (Vendedor vendedore : vendedores) {
            System.out.println(vendedore);
        }
        return vendedores;
    }
    static Vendedor selecionaVendedor(Vendedor vendedor){
        
        System.out.println("Informe o ID vendedor: ");
        listaVendedor(vendedores);
        Scanner idVendedor = new Scanner(System.in);
        int id = idVendedor.nextInt();
        for(int i = 0; i != id; i++){
            if (i == id){
                vendedor = vendedores[i];
            }
        }
        return vendedor;
    }
}
