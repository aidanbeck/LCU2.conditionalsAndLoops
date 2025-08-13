package org.example;

public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        int sum = 0;
        int i = 1;
        while (i <= n && (sum % 2 != 0 || sum == 0)) {
            sum += i;
            i++;
        }
        return sum;
    }
}