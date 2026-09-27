package com.rabtech.step3.collection;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public final class CollectionOperations {

    private CollectionOperations() {}

    public static List<String> sortNames(List<String> names) {
        return names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
    }

    public static List<String> filterLongNames(List<String> names, int minimumLength) {
        return names.stream()
                .filter(name -> name.length() >= minimumLength)
                .toList();
    }

    public static Set<String> uniqueSortedNames(List<String> names) {
        return names.stream()
                .map(String::trim)
                .filter(name -> !name.isBlank())
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
