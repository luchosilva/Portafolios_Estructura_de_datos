package model;

import cl.ufro.dci.ed.model.Carta;
import cl.ufro.dci.ed.model.MazoQueue;

import cl.ufro.dci.ed.model.RangoCarta;
import cl.ufro.dci.ed.model.TipoCarta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMazoQueue {
    private MazoQueue mazo;

    @Before
    public void prepare () {
        this.mazo = new MazoQueue();
    }

    @Test
    public void mostrarCarta(){
        Carta expected = mazo.getCartas().peek();
        assertEquals(expected,this.mazo.mostrarCarta());
        assertTrue(this.mazo.getCartas().contains(expected));
    }

    @Test
    public void sacarCartaTest(){
        Carta expected = mazo.getCartas().peek();
        assertEquals(expected,this.mazo.sacarCarta());
        assertFalse(this.mazo.getCartas().contains(expected));
    }

    /**
     * Test para comprobar que se pueden agregar duplicados
     */
    @Test
    public void agregarDuplicado(){
        int expected = 52;
        this.mazo.getCartas().add(new Carta(TipoCarta.DIAMANTE, RangoCarta.ACE));
        assertNotEquals(expected,this.mazo.getCartas().size());
    }

}