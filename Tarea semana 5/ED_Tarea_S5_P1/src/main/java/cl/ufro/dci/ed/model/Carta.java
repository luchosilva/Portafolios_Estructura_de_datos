package cl.ufro.dci.ed.model;

import java.util.Objects;

public class Carta {
    private final TipoCarta tipoCarta;
    private final RangoCarta rangoCarta;

    public Carta(TipoCarta tipoCarta, RangoCarta rangoCarta) {
        this.tipoCarta = tipoCarta;
        this.rangoCarta = rangoCarta;
    }

    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    public RangoCarta getRangoCarta() {
        return rangoCarta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carta)) return false;
        Carta carta = (Carta) o;
        return getTipoCarta() == carta.getTipoCarta() &&
                getRangoCarta() == carta.getRangoCarta();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipoCarta(), getRangoCarta());
    }

    @Override
    public String toString() {
        return "Carta{" +
                "tipoCarta=" + tipoCarta + " " + tipoCarta.getTipo() +
                ", rangoCarta=" + rangoCarta +
                '}';
    }
}
