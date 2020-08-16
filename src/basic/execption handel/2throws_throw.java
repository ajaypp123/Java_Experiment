/*throw : It used to throw exception explicitly. (throw new IOException("sorry device error); )
- throws : It  is used to declare an exception. Declare throws where exception may occur so 
exception handling code can Handel it.(return_type method_name() throws exception_class_name{ })
*/

class Testthrows1
{  
  void m()throws Exception
  {  
    //throw new IOException("device error");//checked exception  
	 int i = 99/0;    //unchecked exception
  } 
  
  void n()throws Exception
  {  
    m();  
  } 
  
  void p()
  {  
   try
   {  
    n();  
   }
   catch(Exception e)
    {
		System.out.println("exception handled");
	}  
  }  
  
  public static void main(String args[])
  {  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  