package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void shouldCalculateNumberOfSquares() {
        SQRService service = new SQRService();

        int expected = 3;
        int minRange = 200;
        int maxRange = 300;

        int actual = service.squareNamber(minRange, maxRange);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int minRange = 100;
        int maxRange = 9801;

        int actual = service.squareNamber(minRange, maxRange);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int minRange = 100;
        int maxRange = 100_000;

        int actual = service.squareNamber(minRange, maxRange);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int minRange = 100;
        int maxRange = 100;

        int actual = service.squareNamber(minRange, maxRange);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 0;
        int minRange = 10;
        int maxRange = 99;

        int actual = service.squareNamber(minRange, maxRange);

        assertEquals(expected, actual);
    }

}