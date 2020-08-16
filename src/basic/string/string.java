import java.util.StringTokenizer;

public class string {
    public static void main(String[] args) {
        // String synchronized immutable object
        String str1 = "ABC";
        // StringBuffer is mutable object of string
        StringBuffer str2 = new StringBuffer("ABC");
        // StringBuilder  non-synchronized immutable object
        StringBuilder str3 = new StringBuilder("ABC");
        System.out.println(str1 +" "+ str2 +" "+ str3);

        // toString method override
        string s = new string();
        System.out.println(s);

        // StringTokenizer break string
        StringTokenizer st = new StringTokenizer("my name is khan"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    public String toString(){//overriding the toString() method
        return "my_class";
    }
}