package DescomplicandoJavaESpring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColecoesEListasTest {

    @Test
    void validarLogicaDeUniaoDeListas() {
        String[] nomesArray = {"Amanda", "Carlos", "Beatriz"};
        List<String> listaDeArray = Arrays.asList(nomesArray);
        List<String> nomesExtras = List.of("Daniel", "Elena");

        // teste da união de listas
        List<String> listaFinal = new ArrayList<>(listaDeArray);
        listaFinal.addAll(nomesExtras);

        // Asserções: Onde o teste verica o resultado
        // 1. Verifica se o tamanho é 5
        Assertions.assertEquals(5, listaFinal.size(), "A lista deveria ter 5 nomes.");

        // 2. Verifica se nomes específicos estão lá
        Assertions.assertTrue(listaFinal.contains("Amanda"), "Amanda deveria estar na lista.");
        Assertions.assertTrue(listaFinal.contains("Daniel"), "Daniel deveria estar na lista.");

        System.out.println("Teste realizado com sucesso!");
    }
}