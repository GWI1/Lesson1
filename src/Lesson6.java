/*Java 1 Homework 6
 *@author Ksenia
 * @version date 27/01/22
 *
 */

class Lesson6 {
    public static void main(String[] args){
        IAnimal[] animals={
            new Cat("Cat",180,200,20,0), new Dog("Dog",60,500,9,10)
        };
        for (IAnimal animal:animals){
            System.out.println(animal);
            System.out.println();
            System.out.println(animal.run());
            System.out.println(animal.swim());
            System.out.println("and said "+ animal.voice());
            System.out.println();
        }
        
    }
    
}

class Cat extends Animal {
    Cat(String name, int runDist, int runLim, int swimDist, int swimLim){
        super(name, runDist, runLim, swimDist, swimLim);
  
    }
    
    @Override
    public String swim() {
        return "Attention! Cat can't swim!";
    }
    @Override
    public String voice() {
        return "Meow!";
    }
}

class Dog extends Animal {
    Dog(String name, int runDist, int runLim, int swimDist, int swimLim){
        super (name, runDist, runLim, swimDist, swimLim);
    }
     @Override
    public String voice() {
        return "Baw-baw!";
    }
    
}
interface IAnimal {
    String voice();
    String run();
    String swim();

}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runDist;
    protected int swimDist;
    protected int runLim;
    protected int swimLim;
    
    Animal(String name, int runDist, int runLim, int swimDist, int swimLim){
        this.name=name;
        this.runDist=runDist;
        this.runLim=runLim;
        this.swimDist=swimDist;
        this.swimLim=swimLim;
    }
        
    public String run(){
        if (runDist<=runLim){
            return name+" run "+runDist+"m";
        } else {
            return "too long distance!";
        }
    }
    public String swim(){ 
        if (swimDist<=swimLim){
            return name+" swam "+swimDist+"m";
        } else {
            return "too long distance!";
        }
   }
   
        
    
    
    @Override
    public String toString() {
        return "Could a "+name+" run "+runDist+"m and swim "+swimDist+"m?";
    }
}