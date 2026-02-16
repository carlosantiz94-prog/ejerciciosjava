package com.example;

public class pizzeria {

    private String nombre;
    private String ingredientes;
    private double precioBase;

    public pizzeria(String nombre, String ingredientes, double precioBase) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precioBase = precioBase;
    }

    public double calcularPrecio(String tamaño) {
        double precioFinal = precioBase;

        switch (tamaño.toLowerCase()) {
            case "mediana":
                precioFinal += 5000;
                break;
            case "grande":
                precioFinal += 10000;
                break;
            case "familiar":
                precioFinal += 15000;
                break;
        }

        return precioFinal;
    }

    public void mostrarInfo() {
        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Precio base: $" + precioBase);
    }
}