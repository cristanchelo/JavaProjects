package com.cedaniel200.solid.game.controller;

import java.io.IOException;
import java.util.Scanner;

public class ControladorConsola {
    private final Scanner scanner;

    public ControladorConsola(){
        this.scanner = new Scanner(System.in);
    }

    public void limpiar() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException | IOException e) {
                System.out.println();
            }
        } else {
            System.out.print("\033\143");
        }
    }

    public int getEntrada(){
        return scanner.nextInt();
    }

    public void imprimirConSaltoLinea(String mensaje){
        System.out.println(mensaje);
    }

    public void imprimir(String mensaje){
        System.out.print(mensaje);
    }
}
