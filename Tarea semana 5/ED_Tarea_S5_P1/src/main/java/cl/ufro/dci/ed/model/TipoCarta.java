package cl.ufro.dci.ed.model;

public enum TipoCarta {
    CORAZON('♥'),PICA('♠'),DIAMANTE('♦'),TREBOL('♣');

    private final char tipo;

    TipoCarta(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }
}
