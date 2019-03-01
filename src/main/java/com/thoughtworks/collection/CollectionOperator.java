package com.thoughtworks.collection;

import com.sun.deploy.util.ArrayUtil;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<Integer>();
        int max = Math.max(left, right);
        int min = Math.min(left, right);
        for (int i = min; i <= max; i++) {
            resultList.add(i);
        }
        if (left > right) {
            Collections.reverse(resultList);
        }
        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<Integer>();
        int max = Math.max(left, right);
        int min = Math.min(left, right);
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                resultList.add(i);
            }
        }
        if (left > right) {
            Collections.reverse(resultList);
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int number : array) {
            if (number % 2 == 0) {
                resultList.add(number);
            }
        }
        return resultList;
    }

    public int popLastElment(int[] array) {
        int lastInedex = array.length - 1;
        return array[lastInedex];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int number : firstArray) {
            for (int i = 0; i < secondArray.length; i++) {
                if (secondArray[i] == number) {
                    resultList.add(number);
                    break;
                }
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultList = new ArrayList<Integer>();
        Collections.addAll(resultList, firstArray);
        List<Integer> firstList = Arrays.asList(firstArray);
        for (Integer number : secondArray) {
            if (!firstList.contains(number)) {
                resultList.add(number);
            }
        }
        return resultList;
    }
}
