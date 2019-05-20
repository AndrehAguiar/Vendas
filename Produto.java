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
public class Produto {

    static String prodNome;
    static float valor;
    static Produto[] produtos;
    static int p;

    public Produto(String prodNome, float valor) {

        Produto.prodNome = prodNome;
        Produto.valor = valor;
    }

    public void setProdNome(String prodNome) {
        Produto.prodNome = prodNome;
    }

    public String getProdNome() {
        return Produto.prodNome;
    }

    public void setValor(float valor) {
        Produto.valor = valor;
    }

    public float getValor(float valor) {
        return Produto.valor;
    }

    static Produto criaProduto(Produto produto) {

        System.out.printf("Informe o nome do produto: ");
        Scanner nomeProduto = new Scanner(System.in);
        prodNome = nomeProduto.next();

        System.out.printf("Informe o valor do produto: ");
        Scanner valorProduto = new Scanner(System.in);
        valor = valorProduto.nextFloat();

        produtos = new Produto[p];
        p++;
        return produto;
    }

    static Produto[] listaProduto(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        return produtos;
    }

    static Produto selecionaProduto(Produto produto) {

        System.out.println("Informe o ID produto: ");
        listaProduto(produtos);
        Scanner idProduto = new Scanner(System.in);
        int id = idProduto.nextInt();
        for (int i = 0; i != id; i++) {
            if (i == id) {
                produto = produtos[i];
            }
        }
        return produto;
    }
}
