package dci.ed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventario {
    private List<Guitarra> listaGuitarras;

    public Inventario() {
        listaGuitarras = new LinkedList();
    }

    public void agregarGuitarra(Guitarra guitarra) {
        listaGuitarras.add(guitarra);
    }

    public Guitarra obtenerGuitarra(String numeroSerie) {
        Iterator<Guitarra> iterador = listaGuitarras.iterator();
        while (iterador.hasNext()) {
            Guitarra guitarra = iterador.next();
            if (guitarra.getNumeroSerie().equals(numeroSerie)) {
                return guitarra;
            }
        }
        return null;
    }

    public Guitarra buscar (Guitarra guitarraBuscada) {
        Guitarra posibleGuitarra;
        int[] coincidenciasDelInventario = new int[listaGuitarras.size()];
        for (int i = 0; i < listaGuitarras.size(); i++) {
            int coincidencias = 0;
            Guitarra guitarra = this.listaGuitarras.get(i);

            String numeroSerie = guitarraBuscada.getNumeroSerie();
            if ((numeroSerie != null) && (!numeroSerie.equals("")) && (numeroSerie.equalsIgnoreCase(guitarra.getNumeroSerie()))) {
                coincidencias++;
            }

            double precio = guitarraBuscada.getPrecio();
            if ((precio != 0) && (precio == guitarra.getPrecio())) {
                coincidencias++;
            }

            String fabricante = guitarraBuscada.getFabricante();
            if ((fabricante != null) && (!fabricante.equals("")) && (fabricante.equalsIgnoreCase(guitarra.getFabricante()))) {
                coincidencias++;
            }

            String modelo = guitarraBuscada.getModelo();
            if ((modelo != null) && (!modelo.equals("")) && (modelo.equalsIgnoreCase(guitarra.getModelo()))) {
                coincidencias++;
            }

            String tipo = guitarraBuscada.getTipo();
            if ((tipo != null) && (!tipo.equals("")) && (tipo.equalsIgnoreCase(guitarra.getTipo()))) {
                coincidencias++;
            }

            String maderaPosterior = guitarraBuscada.getMaderaPosterior();
            if ((maderaPosterior != null) && (!maderaPosterior.equals("")) && (maderaPosterior.equalsIgnoreCase(guitarra.getMaderaPosterior()))) {
                coincidencias++;
            }

            String maderaFrontal = guitarraBuscada.getMaderaFrontal();
            if ((maderaFrontal != null) && (!maderaFrontal.equals("")) && (maderaFrontal.equalsIgnoreCase(guitarra.getMaderaFrontal()))) {
                coincidencias++;
            }
            coincidenciasDelInventario[i] = coincidencias;
        }
        int iNumeroMayor, iPosicion;
        iNumeroMayor = coincidenciasDelInventario[0];
        iPosicion = 0;
        for(int x=0;x<coincidenciasDelInventario.length;x++){
            if (coincidenciasDelInventario[x]>iNumeroMayor){
                iNumeroMayor = coincidenciasDelInventario[x];
                iPosicion = x;
            }
        }
        if(iNumeroMayor==0){
            return null;
        }else {
            posibleGuitarra = this.listaGuitarras.get(iPosicion);
        }
        return posibleGuitarra;
    }

}
