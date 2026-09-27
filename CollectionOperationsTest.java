package com.rabtech.step3;

import com.rabtech.step3.collection.CollectionOperations;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionOperationsTest {

    @Test
    void sortsNamesWithStreams() {
        var result = CollectionOperations.sortNames(List.of("Zara", "anu", "Bala"));
        assertEquals(List.of("anu", "Bala", "Zara"), result);
    }

    @Test
    void filtersNamesWithLambda() {
        var result = CollectionOperations.filterLongNames(
                List.of("Ram", "Haritha", "Sita"), 5);
        assertEquals(List.of("Haritha"), result);
    }

    @Test
    void removesDuplicatesAndSortsUsingSet() {
        var result = CollectionOperations.uniqueSortedNames(
                List.of("Bala", "Anu", "Bala", "Charan"));
        assertEquals(List.of("Anu", "Bala", "Charan"), result.stream().toList());
    }
}
