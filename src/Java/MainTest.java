package Java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    public void testEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        Map<Integer, Integer> emptyCounts = Main.countElements(emptyList);
        assert emptyCounts.isEmpty();
    }

    @Test
    public void testListWithRepeatingElements() {
        List<Integer> duplicateList = new ArrayList<>();
        duplicateList.add(1);
        duplicateList.add(1);
        duplicateList.add(2);
        duplicateList.add(2);
        duplicateList.add(2);
        Map<Integer, Integer> duplicateCounts = Main.countElements(duplicateList);
        assert duplicateCounts.size() == 2;
        assert duplicateCounts.get(1) == 2;
        assert duplicateCounts.get(2) == 3;
    }

    @Test
    public void testListWithElementsThatNotRepeated() {
        List<Integer> uniqueList = new ArrayList<>();
        uniqueList.add(1);
        uniqueList.add(2);
        uniqueList.add(3);
        uniqueList.add(4);
        Map<Integer, Integer> uniqueCounts = Main.countElements(uniqueList);
        assert uniqueCounts.size() == 4;
        assert uniqueCounts.get(1) == 1;
        assert uniqueCounts.get(2) == 1;
        assert uniqueCounts.get(3) == 1;
        assert uniqueCounts.get(4) == 1;
    }

    @Test
    public void testListWithNegativeElements() {
        List<Integer> negativeList = new ArrayList<>();
        negativeList.add(-1);
        negativeList.add(-2);
        negativeList.add(-3);
        negativeList.add(-3);
        Map<Integer, Integer> negativeCounts = Main.countElements(negativeList);
        assert negativeCounts.size() == 3;
        assert negativeCounts.get(-1) == 1;
        assert negativeCounts.get(-2) == 1;
        assert negativeCounts.get(-3) == 2;
    }
}
