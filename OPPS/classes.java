package OPPS;

public class classes {
    public static void main(String[] args) {

         Pen p1 = new Pen();
         p1.setcolor("BLUE");
         System.out.println(p1.getColor());
         p1.setcolor("yellow");
         System.out.println(p1.getColor());
         p1.setTip_Size(12);
         System.out.println(p1.getTip());


         Student s1 = new Student();

         BankAccount b = new BankAccount();
         b.username = "Sourav";
        //  b.password = "4567";    // --> error because it is private
         b.setPassword("12345");
    }    
}

class Pen{
    private String color;
    private int tip_size;

    //getters
    String getColor()
    {
        return this.color;
    }
    int getTip(){
        return tip_size;
    }
    //setters
    void setcolor(String newColor)
    {
        color = newColor;
    }

    void setTip_Size(int newTip){
        tip_size = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}

class BankAccount
{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

