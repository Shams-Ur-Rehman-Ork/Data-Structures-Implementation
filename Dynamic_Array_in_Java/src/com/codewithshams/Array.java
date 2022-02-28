package com.codewithshams;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;
    private int max_value;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item) {
        // checking if array length is full.
        if (items.length == count) {

            // making new array having double capacity
            int[] newItems = new int[count * 2];

            // Copying all items to the new array
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;

        }
        // adding item to the end of the array.
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        // Step: 1 --> Validate the index in the array.
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Step: 2 --> Shift items to left to fill the whole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public void remove() {
        // validate if at-least 1 element is present in array
        if (count > 0){
            count--;
        }
        else System.out.println("No element in array to remove.");
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item){
                return i;
            }
        return -1;
    }

    public int max() {
        for (int i = 0; i < count; i++)
            if (items[i] > max_value) {
                max_value = items[i];
            }
        return max_value;
    }

    public int[] reverse() {
        // reversing array elements.
        int[] temp = new int[count];
        int j = count - 1;
        for (int i = 0; i < count; i++) {
            temp[j] = items[i];
            j = j - 1;
        }
        return temp;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void print_in_array_form() {
        System.out.println(Arrays.toString(items));
    }

}
