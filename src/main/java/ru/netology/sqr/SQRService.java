package ru.netology.sqr;

public class SQRService {

    public int squareNamber(int minRange, int maxRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= minRange & square <= maxRange) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
