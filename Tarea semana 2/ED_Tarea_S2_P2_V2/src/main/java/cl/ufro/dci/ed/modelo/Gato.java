package cl.ufro.dci.ed.modelo;

public class Gato implements Animal{

    private String sonido;

    public Gato() {
        this.sonido = "Miau";
    }

    public void comer() {
        System.out.println("come "+tipoComida);
    }

    public void hacerSonido() {
        System.out.println(sonido);
    }
}
