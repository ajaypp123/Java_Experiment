//instance initializer block


class Bike7{

    public static void main(String args[]){

		try {
			int m = 10,d=20;
			if(m<d)
				throw new Exception("not valid");           //throw keyword
			//System.out.println(j);}
		} catch(Exception e) {
			System.out.println(e);
		}finally{
			System.out.println("finally");
		}
    }
}