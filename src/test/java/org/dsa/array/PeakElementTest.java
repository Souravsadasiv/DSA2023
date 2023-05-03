package org.dsa.array;


import org.junit.Assert;
import org.junit.Test;

public class PeakElementTest {
    @Test
    public void testCase1(){
        int[] arr={12,32,15,62,45,65,78,98,45,12,65,54};
        PeakElement peakElement=new PeakElement();
        int actualValue=peakElement.findPeak(arr);
        int expectedValue=1;
//        Assert.assertEquals(expectedValue,actualValue);
        Assert.assertEquals(actualValue,expectedValue);

    }

}