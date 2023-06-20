package arrays;
public class linearSearch {

    public static int linearSearchNumber(int number[],int key)
    {
        for (int i = 0; i < number.length; i++) {
        if (number[i]==key) {
            return i;
        }
    }
    return -1;
}
    public static int LinearSearchString(String menu[], String keys) {
    for (int i = 0; i < menu.length; i++) {
        if(menu[i]==keys){
            return i;
        }
    }       
    return -1; 
    }
public static void main(String[] args) {
    int number[] = {2,4,654,213,6,67,12,456};
    String menu[] = {"Chai","Samosa","sandwich","Egg rolls"};

    int key = 213;

    int index = linearSearchNumber(number, key);  
    int item = LinearSearchString(menu, "Samosa");

    if (item==-1) {
        System.out.println("Item not found");
    } else {
        System.out.println("Item found at position " + item);
    }

    if (index==-1) {
        System.out.println("Key not found");
    } else {
        System.out.println("Key found at position " + index);
    }
}
    
}