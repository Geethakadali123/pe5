package com.stackroute;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


public class SortedSetTest {
    SortedSet sortedSet=new SortedSet();
    @Test
    public void sortedOrderOne(){
        String[] s={"Harry","Olive","Alice","Bluto","Eugene"};
        assertEquals(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive"),sortedSet.sorted(s));

    }

    @Test
    public void sortedOrderTwo(){
        String[] s={"Sri","Kadali","Geetha","Challagulla","Kranthi"};

        assertEquals(Arrays.asList("Challagulla","Geetha","Kadali","Kranthi","Sri"),sortedSet.sorted(s));

    }

}