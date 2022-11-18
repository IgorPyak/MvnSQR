package ru.netology.sqr;

public class SQRService {
    public int calculate(int minVal, int maxVal) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= minVal) {
                if (i * i <= maxVal) {
                    result++;
                }
            }
        }
        return result;
    }
}
