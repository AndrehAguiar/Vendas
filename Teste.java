/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_2;

import static Lista_2.Venda.produto;
import static Lista_2.Venda.venda;
import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class Teste {

    static Object teste;

    public static void main(String[] teste) {

        System.out.println("Digite a opção desejada:");
        System.out.println("(1) Cadastra Pessoa | (2) Cadastra Produto | (3) Registrar venda | (4) Emitir relatório");
        Scanner opcaoMenu = new Scanner(System.in);
        int opcao = opcaoMenu.nextInt();
        for (int i = 0; i >= 0; i++) {
            switch (opcao) {
                case 1:
                    opcaoPessoa.opcaoPessoa();
                    break;
                case 2:
                    Produto.criaProduto(produto);
                    main((String[]) teste);
                case 3:
                    Venda.criaVenda(venda);
                    main((String[]) teste);
                case 4:
                    opcaoLista.opcaoLista();
                    main((String[]) teste);
                case 5:
                    break;
            }
        }
    }
}
