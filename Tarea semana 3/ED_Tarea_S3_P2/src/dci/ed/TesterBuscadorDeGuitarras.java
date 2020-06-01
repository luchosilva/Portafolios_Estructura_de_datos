package dci.ed;

public class TesterBuscadorDeGuitarras {
    public static void main(String[] args) {

        Inventario inventarioGuitarStar = new Inventario();
        inicializarInventarioDeGuitarras(inventarioGuitarStar);

        Guitarra guitarraClaudia = new Guitarra("", 0, "fender",
                "stratocastor", "electric", "Alder", "Alfer");

        Guitarra guitarra = inventarioGuitarStar.buscar(guitarraClaudia);

        if(guitarra != null){
            System.out.println("Claudia, te podría gustar esta " + guitarra.getFabricante() +
                    " " + guitarra.getModelo() + " " + guitarra.getTipo() + "\nguitarra:\n  " +
                    guitarra.getMaderaPosterior() + " madera posterior,\n  " +
                    guitarra.getMaderaFrontal() + " madera frontal.\n Puedes tenerla por solo: $" +
                    guitarra.getPrecio() + "!");
        }else {
            System.out.println("Lo siento Claudia, no tenemos nada para ti.");
        }
    }

    private static void inicializarInventarioDeGuitarras(Inventario inventarioGuitarStar){
        Guitarra guitarra1 = new Guitarra("nkasna", 1750.9, "Fender", "Sasasor", "acústica", "Alder", "Pino");
        Guitarra guitarra2 = new Guitarra("V5693", 1550.9, "Fender", "Stratocastor", "eléctrica", "Alder", "Alder");

        inventarioGuitarStar.agregarGuitarra(guitarra1);
        inventarioGuitarStar.agregarGuitarra(guitarra2);
    }

}