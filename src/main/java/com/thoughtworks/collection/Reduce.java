package com.thoughtworks.collection;

import com.thoughtworks.collection.single_link.SingleLink;
import com.thoughtworks.collection.single_link.SingleLinkedList;

import java.util.Collections;
import java.util.List;

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
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean isEqual(List<Integer> arrayList) {
        boolean isEqual = true;
        if (this.arrayList.size() != arrayList.size()) {
            isEqual = false;
        } else {
            for (int i = 0; i < this.arrayList.size(); i++) {
                if (!this.arrayList.get(i).equals(arrayList.get(i))) {
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        for (Integer number : arrayList) {
            singleLink.addTailPointer(number);
            singleLinkedList.addTailPointer(number);
        }
        double latIndex = singleLinkedList.size() - 1;
        int leftMedian = singleLinkedList.getNode((int) Math.floor(latIndex / 2));
        int rightMedian = singleLinkedList.getNode((int) Math.ceil(latIndex / 2));
        double median = (leftMedian + rightMedian) / 2.0;
        return median;
    }

    public int getLastOdd() {
        int lastOdd = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i) % 2 != 0) {
                lastOdd = arrayList.get(i);
                break;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        int index = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i) % 2 != 0) {
                index = i;
                break;
            }
        }
        return index;
    }
}
