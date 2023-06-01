package com.example.sorting;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import java.util.Arrays;

public class SortingApp {
    private static final Logger logger = LogManager.getLogger(SortingApp.class);


    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        logger.info("Sorting numbers: {}", Arrays.toString(numbers));
    }
}

