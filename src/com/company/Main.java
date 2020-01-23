 package com.company;

import java.util.ArrayList;

public class Main {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList1.add(3);
        arrayList1.add(2);
        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(7);

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);

    }

    public ArrayList<Integer> joinArrayList(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> joinArrayList = new ArrayList<>();
        joinArrayList.addAll(arrayList1);
        joinArrayList.addAll(arrayList2);

        return joinArrayList;
    }
}
