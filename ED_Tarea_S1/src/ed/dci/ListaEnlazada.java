package ed.dci;

public class ListaEnlazada {
    // variables miembro de la clase Lista Enlazada
    Nodo cabeza = null;
    Nodo cola = null;

    /*
     *  Método que permite agregar un elemento
     *  al frente de la Lista Enlazada
     */
    public void agregarFrente(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        // Lista vacía
        if ( nuevoNodo.siguiente == null ) {
            cola = nuevoNodo;
        }
    }

    /*
     *  Método que permite agregar un elemento
     *  al final la Lista Enlazada
     */
    public void agregarFinal(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        // Lista vacía
        if ( cola == null ){
            cabeza = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
        }
        cola = nuevoNodo;
    }

    /*
     *  Método que permite agregar un elemento
     *  en un índice específico de la Lista Enlazada
     */
    public void agregarEnIndice(int index, int valor){
            if (index < 0) {
                throw new IndexOutOfBoundsException();
            } else if ( index == 0) { // agregar en la cabeza
                agregarFrente(valor);
            } else {
                    Nodo nuevoNodo = new Nodo(valor);
                    Nodo actual = cabeza;
                    for (int i = 0; i < index-1; i++) {
                        if (actual == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        actual = actual.siguiente;
                    }
                    if (actual.siguiente == null) { //añadir al final
                        agregarFinal(nuevoNodo.valor); //linea cambiada porque no dejaba agregar un último
                        // o también
                        //actual.siguiente = cola;
                        //cola = nuevoNodo;
                    } else {
                        nuevoNodo.siguiente = actual.siguiente;
                        actual.siguiente = nuevoNodo;
                    }
                }
    }

    /*
     *  Método que permite imprimir los elementos
     *  de la Lista Enlazada
     */
    public void imprimirLista(ListaEnlazada nombreLista){
        Nodo actual=nombreLista.cabeza;
        System.out.println("Listado de todos los elementos de la lista.");
        while (actual!=null) {
            System.out.print("["+actual.valor+"]"+",");
            actual=actual.siguiente;
        }
        System.out.println();
    }

    public void imprimirLista2(ListaEnlazada nombreLista){
        if(nombreLista.cabeza==null){
            System.out.print("[]");
        }else{
            Nodo actual = cabeza;
            String respuesta = "[";
            while(actual != null) {
                if(actual.siguiente != null) {
                    respuesta = respuesta + actual.valor + ",";
                }else{
                    respuesta = respuesta + actual.valor;
                }
                actual = actual.siguiente;
            }
            System.out.print(respuesta+"]");
        }
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarFrente(7);
        lista.agregarEnIndice(1,10);
        lista.agregarEnIndice(0,8);
        lista.agregarEnIndice(3,11);
        lista.agregarEnIndice(2,9);
        lista.agregarFrente(10);
        lista.agregarFinal(8);
        lista.agregarEnIndice(3,11);
        lista.agregarEnIndice(2,11);
        lista.agregarFinal(1);
        lista.imprimirLista(lista);
        lista.imprimirLista2(lista);
    }
}
