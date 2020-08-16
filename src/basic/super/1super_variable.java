

import java.util.*;
import java.lang.*;
import java.io.*;


class parant {
     int i = 0;
}


class Codechef extends parant {
    int i = 90;
    
    public void fun(){
    	Sustem.out.println("parant i = " + super.i + "\nchild i = " + i);
    }
	
}


class A
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
        Codechef c = new Codechef();
        c.fun();
	}
}


