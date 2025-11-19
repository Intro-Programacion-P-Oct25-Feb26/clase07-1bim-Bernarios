/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteclases;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class ejemplo01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        int limite = 10;

        while (contador <= limite) {
            System.out.printf("contador %d\n", contador);
            contador = contador + 1;
        }
    }
}
