package cn.yucdong.javapearls.collections;

import java.util.HashMap;
import java.util.Map;

public class FunctionalMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 1);
        map.put("World", 2);

        Integer result = map.compute("Hello", (key, value) -> value == 1 ? 1 : 2);
        System.out.println(result);
    }
}
