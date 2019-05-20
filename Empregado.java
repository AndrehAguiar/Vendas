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
public class Empregado extends Pessoa {

    static String cnpj;
    static float salario;
    static int matricula;
    static Empregado empregado;
    static Empregado[] empregados;

    public Empregado(String cnpj, float salario, int matricula, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        Empregado.cnpj = cnpj;
        Empregado.salario = salario;
        Empregado.matricula = matricula;
    }

    public void setCnpj(String cnpj) {
        Empregado.cnpj = cnpj;
    }

    public String getCnpj() {
        return Empregado.cnpj;
    }

    public void setSalario(float salario) {
        Empregado.salario = salario;
    }

    public float getSalario() {
        return Empregado.salario;
    }

    public void setmatricula(int matricula) {
        Empregado.matricula = matricula;
    }

    public int getMatricula() {
        return Empregado.matricula;
    }
    static Empregado criaEmpregado(Empregado empregado){
        Scanner cnpjEmpregado = new Scanner(System.in);
        System.out.printf("Informe o CNPJ do empregado: ");
        cnpj = cnpjEmpregado.next();

        System.out.printf("Informe o salário do empregado: ");
        Scanner salarioEmpregado = new Scanner(System.in);
        salario = salarioEmpregado.nextFloat();
        
        Scanner matriculaEmpregado = new Scanner(System.in);
        System.out.printf("Informe a matrícula do empregado: ");
        matricula = matriculaEmpregado.nextInt();
               
        criaPessoa(empregado);        
        return empregado;
    }
}
