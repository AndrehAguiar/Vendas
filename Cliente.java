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
public class Cliente extends Pessoa {

    static String cpf;
    static Cliente cliente;
    static Cliente[] clientes;
    static int c;

    public Cliente(String cpf, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        Cliente.cpf = cpf;
    }

    public String getcpf() {
        return Cliente.cpf;
    }

    public void setcpf(String cpf) {
        Cliente.cpf = cpf;
    }

    static Cliente criaCliente(Cliente cliente) {
        Scanner cpfCliente = new Scanner(System.in);
        System.out.printf("Informe o CPF do cliente: ");
        cpf = cpfCliente.next();
        criaPessoa(cliente);

        clientes = new Cliente[c];
        c++;

        return cliente;
    }

    static Cliente[] listaCliente(Cliente[] clientes) {
        for (Cliente clientee : clientes) {
            System.out.println(clientee);
        }
        return clientes;
    }

    static Cliente selecionaCliente(Cliente cliente) {

        System.out.println("Informe o ID cliente: ");
        listaCliente(clientes);
        Scanner idCliente = new Scanner(System.in);
        int id = idCliente.nextInt();
        for (int i = 0; i != id; i++) {
            if (i == id) {
                cliente = clientes[i];
            }
        }
        return cliente;
    }
}
