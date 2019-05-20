/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_2;

import static Lista_2.Gerente.cjVendedor;
import static Lista_2.Gerente.gerente;
import static Lista_2.Gerente.gerentes;
import static Lista_2.Gerente.selecionaGerente;
import static Lista_2.Vendedor.selecionaVendedor;
import static Lista_2.Vendedor.vendedor;
import static Lista_2.Vendedor.vendedores;
import java.util.Arrays;

/**
 *
 * @author ANDRE
 */
public class Equipe {

    static Gerente lider;
    static Equipe[] equipe;

    public Equipe(Gerente lider, Vendedor[] vendedores) {
        lider = gerente;
        vendedores = cjVendedor;
    }

    public Gerente getLider() {
        return lider;
    }

    public void setLider(Gerente lider) {
        lider = gerente;
    }

    public Vendedor[] getVendedores() {
        return cjVendedor;
    }

    public void setVendedores(Vendedor[] vendedores) {
        vendedores = cjVendedor;
    }

    static Equipe[] criaEquipe(Equipe[] equipe) {
        gerente = selecionaGerente(gerente);
        if ("Eletrodomésticos".equals(Gerente.nomeGerencia)) {
            equipe = new Equipe[4];
            for (int v = 0; v <= equipe.length; v++) {
                Gerente.cjVendedor[v] = selecionaVendedor(vendedor);
                
            }
            System.out.println(Arrays.toString(equipe));
        } else if ("Roupas e Calçados".equals(Gerente.nomeGerencia)) {
            equipe = new Equipe[6];
            for (int v = 0; v <= equipe.length; v++) {
                Gerente.cjVendedor[v] = selecionaVendedor(vendedor);
                
            }
            System.out.println(Arrays.toString(equipe));
        }
        System.out.println(Arrays.toString(gerentes));
        System.out.println(Arrays.toString(vendedores));
        return equipe;
    }
}
