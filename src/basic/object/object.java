/**
 * Object created by
 * By new keyword
 * By newInstance() method
 * By clone() method
 * By deserialization
 * By factory method etc.
 */


class Student{
    int rollno;
    String name;

    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }

    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}

class object {
    public static void main(String[] args) {
        try{
            // By new keyword
            Student s1 = new Student();
            s1.insertRecord(1, "A");
            s1.displayInformation();

            // By newInstance() method
            Class s2 = s1.getClass();
            Object obj = s2.newInstance();
            System.out.println(obj.toString());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}