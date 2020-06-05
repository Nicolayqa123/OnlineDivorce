package com.OnlineDivorce;
import com.OnlineDivorce.Testsuite1.*;
import com.OnlineDivorce.Testsuite2.*;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        First_Test.class,
        Second_Test.class
})

public class TestSuite {
}
