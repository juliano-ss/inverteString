
package com.mycompany.invertestring;

/**
 *
 * @author jotal
 */
import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = input.nextLine();

        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("A string invertida é: " + invertida);
    }
}
