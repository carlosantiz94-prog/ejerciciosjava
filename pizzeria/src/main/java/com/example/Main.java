package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear 3 pizzas
        pizzeria pizza1 = new pizzeria("Hawaiana", "Jamón y Piña", 20000);
        pizzeria pizza2 = new pizzeria("Pepperoni", "Queso y Pepperoni", 22000);
        pizzeria pizza3 = new pizzeria("Mexicana", "Carne y Jalapeños", 24000);

        System.out.println("Seleccione una pizza:");
        System.out.println("1. Hawaiana");
        System.out.println("2. Pepperoni");
        System.out.println("3. Mexicana");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        pizzeria pizzaSeleccionada = null;

        switch (opcion) {
            case 1:
                pizzaSeleccionada = pizza1;
                break;
            case 2:
                pizzaSeleccionada = pizza2;
                break;
            case 3:
                pizzaSeleccionada = pizza3;
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("Seleccione tamaño: mediana, grande o familiar");
        String tamaño = sc.nextLine();

        double precioFinal = pizzaSeleccionada.calcularPrecio(tamaño);

        System.out.println("Precio final: $" + precioFinal);
    }
}

