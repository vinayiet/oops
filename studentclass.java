public class studentclass {

    // here I have created a class which stores all the objects
    public static class Student {
        String name;
        int rollno;
        String village;

    }

    public static void main(String args[]) {

        // here is I have created a object s1 in student class
        Student s1 = new Student();

        s1.name = "Vinay";

        s1.rollno = 23;

        s1.village = "garhmalpur";

        // here I have created second object s2 in the student class
        Student s2 = new Student();

        s2.name = "Satyam";

        s2.rollno = 42;

        s2.village = "garhmalpur";

        System.out.println(s2.name);
    }
}