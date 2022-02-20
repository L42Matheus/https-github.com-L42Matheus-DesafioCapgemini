import java.util.ArrayList;
import java.util.List;

public class TestLogica01 {
    public static void main(String[] args) {

        /*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
        A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço
         */


        List<String> degraus = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            degraus.add("".repeat(6 - i) + "*".repeat(i + 1));
        }

        for (String degrau : degraus) {
            System.out.println(degrau);
        }
    }
}
