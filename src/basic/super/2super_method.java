

import java.util.*;
import java.lang.*;
import java.io.*;


class parant {
     public void fun(){
    	System.out.println("parant fun method ");
    }
}


class Codechef extends parant {
    
    public void fun(){
    	System.out.println("child fun method ");
    }
    
    public void show(){
    	super.fun();
    	fun();
    }
	
}


class A
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
        Codechef c = new Codechef();
        c.show();
	}
}


