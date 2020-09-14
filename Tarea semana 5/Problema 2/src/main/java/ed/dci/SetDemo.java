package ed.dci;

import java.util.LinkedList;

public class SetDemo {

    public LinkedList<Integer> [] buckets;

    private int tamanoActual = 0;

    private final double factorIndicador;

    public SetDemo(int tamano, double factorIndicador){
        buckets = new LinkedList [tamano];
        for(int i=0;i<tamano;i++){
            buckets[i] = new LinkedList<Integer>();
        }
        this.factorIndicador = factorIndicador;
    }

    private int hashCode(int valor){
        return valor;
    }

    public boolean add(int valor){
        if (!contiene(valor)){
            int i = hashCode(valor) % buckets.length;
            buckets[i].addFirst(valor);
            tamanoActual++;
            double promedio = tamanoActual / (double) buckets.length;
            if (promedio > factorIndicador){
                reinsertarTodo();
            }
            return true;
        }else {
            return false;
        }
    }

    public boolean contiene(int valor){
        int index = hashCode(valor) % buckets.length;
        LinkedList <Integer> bucket = buckets[index];
        return bucket.contains(valor);
    }

    private void reinsertarTodo(){
        LinkedList <Integer>[] bucketsIniciales = buckets;
        buckets = new LinkedList [bucketsIniciales.length * 2];
        for(int i = 0 ; i < buckets.length ; i++){
            buckets[i] = new LinkedList<Integer>();
        }
        for (LinkedList<Integer> linkedList : bucketsIniciales) {
            for ( int element : linkedList ) {
                int i = hashCode(element) % buckets.length;
                buckets[i].addFirst(element);
            }
        }
    }

}