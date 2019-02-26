package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
