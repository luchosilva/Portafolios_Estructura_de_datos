package cl.ufro.dci.ed.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MazoSet {
    private Set <Carta> cartas;

    public MazoSet() {
        this.cartas = new HashSet<>();
        TipoCarta[] tipos = TipoCarta.values();
        RangoCarta[] rangos = RangoCarta.values();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cartas.add(new Carta(tipos[i],rangos[j]));
            }
        }
    }

    public Set<Carta> getCartas() {
        return cartas;
    }

    public Carta mostrarCarta(){
        Iterator <Carta> it = this.cartas.iterator();
        return it.next();
    }

    public Carta sacarCarta(){
        Carta primeraCarta = mostrarCarta();
        this.cartas.remove(primeraCarta);
        return primeraCarta;
    }

    public void barajar(){
        //No es necesario ya que se baraja automáticamente el mazo gracias al hashcode.
        //Pero cómo el hashcode es un método de ordenamiento interno, siempre se ordenara de la misma manera.
    }

}
