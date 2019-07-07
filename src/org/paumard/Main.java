package org.paumard;

import java.util.Comparator;

/**
 *
 * @author José Paumard
 */
public class Main {
	
	{
		System.out.println("hello");
	}
	
	static{
		System.out.println(" static hello");
	}

    public static void main(String[] args) {
        
       int x=0;
       Main m=new Main();
       m.compute(x);

   	System.out.println(x);
    }
    
    public int compute(int x)
    {
    	System.out.println(x=x+5);
    	return x;
    }
    
   // Comparator<Integer> i= (i1,i2)->i1.compareTo(i2);

    //Comparator<Integer> i= Integer::;
}
