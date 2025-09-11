package Classes_Atributos_Metodos;

import Classes_Atributos_Metodos.Exer1.Produtos;
import Classes_Atributos_Metodos.Exer2.Funcionario;
import Classes_Atributos_Metodos.Exer3.Retangulo;
import Classes_Atributos_Metodos.Exer4.ContaCorrente;
import Classes_Atributos_Metodos.Exer5.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println(" -----------------PRODUTOS -----------------");
        Produtos p1 = new Produtos("Notbook", 12.0, 20);
        System.out.println("Total estoque: " + p1.calcularValorEstoque());

        System.out.println("");
        System.out.println(" -----------------Funcionario -----------------");
        Funcionario f1 = new Funcionario("Samyr", 200, 1234);
        System.out.println("Sálario final: " + f1.calcularSalarioMensal());

        System.out.println("");
        System.out.println(" -----------------Retangulo -----------------");
        Retangulo r1 = new Retangulo(23.56, 12.45);
        System.out.println("Área ajustada: " + r1.calcularArea());

        System.out.println("");
        System.out.println(" -----------------ContaCorrente -----------------");
        ContaCorrente cc1 = new ContaCorrente(123.5);
        System.out.println("Saldo completo da conta: "+ cc1.verificarSaldo());

        System.out.println("");
        System.out.println(" -----------------Calculadora -----------------");
        Calculadora calc1 = new Calculadora(123.2);
        System.out.println("Cálculo total: " + calc1.obterResultado());
    }
}