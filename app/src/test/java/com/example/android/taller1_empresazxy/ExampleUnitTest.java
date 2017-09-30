package com.example.android.taller1_empresazxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    // Hombres
    //
    // tipo de zapato zapatillas

    @Test
    public void precio_hombres_zapatilla_adidas_correcto() throws Exception {
        assertEquals(280000, Metodos.calcularPrecio(2,0,0,1), 0);
    }

    @Test
    public void precio_hombres_zapatilla_adidas_incorrecto() throws Exception {
        assertNotEquals(280000, Metodos.calcularPrecio(3,0,0,1), 0);
    }
    @Test
    public void precio_hombres_zapatilla_nike_correcto() throws Exception {
        assertEquals(240000, Metodos.calcularPrecio(2,0,0,0), 0);
    }

    @Test
    public void precio_hombres_zapatilla_nike_incorrecto() throws Exception {
        assertNotEquals(240000, Metodos.calcularPrecio(3,0,0,0), 0);
    }


    //  tipo de zapato clasico

    @Test
    public void precio_hombres_clasico_puma_correcto() throws Exception {
        assertEquals(200000, Metodos.calcularPrecio(2,0,1,2), 0);
    }

    @Test
    public void precio_hombres_clasico_puma_incorrecto() throws Exception {
        assertNotEquals(200000, Metodos.calcularPrecio(3,0,1,2), 0);
    }

    @Test
    public void precio_hombres_clasico_adidas_correcto() throws Exception {
        assertEquals(160000, Metodos.calcularPrecio(2,0,1,1), 0);
    }

    @Test
    public void precio_hombres_clasico_adidas_incorrecto() throws Exception {
        assertNotEquals(160000, Metodos.calcularPrecio(3,0,1,1), 0);
    }



    // Mujeres
    //
    // tipo de zapatos zapatillas

    @Test
    public void precio_mujeres_zapatilla_puma_correcto() throws Exception {
        assertEquals(220000, Metodos.calcularPrecio(2,1,0,2), 0);
    }

    @Test
    public void precio_mujeres_zapatilla_puma_incorrecto() throws Exception {
        assertNotEquals(220000, Metodos.calcularPrecio(3,1,0,2), 0);
    }
    @Test
    public void precio_mujeres_zapatilla_nike_correcto() throws Exception {
        assertEquals(200000, Metodos.calcularPrecio(2,1,0,0), 0);
    }

    @Test
    public void precio_mujeres_zapatilla_nike_incorrecto() throws Exception {
        assertNotEquals(200000, Metodos.calcularPrecio(3,1,0,0), 0);
    }


    // tipo de zapatos  clasico
    @Test
    public void precio_mujeres_clasico_nike_correcto() throws Exception {
        assertEquals(120000, Metodos.calcularPrecio(2,1,1,0), 0);
    }

    @Test
    public void precio_mujeres_clasico_nike_incorrecto() throws Exception {
        assertNotEquals(120000, Metodos.calcularPrecio(3,1,1,0), 0);
    }

    @Test
    public void precio_mujeres_clasico_puma_correcto() throws Exception {
        assertEquals(240000, Metodos.calcularPrecio(2,1,1,2), 0);
    }

    @Test
    public void precio_mujeres_clasico_puma_incorrecto() throws Exception {
        assertNotEquals(240000, Metodos.calcularPrecio(3,1,1,2), 0);
    }
}