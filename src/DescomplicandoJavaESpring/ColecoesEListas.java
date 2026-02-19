package DescomplicandoJavaESpring;

/**
 * Exercício: Manipulação de Coleções e Listas
 * Curso: Descomplicando Java e Spring (LinuxTips)
 * Objetivo: Praticar Array, List.of, Arrays.asList e iteração com forEach.
 * * Regras de negócio:
 * 1. Criar um array estático (tamanho fixo) e exibir seu comprimento (.length).
 * 2. Converter o array para uma lista utilizando Arrays.asList para permitir integração.
 * 3. Criar uma segunda lista imutável usando List.of para representar dados protegidos.
 * 4. Unir os dados em uma nova lista (ArrayList) que permita modificações futuras.
 * 5. Percorrer a lista final e imprimir cada elemento utilizando a sintaxe de forEach.
 * * @author Amanda Carrieri
 *
 * @date 2026-02-11
 */

import java.util.ArrayList; //Para criar listas que podem mudar de tamanho. (É "COMO" fazer - A lista em si)
import java.util.Arrays; //Para usar o truque de converter arrays fixos. (A ponte)
import java.util.List; //A "regra geral" das listas que o Java segue (É o "O QUE" deve ser feito - interface).

public class ColecoesEListas {
    public static void main(String[] args) {

        // 1. Array convencional (Fixo)
        String[] nomesArray = {"Amanda", "Carlos", "Beatriz"};

        // 2. Usando .length
        System.out.println("Tamanho do array: " + nomesArray.length);
        System.out.println("Os nomes são: " + Arrays.toString(nomesArray)); // aqui não funciona para imprimir nomes como em listas, por ser um array

        // 3. Arrays.asList (Gera uma lista ligada ao array)
        List<String> listaDeArray = Arrays.asList(nomesArray);

        // 4. List.of (Java 9+ - Gera uma lista imutável)
        List<String> nomesExtras = List.of("Daniel", "Elena");

        // 5. Criando uma cópia e unindo (Usando ArrayList para poder modificar)
        List<String> listaFinal = new ArrayList<>(listaDeArray);
        listaFinal.addAll(nomesExtras);

        // 6. Percorrendo com forEach e Lambda
        System.out.println("Lista Completa após adição de pessoas:");
        listaFinal.forEach(nome -> System.out.println("- " + nome));
        System.out.println("Tamanho da lista: " + listaFinal.size()); // aqui uso .size em vez de .legth pois é uma lista
    }
}