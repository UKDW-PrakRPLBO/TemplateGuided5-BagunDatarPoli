package com.rplbo.Guided9BangunDatar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void test1()
    {
        BangunDatar p1 = new Persegi(4);
        BangunDatar p2 = new PersegiPanjang(5,3);
        p1.luas();
        p2.luas();
        tampilKeliling(p1);
        tampilKeliling(p2);
    }

    public static void tampilKeliling(BangunDatar bd){
        bd.keliling();
        if(bd instanceof Persegi){
            ((Persegi) bd).cobaPersegi();
        }
    }
}
