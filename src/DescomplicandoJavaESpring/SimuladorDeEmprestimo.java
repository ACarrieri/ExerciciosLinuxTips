package DescomplicandoJavaESpring; /**
 * Exercício 2: Simulador de Empréstimo
 * Curso: Descomplicando Java e Spring (LinuxTips)
 * * Objetivo: Praticar desvios condicionais e operadores lógicos.
 * Regras de Negócio:
 * 1. O empréstimo é aprovado se a parcela for <= 30% do salário.
 * 2. Se o prazo for > 24 meses, incidem juros de 5% sobre a parcela.
 * * @author Amanda Carrieri
 * @date 2026-02-03
 */

import java.util.Scanner;

public class SimuladorDeEmprestimo {

    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Empréstimo");
        System.out.println("Digite seu salário: ");
        double salario = leitor.nextDouble();
        System.out.println("Digite o valor que você quer pagar por parcela: ");
        double parcela = leitor.nextDouble();
        System.out.println("Digite em quantos meses quer pagar: ");
        double meses = leitor.nextDouble();

        if (meses > 24) {  //verificamos se o tempo de pagamento aumenta o valor da parcela
            parcela = parcela * 1.05; //Aplicamos 5% de juros (multiplicar por 1.05 é o mesmo que somar 5%)
            System.out.println("Aviso: Devido ao prazo, a parcela teve 5% de juros.");
        }

        double limiteSalario = salario * 0.3; //30% = 30/100 = 0,3. multiplicar por 0.3 é descobrir quanto vale 30%.

        if (parcela <= limiteSalario) { // a parcela cabe no orçamento?
            System.out.println("EMPRÉSTIMO APROVADO!");
            System.out.printf("O valor final da parcela é: R$ %.2f", parcela);
        } else {
            System.out.println("EMPRÉSTIMO REPROVADO.");
            System.out.printf("A parcela de R$ %.2f excede o limite de R$ %.2f (30%% do salário).", parcela, limiteSalario);
        }
    }
}

