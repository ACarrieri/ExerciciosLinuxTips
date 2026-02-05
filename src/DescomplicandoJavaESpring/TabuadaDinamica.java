package DescomplicandoJavaESpring; /**
 * Exercício 3: Tabuada Dinâmica
 * Curso: Descomplicando Java e Spring (LinuxTips)
 * Objetivo: Praticar Laços de Repetição (For)
 * Regras de negócio:
 * 1. O usuário digita um inteiro e o programa imprime a tabuada deste.
 * 2. Pula-se a multiplicação por 5 (comando continue).
 * 3. Se resultado > 90, o programa para (comando break).
 * @author Amanda Carrieri
 * @date 2026-02-04
 */

import java.util.Scanner;

public class TabuadaDinamica {

    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = leitor.nextInt();

        System.out.println("\n--- Tabuada do " + numero + " ---");

        for (int i = 1; i <= 10; i++) { // i++ = (i = i + 1) laço que começa em 1 e vai até 10
            int resultado = numero * i;

            if (resultado > 90) {
                System.out.println("Execução interrompida: o resultado (" + resultado + ") passou de 90.");
                break;
            }

            if (i == 5) {
                System.out.println("Multiplicação por 5 pulada.");
                continue;
            }

            System.out.println(numero + " x " + i + " = " + resultado);
        }

        System.out.println("--- Fim da Tabuada ---");
        leitor.close();
    }
}
