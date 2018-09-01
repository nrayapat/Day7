package com.capgemini.day7.tests;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Date;

class DateTest {

	@Test
	void testDate() {
		
          Date date1=new Date(LocalDate.of(2016, 07, 16));
          Date date2=new Date(LocalDate.of(2015, 06, 19));
          Date date3=new Date(LocalDate.of(2018, 05, 19));
          
          ArrayList<Date> al=new ArrayList<>();
          al.add(date1);
          al.add(date2);
          al.add(date3);
          
          ArrayList<Date> result=new ArrayList<>();
          
          try(FileOutputStream fileOutput=new FileOutputStream("C:\\Nikhil\\nikhil1.txt");
        		 ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutput))
        		  {
        	  objectOutput.writeObject(al);
        	  
          }
          catch(IOException e)
          {
        	  e.printStackTrace();
          }
          
          try(FileInputStream fileInput=new FileInputStream("C:\\Nikhil\\nikhil1.txt");
         		 ObjectInputStream objectInput=new ObjectInputStream(fileInput))
         		  {
         	   result=(ArrayList<Date>)objectInput.readObject();
           }
           catch(IOException e)
           {
         	  e.printStackTrace();
           } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
          System.out.println(result);
	}

}