package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldCalculateWhereTheAmountExceedsTheLimitWithReminder(){
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldCalculateWhereTheAmountLowerTheLimit(){
        int amount = 450;
        int actual = service.remain(amount);
        int expected = 550;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculateWhereAmountEqualsBoundary(){
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }
}
