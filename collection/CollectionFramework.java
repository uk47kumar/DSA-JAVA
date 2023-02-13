package com.collection;

import java.util.*;

public class CollectionFramework {
    static Scanner sc = new Scanner(System.in);

    public static void arrayList() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 3, 1, 2, 7, 5, 6);
        System.out.print("Elements: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        list.add(0, 1);
        System.out.print("\nAfter adding element on index number 0 : ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        list.remove(0);
        System.out.print("\nAfter deleting element on index number 0 : ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        list.size();
        System.out.println("\nElements contains using size() method: " + list);
    }

    public static void heterogeneousList() {
        LinkedList list = new LinkedList();
        Collections.addAll(list, 5, 3, "ujjwal", 6);
        System.out.print("Elements: ");
        for (Object i : list) {
            System.out.print(i + " ");
        }
        list.add(0, 1);
        System.out.print("\nAfter adding element on index number 0 : ");
        for (Object i : list) {
            System.out.print(i + " ");
        }
        list.remove(0);
        System.out.print("\nAfter deleting element on index number 0 : ");
        for (Object i : list) {
            System.out.print(i + " ");
        }
        list.size();
        System.out.println("\nElements contains using size() method: " + list);
    }

    public static void homogeneousList() {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, 5, 3, 6, 7, 1);
        System.out.print("Elements: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        list.add(0, 1);
        System.out.print("\nAfter adding element on index number 0 : ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        list.remove(0);
        System.out.print("\nAfter deleting element on index number 0 : ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        list.size();
        System.out.print("\nElements contains using size() method: " + list);
        list.addLast(10);
        System.out.print("\nAfter using addLast() method  : ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void stack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        System.out.println(stack.size());
        for (int i : stack) {
            System.out.print(i + " ");
        }
        stack.remove(2);
        System.out.println();
        for (int i : stack) {
            System.out.print(i + " ");
        }
        stack.pop();
        System.out.println();
        for (int i : stack) {
            System.out.print(i + " ");
        }
        stack.pop();
        System.out.println();
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(stack.peek());
    }

    public static void main(String[] args) {

//        System.out.println("Enter 1 to use ArrayList\nEnter 2 to use LinkList\n");
        System.out.println("using ArrayList");
        arrayList();
        System.out.println("\nusing heterogeneousList");
        heterogeneousList();
        System.out.println("\nusing homogeneousList");
        homogeneousList();
        System.out.println();
        stack();
    }
}
