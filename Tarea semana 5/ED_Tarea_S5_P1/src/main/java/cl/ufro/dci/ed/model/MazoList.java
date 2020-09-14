package cl.ufro.dci.ed.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MazoList {
    private List <Carta> cartas;

    public MazoList() {
        this.cartas = new LinkedList<>();
        TipoCarta[] tipos = TipoCarta.values();
        RangoCarta[] rangos = RangoCarta.values();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cartas.add(new Carta(tipos[i],rangos[j]));
            }
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public Carta mostrarCarta(){
        return this.cartas.get(0);
    }

    public Carta sacarCarta(){
        return this.cartas.remove(0);
    }

    public void barajar(){
        Collections.shuffle(this.cartas);
    }

}