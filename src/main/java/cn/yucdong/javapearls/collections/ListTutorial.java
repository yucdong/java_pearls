package cn.yucdong.javapearls.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTutorial {

    static class Modifiable {
        int val;

        Modifiable(int v) {
            val = v;
        }

        void SetValue(int v) {
            val = v;
        }

        @Override
        public String toString() {
            return "Value is " + val;
        }
    }

    public static void DemoAddAll() {

        Modifiable m = new Modifiable(3);
        List<Modifiable> l1 = new ArrayList<Modifiable>();
        l1.add(m);

        List<Modifiable> l2 = new ArrayList<Modifiable>();
        l2.addAll(l1);
        l2.get(0).SetValue(2);

        // Elements in l1 should be changed.
        // Because addAll will add references, not by copy
        System.out.println(l1.get(0));
    }

    public static void main(String[] args) {
        DemoAddAll();
    }
}
