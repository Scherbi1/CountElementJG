package Grovvy.Main

import Grovvy.Main
import org.junit.jupiter.api.Test

class GroovyTest {
    @Test
     def testCountElementsWithEmptyList() {
        def list = []
        def expectedCountMap = [:]

        assert countElements(list) == expectedCountMap
    }

    @Test
    def testCountElementsWithSingleElement() {
        def list = [1]
        def expectedCountMap = [1: 1]

        assert Main.countElements(list) == expectedCountMap
    }
    @Test
    def testCountElementsWithRepeatedElement() {
        def list = [1, 1, 1, 1]
        def expectedCountMap = [1: 4]

        assert countElements(list) == expectedCountMap
    }
    @Test
    def testCountElementsWithDistinctElements() {
        //countElements = new Main().countElements();
        def list = [1, 2, 3, 4, 5]
        def expectedCountMap = [1: 1, 2: 1, 3: 1, 4: 1, 5: 1]

        assert  new Main().countElements(list) == expectedCountMap
    }
}
