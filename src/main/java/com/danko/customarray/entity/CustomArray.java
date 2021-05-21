package com.danko.customarray.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(this.array, this.array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getElementByIndex(int index) {
        return array[index];
    }

    public void setElementByIndex(int index, int value) {
        array[index] = value;
    }

    public int getLength() {
        return array.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }
}
