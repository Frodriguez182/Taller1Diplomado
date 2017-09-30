package com.example.android.taller1_empresazxy;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {
    public static double calcularPrecio(int pares, int genero, int tipo, int marca) {
        double precio = 0;

        if (genero == 0) {
            // Si es hombre
            if (tipo == 0) {
                // Si es zapatilla
                if (marca == 0) {
                    // Si es nike
                    precio = 120000;
                } else if (marca == 1) {
                    // Si es adidas
                    precio = 140000;
                } else if (marca == 2) {
                    // Si es puma
                    precio = 130000;
                }
            } else if (tipo == 1) {
                // Si es clasico
                if (marca == 0) {
                    // Si es nike
                    precio = 50000;
                } else if (marca == 1) {
                    // Si es adidas
                    precio = 80000;
                } else if (marca == 2) {
                    // Si es puma
                    precio = 100000;
                }
            }
        } else if (genero == 1) {
            // Si es mujer
            if (tipo == 0) {
                // Si es zapatilla
                if (marca == 0) {
                    // Si es nike
                    precio = 100000;
                } else if (marca == 1) {
                    // Si es adidas
                    precio = 130000;
                } else if (marca == 2) {
                    // Si es puma
                    precio = 110000;
                }
            } else if (tipo == 1) {
                // Si es clasico
                if (marca == 0) {
                    // Si es nike
                    precio = 60000;
                } else if (marca == 1) {
                    // Si es adidas
                    precio = 70000;
                } else if (marca == 2) {
                    // Si es puma
                    precio = 120000;
                }
            }
        }

        return precio * pares;
    }
}

