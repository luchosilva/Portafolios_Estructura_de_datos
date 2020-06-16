package cl.ufro.dci.ed.modelo;

public class Perro implements Animal{

    private String sonido;

    public Perro() {
        this.sonido = "Guau";
    }

    public void comer() {
        System.out.println("come "+tipoComida);
    }

    public void hacerSonido() {
        System.out.println(sonido);
    }
}
