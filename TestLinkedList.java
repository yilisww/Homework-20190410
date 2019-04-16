package HW4_arrays_files;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList sen = new LinkedList();

        sen.add("This");
        sen.add("is");
        sen.add("a");
        sen.add("sentence");
        sen.add("generated");
        sen.add("on");
        sen.add("Linkedlist");
        sen.remove(5);
        sen.add(5,"by");
        sen.addFirst("1:");
        sen.addLast("!");
        System.out.println(sen);

        Object element = sen.get(2); // have to use the "Object" cmd
        System.out.println("This is the single word obtained from LinkedList sentence: "+element);



    }




}

