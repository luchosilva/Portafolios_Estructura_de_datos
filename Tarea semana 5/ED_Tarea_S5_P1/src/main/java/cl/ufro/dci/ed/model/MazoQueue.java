package cl.ufro.dci.ed.model;

import java.util.*;

public class MazoQueue {
    private final Queue<Carta> cartas;

    public MazoQueue() {
        this.cartas = new LinkedList<Carta>();
        TipoCarta[] tipos = TipoCarta.values();
        RangoCarta[] rangos = RangoCarta.values();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cartas.add(new Carta(tipos[i],rangos[j]));
            }
        }
    }

    public Queue<Carta> getCartas() {
        return cartas;
    }

    public Carta mostrarCarta(){
        return this.cartas.peek();
    }

    public Carta sacarCarta(){
        return this.cartas.poll();
    }

    public void barajar(){
        Collections.shuffle((List<Carta>) cartas);
    }
}