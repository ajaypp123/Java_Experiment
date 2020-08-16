
class Outer1
{
	private int data=30;

	class Inner
	{
		void msg()
		{
			System.out.println("data is "+data);
		}
	}

	public static void main(String args[])
	{
		Outer1 obj = new Outer1();
		Outer1.Inner in = obj.new Inner();
		in.msg();
	}
}