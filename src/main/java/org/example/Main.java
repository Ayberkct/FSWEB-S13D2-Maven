package org.example;

public class Main {
    public static boolean isPalindrome(int number) {

        int originalNumber = Math.abs(number);
        int reversedNumber = 0;
        int temp = originalNumber;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }


        return originalNumber == reversedNumber;
    }
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = 0;
        int digitCount = 0;


        int temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
            digitCount++;
        }

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0: System.out.print("Zero "); break;
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
            }
            reversedNumber /= 10;
        }


        while (digitCount > 0 && number % 10 == 0) {
            System.out.print("Zero ");
            digitCount--;
            number /= 10;
        }


    }
    }
}
