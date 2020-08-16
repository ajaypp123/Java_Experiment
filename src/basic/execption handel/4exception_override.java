/*
If the superclass method does not declare an exception
    If the superclass method does not declare an exception,
    subclass overridden method cannot declare the checked
    exception but it can declare unchecked exception.
If the superclass method declares an exception
    If the superclass method declares an exception,
    subclass overridden method can declare same,
    subclass exception or no exception but cannot declare parent exception.
*/

class Parent {
    void msg() {
        System.out.println("parent");
    }
}

class TestExceptionChild1 extends Parent {
    @Override
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(final String args[]) {
        Parent p = new TestExceptionChild1();
        p.msg();
    }
}