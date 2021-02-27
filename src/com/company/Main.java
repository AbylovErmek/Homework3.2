package com.company;

public class Main {

    public static void main(String[] args) {

            int[] big = new int[]{-4, 42, 73, -1, 32, 53, 16, 216, 24, -5, 42, 74, 55, 36, 14};

            boolean moon = false;
            while (!moon) {
                moon = true;
                for (int i = 1; i < big.length; i++) {
                    if (big[i - 1] > big[i]) {
                        int i1 = big[i];
                        big[i] = big[i - 1];
                        big[i - 1] = i1;
                        moon = false;
                    }
                }

            }



    }
}
