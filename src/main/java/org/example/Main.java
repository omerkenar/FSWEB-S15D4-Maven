package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("Was it a car or a cat i saw ?"));

        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String text) {
        String kelimeler = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        LinkedList<Character> characters = new LinkedList<>();

        for (char c : kelimeler.toCharArray()) {
            characters.add(c);
        }

        while (characters.size() > 1) {
            if (!characters.pollFirst().equals(characters.pollLast())) {
                return false;
            }
        }

        return true;
    }


    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();

        while (decimal>0){
            int kalan = decimal %2;
            binaryList.addFirst(kalan);
            decimal = decimal/2;
        }

        StringBuilder binaryString = new StringBuilder();

        for (int digit: binaryList){
            binaryString.append(digit);
        }

        return binaryString.toString();
    }

}