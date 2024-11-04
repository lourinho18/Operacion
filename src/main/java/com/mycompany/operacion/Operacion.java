/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacion;

/**
 *
 * @author lourinho
 */
public class Operacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Realizar la multiplicación
        int resultado = numero1 * numero2;

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}
