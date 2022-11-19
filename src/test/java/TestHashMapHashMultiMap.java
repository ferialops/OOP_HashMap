import kunakhova_a_y.vsu.ru.HashMapMethod;
import kunakhova_a_y.vsu.ru.HashMultiMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

class TestHashMapHashMultiMap {
    private final HashMapMethod<String, Integer> testMap = new HashMapMethod<>();

    private final HashMultiMap<String, Integer> testMultiMap = new HashMultiMap<>();

    @Test
    void isEmptyAfterInitialize() {
        assertTrue(testMap.isEmpty());
    }

    @Test
    void putNormalValue() {
        testMap.clear();
        testMap.put("1", 12);
        assertEquals(12, testMap.get("1"));
    }

    @Test
    void tryPutExistingKey() {
        testMap.put("1", 12);
        testMap.put("1", 14);
        assertTrue(testMap.containsValue(14));
    }

    @Test
    void putNotNormalValue() {
        testMap.clear();
        testMap.put("1", 1239140294);
        assertEquals(1239140294, testMap.get("1"));
    }

    @Test
    void clear() {
        testMap.clear();
        assertTrue(testMap.isEmpty());
    }

    @Test
    void sizeAfterClear() {
        testMap.size();
        assertEquals(0, testMap.size());
    }
    @Test
    void isEmptyAfterInitialize2() {
        assertTrue(testMultiMap.isEmpty());
    }

    @Test
    void putNormalValue2() {
        testMultiMap.clear();
        testMultiMap.put("1", 12);
        assertTrue(testMultiMap.get("1").containsValue(12));
    }

    @Test
    void tryPutExistingKey2() {
        int size = testMultiMap.size();
        testMultiMap.put("1", 12);
        testMultiMap.put("1", 14);
        int newSize = testMultiMap.size();
        Assertions.assertEquals(2, newSize - size);
    }

    @Test
    void putNotNormalValue2() {
        testMultiMap.clear();
        testMultiMap.put("1", 1239140294);
        assertTrue(testMultiMap.get("1").containsValue(1239140294));
    }

    @Test
    void clear2() {
        testMultiMap.clear();
        assertTrue(testMultiMap.isEmpty());
    }

    @Test
    void sizeAfterClear2() {
        testMultiMap.size();
        Assertions.assertEquals(0, testMultiMap.size());
    }
}