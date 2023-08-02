package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(4);

        Map<Integer, Integer> counts = countElements(list);

        for (int key : counts.keySet()) {
            System.out.println(key + " : " + counts.get(key));
        }
    }

    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : list) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return counts;
    }
}
