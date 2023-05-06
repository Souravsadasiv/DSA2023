package org.dsa.array;

import junit.framework.TestCase;
import org.testng.Assert;

import static org.testng.Assert.*;

public class Sort012ArrayTest extends TestCase {
    public void sort012Array(){
//        int[] arr={1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,2,2,0,0,0,1,1,0,0,0,0,2,2,2,2,2,2,2,2,2,2};
        int[] arr={0,0,0,1,1,1,1,2,2,2};
        Sort012Array sarr=new Sort012Array();
        int[] actualArray=sarr.sortArr(arr);
//        int[] expectedArray={0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2};
        int[] expectedArray={0,0,0,1,1,1,1,2,2,2};
        Assert.assertEquals(actualArray,expectedArray);


    }

}