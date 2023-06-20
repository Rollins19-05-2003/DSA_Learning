package OPPS;

public class keywordStatic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Kendriya Vidyalaya";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.percentage(89, 78, 99));
        
    }
}

class Student{
    String name;
    int roll;
    static String schoolName;   
    // this will be same for all the object for student class
    // if an object declares the schoolName it will be assigned to all the object

    void setName(String name){
        this.name = name;
    }

    String getName()
    {
        return this.name;
    }
    // now since this method is declare static now it will only occupy one memory space and every objects will point to this address
    static int percentage(int physics, int chem,int bio)
    {
        return (physics + chem + bio)/3;
    }
}