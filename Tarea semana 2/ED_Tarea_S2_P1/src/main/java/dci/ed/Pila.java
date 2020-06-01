package dci.ed;

public class Pila {
    // agregar los elementos que permiten implementar una Pila
    Nodo top = null;
    /*
     *  Método que permite agregar un elemento desde el frente de la pila
     */
    public void push(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        if(this.top == null){
            top = nuevoNodo;
        }else {
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
    }

    /*
     *  Método que permite eliminar un elemento desde el frente de la pila
     */
    public void pop(){
        if (this.top==null){
            throw new NullPointerException();
        }else{
            top = top.siguiente;
        }
    }
}
