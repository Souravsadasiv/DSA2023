package org.dsa.array;

import junit.framework.TestCase;
import org.junit.Test;
import org.testng.Assert;

public class FindMinMaxTest extends TestCase {
    @Test
    public void testCase(){
        int [] arr={-60,-45,-61,23,65,23,76,93,45};
        FindMinMax fmm=new FindMinMax();
        int[] res=fmm.minmax(arr);
        int[] exp={-61,93};

        Assert.assertEquals(res,exp);
    }
}