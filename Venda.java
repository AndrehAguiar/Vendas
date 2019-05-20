/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_2;

import static Lista_2.Cliente.selecionaCliente;
import static Lista_2.Vendedor.selecionaVendedor;
import static Lista_2.Vendedor.vd;
import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Venda extends Produto {

    static Produto produto;
    static Vendedor vendedor;
    static Cliente cliente;
    static Venda venda;
    static float qtdVendida;
    static Venda[] vendas;

    public Venda(Produto produto, Vendedor vendedor, Cliente cliente, float qtdVendida, float valor) {
        super(prodNome, valor);
        Venda.produto = produto;
        Venda.vendedor = vendedor;
        Venda.cliente = cliente;
    }

    public float getQtdVendida() {
        return Venda.qtdVendida;
    }

    public void setQtdVendida(float qtdVendida) {
        Venda.qtdVendida = qtdVendida;
    }

    public Vendedor getVendedor() {
        return Venda.vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        Venda.vendedor = vendedor;
    }

    public Produto getProdVendido() {
        return Venda.produto;
    }

    public void setProdVendido(Produto produto) {
        Venda.produto = produto;
    }

    public Cliente getCompraCliente() {
        return Venda.cliente;
    }

    public void setCompraCliente(Cliente cliente) {
        Venda.cliente = cliente;
    }

    float getValorVenda() {
        float valorTotal;
        valorTotal = qtdVendida * valor;
        return valorTotal;
    }

    static Venda criaVenda(Venda venda) {
        selecionaProduto(produto);
        produto = selecionaProduto(produto);

        selecionaVendedor(vendedor);
        System.out.println("Informe o id do vendedor: ");
        vendedor = selecionaVendedor(vendedor);

        
        System.out.println("Informe o id do Cliente");
        cliente = selecionaCliente(cliente);

        Scanner qtd = new Scanner(System.in);
        System.out.println("Informe a quantidade: ");
        qtdVendida = qtd.nextFloat();
        
        Venda.valor = Produto.valor * qtdVendida;
        
        vd++;
        return venda;
    }
    static Venda[] listaVenda(Venda[] vendas){
        for (Venda vendido : vendas) {
            System.out.println(vendido);
        }
        return vendas;
        
    }
    static Venda selecionaVenda(Venda venda){
        
        System.out.println("Informe o ID produto: ");
        listaVenda(vendas);
        Scanner idVendas = new Scanner(System.in);
        int id = idVendas.nextInt();
        for(int i = 0; i != id; i++){
            if (i == id){
                venda = vendas[i];
            }
        }
        
        return venda;
    }
}
