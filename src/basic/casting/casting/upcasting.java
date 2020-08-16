package casting;

class Person {
    private String name;
    private String gender;

    Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    String getName(){
        return this.name;
    }

    String getGender(){
        return this.gender;
    }
}

class Student extends Person{
    private String school;

    Student(String name, String gender, String school){
        super(name, gender);
        this.school = school;
    }

    String getSchool() {
        return school;
    }

    void getDetail() {
        System.out.println("Name: "+ getName() + " Gender: " + getGender() + getSchool());
    }
}

class Casting{
    public static void main(String[] args) {
        // Upcasting
        Person p = new Student("a", "b", "c");
        System.out.println(p.getName());

        // Downcasting
        Student s = (Student)p;
        System.out.println(s.getSchool());
    }
}