package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer number : array) {
            resultList.add(number * 3);
        }
        return resultList;
    }

    public List<String> mapLetter() {
        List<String> resultList = new ArrayList<String>();
        for (Integer number : array) {
            resultList.add(letterList.get(number - 1));
        }
        return resultList;
    }

    public List<String> mapLetters() {
        List<String> resultList = new ArrayList<String>();
        int length = letterList.size();
        String letter;
        for (Integer number : array) {
            letter = number > length ? letterList.get((number - 1) / length - 1) + letterList.get((number - 1) % length) : letterList.get(number - 1);
            resultList.add(letter);
        }
        return resultList;
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
