/*
Q9. Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively 
represent the name of the flower, its number of petals, and price. Your class must include a constructor method that 
initialises each variable to an appropriate value, and your class should include methods for setting the value of each 
type, and getting the value of each type. Create an array of 5 Flower objects and print the value.
*/
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Flower[] arr = new Flower[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            arr[i] = new Flower(scan.next(), scan.nextInt(), scan.nextFloat());
        }
        for(int i=0; i<5; i++) {
            System.out.print(arr[i].getName() + " " + arr[i].getPetals() + " " + arr[i].getPrice());
            System.out.println();
        }
    }
}

class Flower {
    private String name;
    private int petals;
    private float price;

    Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
