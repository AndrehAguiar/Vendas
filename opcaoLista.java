/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_2;

import static Lista_2.Venda.listaVenda;
import static Lista_2.Venda.vendas;
import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class opcaoLista {
     public static void opcaoLista() {

        int l = 1;

        while (l > 0 && l < 3) {

            Scanner opcaoLista = new Scanner(System.in);
            System.out.println("Digite: (1) para Relatório de vendas (2) para Maior venda (3) para Voltar ao menu principal");
            int tipoLista = opcaoLista.nextInt();
            switch (tipoLista) {
                case 1: 
                    listaVenda(vendas);
                    break;
                case 2:
                    
                    break;
                case 3:
                    String[] teste = null;
                    Teste.main(teste);
            }
        }
    }
}
