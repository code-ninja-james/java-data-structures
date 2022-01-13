package com.jameson;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<WorkingWithQueues.Person> linkedList=new LinkedList<>();
        linkedList.add(new WorkingWithQueues.Person("Alex",21));
        linkedList.add(new WorkingWithQueues.Person("Alexa",45));
        linkedList.addFirst(new WorkingWithQueues.Person("Ali",45));
        ListIterator<WorkingWithQueues.Person> personListIterator= linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
}
