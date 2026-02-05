package DescomplicandoJavaESpring; /**
 * Exercício 1: Conversor de Temperatura
 * Curso: Descomplicando Java e Spring (LinuxTips)
 * Objetivo: Converter Celsius para Kelvin e Fahrenheit.
 * Fórmulas:
 * - K = C + 273.15
 * - F = (C * 1.8) + 32
 * @author Amanda Carrieri
 * @date 2026-02-03
 */

import java.util.Scanner; //importamos a ferramenta para leitura do teclado

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Criamos o objeto scanner para ler o que o usuário digita

        System.out.print("Digite a temperatura em Celsius: "); //entrada
        double celsius = leitor.nextDouble(); //lemos o decimal

        double fahrenheit = (celsius * 1.8) + 32; //Processamento
        double kelvin = celsius + 273.15;

        System.out.println("\n--- Resultados ---"); //saída
        System.out.printf("%.2f°C equivalem a: \n", celsius);
        System.out.printf("%.2f°F (Fahrenheit)\n", fahrenheit);
        System.out.printf("%.2fK (Kelvin)\n", kelvin);

        leitor.close(); // Fechamos o leitor (boa prática)
    }
}

//double: Como temperaturas raramente são números inteiros exatos, usamos o tipo de dado double para maior precisão decimal.
//System.out.printf: O f vem de formatted. O código %.2f diz ao Java: "Exiba um número decimal (float) com apenas 2 casas após a vírgula". O \n serve para pular linha.
