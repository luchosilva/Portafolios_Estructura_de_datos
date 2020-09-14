package ed.dci;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        SetDemo setDemo = new SetDemo(10,0.7);
        setDemo.add(7);
        setDemo.add(10);
        setDemo.add(11);
        setDemo.add(1);
        setDemo.add(8);
        setDemo.add(9);
        setDemo.add(19);
        setDemo.add(6);
        setDemo.add(17);
        setDemo.add(14);
        setDemo.add(12);
        setDemo.add(4);
        setDemo.add(5);
        setDemo.add(2);
        setDemo.add(13);
        for (LinkedList<Integer> linkedList : setDemo.buckets) {
            for ( int element : linkedList ) {
                System.out.println(element);
            }
        }
    }
}
