package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(num -> num * 3 + 5)
                .sum();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (Integer num: arrayList) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        evenList = evenList.stream()
                .sorted()
                .collect(Collectors.toList());
        oddList = oddList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return Stream.concat(evenList.stream(), oddList.stream())
                .collect(Collectors.toList());

    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        return arrayList.stream()
                .filter(num -> num % 2 == 0)
                .anyMatch(num -> num.equals(specialElement));
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream()
                .map(num -> (num % 2 == 0)? num: (num * 3 + 2))
                .collect(Collectors.toList());
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream()
                .mapToInt(num -> num * 3 + 2)
                .sum();
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int start;
        int end;

        if (leftBorder < rightBorder) {
            start = leftBorder;
            end = rightBorder;
        } else {
            start = rightBorder;
            end = leftBorder;
        }

        return IntStream.rangeClosed(start, end)
                .filter(num -> num % 2 == 0)
                .sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int start;
        int end;

        if (leftBorder < rightBorder) {
            start = leftBorder;
            end = rightBorder;
        } else {
            start = rightBorder;
            end = leftBorder;
        }

        return IntStream.rangeClosed(start, end)
                .filter(num -> num % 2 != 0)
                .sum();
    }

}
