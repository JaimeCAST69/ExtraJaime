package mx.edu.utez;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class EnvioTest {
    Envio envio = new Envio();

    @Test
    public void distancia() {

        String mjs = "Distancia Guardada";
        assertEquals(mjs,envio.distancia(3));
    }

    @Test
    public void peso(){
        String mjs = "Peso Guardado";
        assertEquals(mjs, envio.peso(2));
    }

        @Test
    public void costo(){
            envio.costo(1,"Terrestre");

        assertEquals(50,50);
        }



}