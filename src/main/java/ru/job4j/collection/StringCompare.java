package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int res = 0;
        if (left.length() != right.length()) {
            res = Integer.compare(left.length(), right.length());
        }
        int size = Math.min(left.length(), right.length());
            for (int i = 0; i < size; i++) {
                res = Character.compare(left.charAt(i), right.charAt(i));
                if (res != 0) {
                    break;
                } else {
                    res = Integer.compare(left.length(), right.length());
                }
            }
        return res;
        }
    }

