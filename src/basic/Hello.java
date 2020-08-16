/*
    Hello.java
*/

public class Hello {
    private String hello = "Hello World";

    public void printHello() {
        System.out.println(hello);
    }

    public static void main(final String[] args) {
        Hello hello = new Hello();
        hello.printHello();
    }
}