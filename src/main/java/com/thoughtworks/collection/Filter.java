package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer number : array) {
            if (number % 2 == 0) {
                resultList.add(number);
            }
        }
        return resultList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer number : array) {
            if (number % 3 == 0) {
                resultList.add(number);
            }
        }
        return resultList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer number : firstList) {
            if (secondList.contains(number)) {
                resultList.add(number);
            }
        }
        return resultList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer number : array) {
            if (!resultList.contains(number)) {
                resultList.add(number);
            }
        }
        return resultList;
    }
}