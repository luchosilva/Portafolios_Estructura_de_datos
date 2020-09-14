package model;

import cl.ufro.dci.ed.model.Carta;
import cl.ufro.dci.ed.model.MazoSet;

import cl.ufro.dci.ed.model.RangoCarta;
import cl.ufro.dci.ed.model.TipoCarta;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class TestMazoSet {
    private MazoSet mazo;

    @Before
    public void prepare () {
        this.mazo = new MazoSet();
    }

    @Test
    public void mostrarCarta(){
        Iterator<Carta> it = this.mazo.getCartas().iterator();
        Carta expected = it.next();
        assertEquals(expected,this.mazo.mostrarCarta());
        assertTrue(this.mazo.getCartas().contains(expected));
    }

    @Test
    public void sacarCartaTest(){
        Iterator<Carta> it = this.mazo.getCartas().iterator();
        Carta expected = it.next();
        assertEquals(expected,this.mazo.sacarCarta());
        assertFalse(this.mazo.getCartas().contains(expected));
    }

    /**
     * Test para comprobar que no se pueden agregar duplicados
     */
    @Test
    public void agregarDuplicado(){
        int expected = 52;
        this.mazo.getCartas().add(new Carta(TipoCarta.DIAMANTE, RangoCarta.ACE));
        assertEquals(expected,this.mazo.getCartas().size());
    }

}
