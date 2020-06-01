package model;

public class Domestico extends Animal{

    public Domestico(String sonido) {
        super(sonido);
        tipoComida = "crac-crac";
    }

    @Override
    protected void comer() {
        System.out.println("Comiendo "+tipoComida);
    }

    @Override
    protected void hacerSonido() {
        System.out.println(sonido);
    }
}
