package model;

import cl.ufro.dci.ed.model.Carta;
import cl.ufro.dci.ed.model.MazoList;

import cl.ufro.dci.ed.model.RangoCarta;
import cl.ufro.dci.ed.model.TipoCarta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMazoList {
    private MazoList mazo;

    @Before
    public void prepare () {
        this.mazo = new MazoList();
    }

    @Test
    public void mostrarCarta(){
        Carta expected = mazo.getCartas().get(0);
        assertEquals(expected,this.mazo.mostrarCarta());
        assertTrue(this.mazo.getCartas().contains(expected));
    }

    @Test
    public void sacarCartaTest(){
        Carta expected = mazo.getCartas().get(0);
        assertEquals(expected,this.mazo.sacarCarta());
        assertFalse(this.mazo.getCartas().contains(expected));
    }

    /**
     * Test para comprobar se pueden agregar duplicados
     */
    @Test
    public void agregarDuplicado(){
        int expected = 52;
        this.mazo.getCartas().add(new Carta(TipoCarta.DIAMANTE, RangoCarta.ACE));
        assertNotEquals(expected,this.mazo.getCartas().size());
    }

}