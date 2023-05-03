package org.dsa.array;

import junit.framework.TestCase;
import org.junit.Test;
import org.testng.Assert;

public class CountOccuranceTest extends TestCase {
    @Test
    public void testCase(){
        int[] arr={1,1,1,1,2,3,4,4,5,5,6,6,7,7,7,7,7,2,2,2,3,3,3,3,8,8,};
        CountOccurance co=new CountOccurance();
        int actualValue=co.occurance(arr,5);
        int expectedValue=2;
        Assert.assertEquals(actualValue,expectedValue);
    }
    public void testCase1(){
        int[] arr={1,1,1,1,2,3,4,4,5,5,6,6,7,7,7,7,7,2,2,2,3,3,3,3,8,8,};
        CountOccurance co=new CountOccurance();
        int actualValue=co.occurance(arr,1);
        int expectedValue=4;
        Assert.assertEquals(actualValue,expectedValue);
    }

}