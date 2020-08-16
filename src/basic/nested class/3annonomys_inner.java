// Java anonymous inner class example using class

abstract class Person
{
  abstract void eat();
}

class TestAnonymousInner
{
	public static void main(String args[])
	{
		Person p=new Person()
		{
			void eat()
			{
				System.out.println("nice fruits");
			}
		};
	p.eat();
	}
}


//Java anonymous inner class example using interface
//same use interface