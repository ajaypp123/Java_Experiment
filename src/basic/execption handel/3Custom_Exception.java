

//Define customize exception
class InvalidAgeException extends RuntimeException //UnChecked exception
{
	InvalidAgeException(String s){
		super(s);
	}
}

class TestCustomException1{
   //Condition
   static void validate(int age)throws InvalidAgeException
   {
     if(age<18)
      throw new InvalidAgeException("not valid");
     else
      System.out.println("welcome to vote");
   }

   public static void main(String args[]){
	  //handle exception
	  //Do not use try-catch for Unchecked Exception
      validate(13);

      System.out.println("rest of the code...");
  }
}
//Exception occurred: InvalidAgeException:not valid