

import java.util.*;
import java.lang.*;
import java.io.*;


class parant{
     int i = 0;
    
    parant(){
        i++;
        System.out.println("\n\n" + i++);
    }
    
    void method(){
        System.out.println("parant");
    }
}


class Codechef extends parant
{
    
    Codechef(){
        i=999;
        System.out.println("\n\n" + i++);
        method();
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
        Codechef c = new Codechef();
        
	}
}
