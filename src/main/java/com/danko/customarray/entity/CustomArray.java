package com.danko.customarray.entity;

import com.danko.customarray.exception.CustomArrayException;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {
        array = new int[0];
    }

    public CustomArray(int... array) throws CustomArrayException {
        if (array == null) {
            throw new CustomArrayException("The incoming array is NULL. The new CustomArray was not created.");
        }
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(this.array, this.array.length);
    }

    public void setArray(int[] array) throws CustomArrayException {
        if (array == null) {
            throw new CustomArrayException("The incoming array is NULL.");
        }
        this.array = array;
    }

    public int getElementByIndex(int index) throws CustomArrayException {
        if (index < 0 || index > array.length) {
            throw new CustomArrayException("INDEX = " + index + " is out of range.");
        }
        return array[index];
    }

    public void setElementByIndex(int index, int value) throws CustomArrayException {
        if (index < 0 || index > array.length) {
            throw new CustomArrayException("INDEX = " + index + " is out of range.");
        }
        array[index] = value;
    }

    public int getLength() {
        return array.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int element : array) {
            stringBuilder.append(element).append(" ");
        }
        return stringBuilder.toString();
        /*Other variant*/
//        return Arrays.toString(array);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        CustomArray inputObject = (CustomArray) obj;
        if (getLength() != inputObject.getLength()) {
            return false;
        }
        for (int i = 0; i < inputObject.getLength(); i++) {
            try {
                if (getElementByIndex(i) != inputObject.getElementByIndex(i)) {
                    return false;
                }
            } catch (CustomArrayException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return array.hashCode();
    }
}
