/*Java 1 Homework 7
 *@author Ksenia
 * @version date 2/2/22
 */

import java.util.Scanner;
 
class Lesson7 {
    public static void main(String[] args){
        Cat[] cats = {new Cat ("Barsik", 40), new Cat("Murzik", 30), new Cat("Fatty", 70), new Cat("Skinny", 15), new Cat("Kitty", 10)
        };
        
        Scanner scanner=new Scanner (System.in);
        System.out.println("How many times a day do you feed?");
        int count=scanner.nextInt();
        System.out.println("How many grams of cat food do you add?");
        int gr=scanner.nextInt();
        
        Plate plate = new Plate(160,gr);
        System.out.println(plate);
        System.out.println();        
        for (int i=0;i<count;i++){
            System.out.println("Next time to feed");
            for (Cat cat:cats){
                
                cat.isFull=false;
                System.out.println(); 
                System.out.println(cat);
                cat.eat(plate);
                System.out.println(plate);
                System.out.println();
                if (cat.isFull!=true){
                    System.out.println("Adding "+gr+"g of cats food to the plate!");
                    cat.add(plate);
                    System.out.println(plate);
                }
            }
        }
        
    }
}

class Cat {
    private String name;
    private int appetite;
    public boolean isFull;
    
    
    Cat (String name, int appetite) {
     this.name=name;
     this.appetite=appetite;
     
    }
    public void eat(Plate plate){
        if (appetite<=plate.food){
            plate.decreaseFood(appetite);
            isFull=true;
            System.out.println(name+" is full "+isFull+" Thank you!");
        }else {
            isFull=false;
            System.out.println(name+" is full "+isFull+"! "+name+" didn't eat! He is still too hungry!");
        }
    }
    @Override
    public String toString(){
        return "Cat "+name+" usually eats "+appetite+"g of cat food";
    }
    public void add(Plate plate){
        plate.increaseFood(plate.gr);
    }
}

class Plate {
    public int food;
    public int gr;
    
    
    
    Plate(int food, int gr){
        this.food=food;
        this.gr=gr;
    }
    
    public void decreaseFood (int food){
        
        this.food-=food;
    }
    public void increaseFood (int gr){
        
        this.food+=gr;
        
    }
    @Override
    public String toString() {
        return "Leftover: "+food;
    }
}