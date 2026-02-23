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

    public static List<String> buildList() {
        // 1. Array convencional (Fixo)
        String[] nomesArray = {"Amanda", "Carlos", "Beatriz"};

        // 2. Arrays.asList (Gera uma lista ligada ao array)
        List<String> listaDeArray = Arrays.asList(nomesArray);

        // 3. List.of (Java 9+ - Gera uma lista imutável)
        List<String> nomesExtras = List.of("Daniel", "Elena");

        // 4. Criando uma cópia e unindo
        List<String> listaFinal = new ArrayList<>(listaDeArray);
        listaFinal.addAll(nomesExtras);

        return listaFinal; // Retorna a lista pronta para quem chamar
    }

    public static void main(String[] args) {
        // O main agora apenas consome a lógica do método buildList
        List<String> listaFinal = buildList();

        System.out.println("Lista Completa após adição de pessoas:");
        listaFinal.forEach(nome -> System.out.println("- " + nome));
        System.out.println("Tamanho da lista: " + listaFinal.size());
    }
}