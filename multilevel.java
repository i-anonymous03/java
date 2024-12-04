//import java util.*;
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("dog is barking");
    }
}
class Labrador extends Dog
{
    void display()
    {
        System.out.println("dog is Labrador");
    }
}
class Main
{
	public static void main(String[] args) {
		Labrador myDog= new Labrador();
		myDog.eat();
		myDog.display();
		myDog.bark();
	}
}
