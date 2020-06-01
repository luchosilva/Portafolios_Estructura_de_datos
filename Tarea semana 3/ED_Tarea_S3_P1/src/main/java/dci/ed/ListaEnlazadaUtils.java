package dci.ed;


import java.util.Collections;
import java.util.*;
public class ListaEnlazadaUtils {

    public static void insertarOrdenado(LinkedList<Integer> lista, int valor) {
        if(lista.getFirst()==null){
            throw new NullPointerException();
        }else {
            for (int i = 1; i < lista.size(); i++) {
                if (lista.get(i - 1).intValue() <= valor && valor < lista.get(i).intValue()) { //si el valor esta en medio
                    lista.add(i, valor);
                    break;
                } else if (lista.getLast().intValue() < valor) { //si el valor es mayor a todos
                    lista.addLast(valor);
                    break;
                } else if (lista.getFirst().intValue() > valor){ //si el valor es menor que todos
                    lista.addFirst(valor);
                    break;
                }
            }
        }
    }

    public static void removerValoresMaximos(LinkedList<String> list, int N) {
        if(list==null || N<0 || list.getFirst()==null){ //si la lista es nula, esta vacía o el N es menor que 0
            System.out.print("Todas las instancias se han removido");
        }else if(N>list.size()){ //si el N es mayor que el tamaño de la lista
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < N; i++) { //lo hace N veces
                String max = list.getFirst();
                for (String tmp : list) {
                    if (tmp.compareTo(max) > 0) {
                        max = tmp; //encuentrá el mayor
                    }
                }
                list.remove(max); //remueve el mayor
            }
        }
    }

    public static boolean contieneSubsecuencia(LinkedList<Integer> one, LinkedList<Integer> two) {
        if(one==null || two==null){ //si alguna de las listas está vacía
            return false;
        }else if(one.size()==two.size()){ //si el tamaño de las listas es el mismo
            return one.equals(two); //verificar si son iguales
        }else if(one.size()<two.size()){ //si el tamaño de la lista 2 es mayor que la lista 1 no lo puede contener
            return false;
        }else if (Collections.indexOfSubList(one,two)!=-1) { //verifica si la lista 1 contiene a la lista 2
            return true;
        }else{ //si no, no
            return false;
        }
    }

}
