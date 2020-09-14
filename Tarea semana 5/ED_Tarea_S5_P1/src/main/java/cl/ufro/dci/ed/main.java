package cl.ufro.dci.ed;

import cl.ufro.dci.ed.model.*;

public class main {
    public static void main(String[] args) {
        /*
        MazoQueue mazo = new MazoQueue();
        int numeroCartas = mazo.getCartas().size();
        for (int i = 0; i < numeroCartas; i++) {
            System.out.println(mazo.sacarCarta());
        }
         */
        MazoSet mazo = new MazoSet();
        int numeroCartas = mazo.getCartas().size();
        for (int i = 0; i < numeroCartas; i++) {
            System.out.println(mazo.sacarCarta());
        }

        /*
        MazoList mazo = new MazoList();
        mazo.getCartas().add(new Carta(TipoCarta.DIAMANTE,RangoCarta.ACE));
        int numeroCartas = mazo.getCartas().size();
        mazo.barajar();
        for (int i = 0; i < numeroCartas; i++) {
            System.out.println(mazo.sacarCarta());
        }
         */
    }
}
