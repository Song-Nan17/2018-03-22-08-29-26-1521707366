package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int smallBorder = Math.min(leftBorder, rightBorder);
        int bigBorder = Math.max(leftBorder, rightBorder);
        int sum = 0;
        for (int i = smallBorder; i <= bigBorder; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int smallBorder = Math.min(leftBorder, rightBorder);
        int bigBorder = Math.max(leftBorder, rightBorder);
        int sum = 0;
        for (int i = smallBorder; i <= bigBorder; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer number : arrayList) {
            sum += number * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer number : arrayList) {
            Integer result = number % 2 == 0 ? number : number * 3 + 2;
            resultList.add(result);
        }
        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (Integer number : arrayList) {
            sum += number % 2 == 0 ? 0 : number * 3 + 5;
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenIndexList = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                evenIndexList.add(arrayList.get(i));
            }
        }
        Reduce reduce = new Reduce(evenIndexList);
        double median = reduce.getOrderedMedian();
        return median;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int sum = 0;
        int numberOfEvenIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                sum += arrayList.get(i);
                numberOfEvenIndex++;
            }
        }
        return sum / numberOfEvenIndex;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean isIncluded = false;
        if (specialElment % 2 == 0 && arrayList.contains(specialElment)) {
            isIncluded = true;
        }
        return isIncluded;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer number : arrayList) {
            if (number % 2 == 0 && !resultList.contains(number)) {
                resultList.add(number);
            }
        }
        return resultList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();
        for (Integer number : arrayList) {
            if (number % 2 == 0) {
                evenList.add(number);
            } else {
                oddList.add(number);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList);
        Collections.reverse(oddList);
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 1; i < arrayList.size(); i++) {
            Integer result = (arrayList.get(i - 1) + arrayList.get(i)) * 3;
            resultList.add(result);
        }
        return resultList;
    }
}
