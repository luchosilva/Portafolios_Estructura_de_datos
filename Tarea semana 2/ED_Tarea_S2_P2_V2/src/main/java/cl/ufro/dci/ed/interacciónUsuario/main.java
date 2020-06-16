package cl.ufro.dci.ed.interacciónUsuario;

import cl.ufro.dci.ed.modelo.Gato;
import cl.ufro.dci.ed.modelo.Perro;

public class main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        perro.comer();
        perro.hacerSonido();
        gato.hacerSonido();
        gato.comer();
    }
}
