/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_2;

import static Lista_2.Cliente.cliente;
import static Lista_2.Cliente.criaCliente;
import static Lista_2.Vendedor.criaVendedor;
import static Lista_2.Gerente.criaGerente;
import static Lista_2.Empregado.criaEmpregado;
import static Lista_2.Empregado.empregado;
import static Lista_2.Equipe.criaEquipe;
import static Lista_2.Equipe.equipe;
import static Lista_2.Gerente.gerente;
import static Lista_2.Gerente.gerentes;
import static Lista_2.Gerente.listaGerente;
import static Lista_2.Teste.teste;
import static Lista_2.Vendedor.listaVendedor;
import static Lista_2.Vendedor.vendedor;
import static Lista_2.Vendedor.vendedores;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class opcaoPessoa {

    public static Vendedor opcaoPessoa() {
    
        int opcao = 1;
        
        while (opcao > 0 && opcao < 3) {
            
            Scanner opcaoPessoa = new Scanner(System.in);
            System.out.println("Digite: (1) para Cliente | (2) para Empregado | (3) para Equipe | (4) Voltar");
            int tipoPessoa = opcaoPessoa.nextInt();
            switch (tipoPessoa) {
                case 1:
                    criaCliente(cliente);
                    break;
                case 2:
                    criaEmpregado(empregado);
                    System.out.println("Informe o cargo do empregado: ");
                    System.out.println("Digite (1) para Vendedor | (2) para Gerente");
                    Scanner opcaoCargo = new Scanner(System.in);
                    int cargo = opcaoCargo.nextInt();
                    switch (cargo) {
                        case 1: 
                            criaVendedor(vendedor); 
                            break;
                        case 2: {
                            criaGerente(gerente);
                            break;
                        }
                    }
                break;
                case 3:
                    criaEquipe(equipe);
                    break;
                case 4:
                    Teste.main((String[]) teste);
            }
            System.out.println(Arrays.toString(vendedores));
            System.out.println(Arrays.toString(gerentes));
        }
        return null;
    }
}
