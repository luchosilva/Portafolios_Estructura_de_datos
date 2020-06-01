package model;

public class Main {
    public static void main(String[] args) {
        Animal gato1 = new Gato();
        Domestico gato2 = new Gato();
        Gato gato3 = new Gato();

        Animal perro1 = new Perro();
        Domestico perro2 = new Perro();
        Perro perro3 = new Perro();

        gato1.comer();
        gato1.hacerSonido();
        gato2.hacerSonido();
        gato3.comer();

        perro1.hacerSonido();
        perro2.hacerSonido();
        perro3.comer();
    }
}