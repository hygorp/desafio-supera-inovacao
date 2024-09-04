package org.hygorp;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String decode(String input) {
        String ohms = classifyOhmAmount(input);
        return classifyColors(ohms);
    }

    public static String classifyOhmAmount(String input) {
        input = input.split(" ")[0].trim();
        double ohmAmount;

        try {
            if (input.contains("k")) {
                ohmAmount = Double.parseDouble(input.replace("k", "")) * 1000;
            } else if (input.contains("M")) {
                ohmAmount = Double.parseDouble(input.replace("M", "")) * 1000000;
            } else {
                ohmAmount = Double.parseDouble(input);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor inválido: " + input);
        }

        return String.valueOf(ohmAmount).split("\\.")[0];
    }

    public static String classifyColors(String input) {
        try {
            String[] colors = {"preto", "marrom", "vermelho", "laranja", "amarelo", "verde", "azul", "violeta", "cinza", "branco"};

            char[] sequence = input.toCharArray();

            return colors[Integer.parseInt(String.valueOf(sequence[0]))] +
                    " " +
                    colors[Integer.parseInt(String.valueOf(sequence[1]))] +
                    " " +
                    colors[sequence.length - 2] +
                    " " +
                    "dourado";
        } catch (IndexOutOfBoundsException exception) {
            throw new IllegalArgumentException("Valor inválido: " + input);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada: ");
        String input = sc.nextLine();

        if (input.contains(" ohms"))
            System.out.println(decode(input));
        else
            System.err.println("Formato inválido!");

        sc.close();
    }
}
