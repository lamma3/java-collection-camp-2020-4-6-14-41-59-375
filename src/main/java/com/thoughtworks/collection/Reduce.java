package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.IntStream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream()
                .mapToDouble(num -> num)
                .average()
                .orElse(Double.NaN);
    }


    public int getIndexOfFirstEven() {
        return IntStream.range(0, arrayList.size())
                .filter(index -> arrayList.get(index) % 2 == 0)
                .findFirst()
                .orElse(-1);
    }


    public int getLastOdd() {
        return arrayList.stream()
                .filter(num -> num % 2 != 0)
                .reduce((num1, num2) -> num2)
                .orElse(-1);
    }



}
