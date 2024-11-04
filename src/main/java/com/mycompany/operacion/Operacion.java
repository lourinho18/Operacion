/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacion;

/**
 *
 * @author lourinho
 */
import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);

        scanner.close();
    }
}

