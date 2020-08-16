import java.io.*;
import java.util.Scanner;
import java.lang.*;
class read {
    public static void main(String[] args){

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("a.txt")));
			s.useDelimiter("/");
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        }catch(Exception e){}
    }
}