package com.contactsunny.poc.single_dimension_array_data_structure_poc.single_dimension_array;

import java.lang.reflect.Array;

public class SingleDimensionArray<T> {

    private T array[];

    public SingleDimensionArray(Class<T> tClass, int sizeOfArray) {
        array = (T[]) Array.newInstance(tClass, sizeOfArray);
    }

    public void add(int index, T value) throws ArrayIndexOutOfBoundsException  {
        array[index] = value;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException {
        return array[index];
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < array.length; index++) {
            stringBuilder.append(array[index]);

            if (index != (array.length - 1)) {
                stringBuilder.append(", ");
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
