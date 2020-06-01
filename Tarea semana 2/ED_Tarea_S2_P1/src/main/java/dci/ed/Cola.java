package dci.ed;

public class Cola {
    // agregar los elementos que permiten implementar una Cola
    Nodo front = null;
    Nodo rear = null;
    /*
     *  Método que permite agregar al final de la rear
     */
    public void agregarEnCola(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        if(this.front == null){ // Lista vacía
            front = nuevoNodo;
            rear = nuevoNodo;
        }else {
            rear.siguiente = nuevoNodo;
            rear = nuevoNodo;
        }
    }

    /*
     *  Método que permite remover desde el frente de la rear
     */
    public void removerDesdeFrente(){
        if ( this.front == null ) { // Lista vacía
            throw new NullPointerException();
        } else {
            if (this.front.siguiente == null) { // sólo un elemento en la lista
                front = null;
                rear = null;
            }else{
                front = front.siguiente;
            }
        }
    }

}
