package DescomplicandoJavaESpring;

/**
 * Exercício: Lista mutável
 * Curso: Descomplicando Java e Spring (LinuxTips) - Mentoria Stella Frágas?
 * Objetivo:
 * * Regras de negócio:

 * * @author Amanda Carrieri
 *
 * @date 2026-02-23
 */

import java.util.List;
import java.util.ArrayList;

public class ListaMutavel {

    public static List<String> criarListaDinamica() {
        List<String> lista = new ArrayList<>();

        //adicionando nomes
        lista.add("Amanda");
        lista.add("José");

        //removendo nomes
        lista.remove("José");
        return lista;
    }

    public static void main(String[] args) {
        List<String> minhaLista = criarListaDinamica();
        System.out.println("Minha lista mutável: " + minhaLista);
    }
}
