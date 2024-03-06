package main;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String inputString = scanner.nextLine();

        String invertedString = inverterString(inputString);

        System.out.println("A string invertida é: " + invertedString);

        scanner.close();
    }

    // Função para inverter uma string
    public static String inverterString(String str) {
        String inverted = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            inverted += str.charAt(i);
        }
        
        return inverted;
    }
}
