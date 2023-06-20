package OPPS;
public class interfaceMultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.nonveg();
        b.veg();
    }
    
}
interface hervibores{
    void eat();
    void veg();
}

interface carnivores{
    void eat();
    void nonveg();
}

class Bear implements hervibores,carnivores{
    public void eat()
    {
        System.out.println("They eat both meat and green plants");
    }
    public void nonveg()
    {
        System.out.println("they are non-vegeterian");
    }
    public void veg()
    {
        System.out.println("they are vegeterian");
    }
}