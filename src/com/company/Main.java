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

    public ArrayList<Integer> swapTwoElements(ArrayList<Integer> arrayList, int index1, int index2) {
        int element1 = arrayList.get(index1);
        int element2 = arrayList.get(index2);
        element1 = element1 * element2;
        element2 = element1 / element2;
        element1 = element1 / element2;

        arrayList.set(index1, element1);
        arrayList.set(index2, element2);

        return arrayList;
    }
}
