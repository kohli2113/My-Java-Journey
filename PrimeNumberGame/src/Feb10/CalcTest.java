package PrimeNumberGame.src.Feb10;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc c;
    // this is the function i am using to initialize the object
    @BeforeEach
    public void init()
    {
        c=new Calc();
    }

    @Test
    public void checkMul()
    {
        assertEquals(8,c.multiply(2,4));
    }
}

//package com.feature;
////        import static org.junit.Assert.assertEquals;
////        import org.junit.jupiter.api.AfterEach;
////        import org.junit.jupiter.api.BeforeAll;
////        import org.junit.jupiter.api.BeforeEach;
////        import org.junit.jupiter.api.Test;
////public class CalcTest
////{
////    Calc c;
////    @BeforeEach
////    public void init()
////    {
////        c=new Calc();
////        System.out.println("Test started");
////    }
////    @Test
////    void data()
////    {
////        assertEquals(8,c.multiply(4, 2));
////    }
////    @Test
////    void addTest()
////    {
////        assertEquals(10,c.add(5, 5));
////    }
////    @AfterEach
////    void display()
////    {
////        System.out.println("Test completed");
////    }
////
//}
////