package com.contactsunny.poc.single_dimension_array_data_structure_poc;

import com.contactsunny.poc.single_dimension_array_data_structure_poc.single_dimension_array.SingleDimensionArray;

public class App {

    public static void main(String[] args) {

        SingleDimensionArray<Integer> singleDimensionArray = new SingleDimensionArray<>(Integer.class, 10);
        singleDimensionArray.add(0, 10);
        singleDimensionArray.add(1, 20);
        singleDimensionArray.add(3, 30);

        singleDimensionArray.print();
    }
}
