package com.stackroute;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;
import java.lang.String;
import static org.junit.Assert.assertArrayEquals;
public class UpdateListTest {
   List<String> list=new ArrayList<>();
   UpdateList updateList=new UpdateList();
   @Test
   public void arrayTest1(){
       list.add(0,"Apple");
       list.add(1,"Grape");
       list.add(2,"Melon");
       list.add(3,"Berry");

     List<String> expected=new ArrayList<>();
      expected.add("Apple");
       expected.add("Grape");
       expected.add("Melon");
       expected.add("Berry");
       assertEquals(expected,updateList.add(list));


   }
   @Test
   public void arrayTest2(){
       list.add(0,"Apple");
       list.add(1,"Grape");
       list.add(2,"Melon");
       list.add(3,"Berry");


       List<String> expected=new ArrayList<>();
      expected.add("Apple");
       expected.add("Banana");
       expected.add("Melon");
       expected.add("Berry");
       assertEquals(expected,updateList.set(list));


   }
   @Test
   public void arrayTest3(){
       list.add(0,"Apple");
       list.add(1,"Grape");
       list.add(2,"Melon");
       list.add(3,"Berry");
       List<String> expected=new ArrayList<>();
       assertEquals(new ArrayList<String>(),updateList.remove(list));

   }


}
