package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        boolean isNeg = inputNumber < 0;

        String strNumber = Integer.toString(Math.abs(inputNumber));
        int strLength = strNumber.length();
        char[] numberArr = new char[strLength];

        for (int i = 1; i <= strLength; i++) {
            numberArr[i - 1] = strNumber.charAt(strLength - i);
        }

        int result = Integer.parseInt(String.valueOf(numberArr));

        if (isNeg) {
            result *= -1;
        }

        return result;
    }
}
