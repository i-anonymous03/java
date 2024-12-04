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
class Main
{
	public static void main(String[] args) {
		Dog myDog= new Dog();
		myDog.eat();
		
	}
}
