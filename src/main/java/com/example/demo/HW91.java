package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW91 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] donor = new int[20];

        for (int i = 0; i < donor.length; i++) {
            System.out.println("input " + i + " element: ");
            donor[i] = Integer.parseInt(READER.readLine());
        }
        int[] first = Arrays.copyOfRange(donor, 0, 11);
        int[] second = Arrays.copyOfRange(donor, 11,20);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));



    }




}