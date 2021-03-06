package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = feline.getFood("Хищник");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFelineGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFelineGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestGetKittens() {
        Feline feline = new Feline();
        int kittensCount = 2;
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(kittensCount, actual);
    }

}
