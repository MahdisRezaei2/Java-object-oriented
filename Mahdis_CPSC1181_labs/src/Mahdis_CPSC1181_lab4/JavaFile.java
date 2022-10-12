package Mahdis_CPSC1181_lab4;
import java.net.*;
import java.io.*;
import java.lang.*;
public class JavaFile {

	public static void main(String[] args) throws Exception {
		
         URL data = new URL("https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data");
         URLConnection yc = data.openConnection();
         BufferedReader in = new BufferedReader(new InputStreamReader(
                 yc.getInputStream()));
        String inputLine;
        int count=0;
        int count1=0;
        int count2=0;
        while ((inputLine = in.readLine()) != null) {
        	 System.out.println(inputLine);
        	 //16-26	 
        	 System.out.println();
        	 String a[] = inputLine.split(",");
      		
      		String word = "Iris-setosa";
      		for (int i = 0; i < a.length; i++)
      	    {
      	    // if match found increase count
      	    if (word.equals(a[i]))
      	        count++;
      	    }
      		String word1 = "Iris-versicolor";
      		for (int i = 0; i < a.length; i++)
      	    {
      	    // if match found increase count
      	    if (word1.equals(a[i]))
      	        count1++;
      	    }
      	 
      		String word2 = "Iris-virginica";
      		for (int i = 0; i < a.length; i++)
      	    {
      	    // if match found increase count
      	    if (word2.equals(a[i]))
      	        count2++;
      	    }  
              
        	 
        	
        }
        System.out.println("The count of the occurance of the Iris-setosa is :  "+count);
        System.out.println("The count of the occurance of the Iris-versicolor is : "+ count1);
        System.out.println("The count of the occurance of the Iris-virginica is : "+count2);
        
         in.close();
        
        
	}
	
	
}
