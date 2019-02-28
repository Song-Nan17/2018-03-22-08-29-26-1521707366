package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        double sum = arrayList.stream().mapToInt(Integer::intValue).sum();
        return sum / arrayList.size();
    }

    public double getOrderedMedian() {
        Collections.sort(arrayList);
        double latIndex = arrayList.size() - 1;
        int leftMedian = arrayList.get((int) Math.floor(latIndex / 2));
        int rightMedian = arrayList.get((int) Math.ceil(latIndex / 2));
        double median = (leftMedian + rightMedian) / 2.0;
        return median;
    }

    public int getFirstEven() {
        int firstEven = 0;
        for (Integer number : arrayList) {
            if (number % 2 == 0) {
                firstEven = number;
                break;
            }
        }
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            singleLink.addTailPointer(iterator.next());
        }
        double latIndex = singleLink.size() - 1;
        int leftMedian = (int) singleLink.getNode((int) Math.floor(latIndex / 2));
        int rightMedian = (int) singleLink.getNode((int) Math.ceil(latIndex / 2));
        double median = (leftMedian + rightMedian) / 2.0;
        return median;
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
