/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*static {
    System.out.println("Static block run first\n\n");
}
*/
class sta{
    static int i = 0;
    
    sta(){
        i++;
        System.out.println("\n\n" + i++);
    }
    
    static void method1(int j)
    {System.out.println("\n\n" + j++ + i);}
}


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        sta s1 = new sta();
        sta s2 = new sta();
        sta s3 = new sta();
        
        s2.method1(55);
        sta.method1(44);
	}
}
