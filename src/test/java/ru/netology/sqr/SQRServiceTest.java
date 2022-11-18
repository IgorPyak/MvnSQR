package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void searchRange() {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 122);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
