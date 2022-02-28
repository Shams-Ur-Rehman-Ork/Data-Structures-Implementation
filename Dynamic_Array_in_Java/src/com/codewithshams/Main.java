package com.codewithshams;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);

        numbers.removeAt(3);
        numbers.removeAt(4);

        numbers.remove();
        numbers.remove();
        numbers.remove();

        numbers.insert(2203);
        numbers.insert(2234);
        numbers.insert(1123);

        // printing index of a specific element.
        System.out.println(numbers.indexOf(1123));

        // printing array
        numbers.print();
        numbers.print_in_array_form();

        // Finding max value in array
        System.out.println(numbers.max());

        // Reversing the order of given array
        System.out.println(Arrays.toString(numbers.reverse()));
    }
}
