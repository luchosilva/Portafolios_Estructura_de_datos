package model;

public abstract class Animal {
    protected String sonido;
    protected static String tipoComida;

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    abstract void comer();
    abstract void hacerSonido();
}
