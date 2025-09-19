public class OO {
    public static void main(String args[]){
        Student s1 = new Student();
        // System.out.println(s1.name);

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name =s1.name;
    //     this.roll =s1.roll;
    //     this.marks =s1.marks;

    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll =s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] =s1.marks[i];

        }
    }

    Student() {
        System.out.println("constructor is called..... ");
  
    }
}

