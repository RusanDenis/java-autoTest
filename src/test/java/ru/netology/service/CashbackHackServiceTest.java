package ru.netology.service;

import org.junit.Assert;

import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateWhereTheAmountExceedsTheLimitWithReminder(){
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual,expected);

    }
    @Test
    public void shouldCalculateWhereTheAmountLowerTheLimit(){
        int amount = 450;
        int actual = service.remain(amount);
        int expected = 550;

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void shouldCalculateWhereAmountEqualsBoundary(){
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }
}
