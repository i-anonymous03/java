//Question=
//class=vehicle>truck,car,motorcycle
//subclass variables=make,model,year,fueltype
//meathod=fuel efficiency, distance travelled, max speed

import java.util.*;

class Vehicle
{ 
	int weight,yearofMenu;
	String fueltype,model;
	
	Scanner ip= new Scanner(System.in);
	void IP()
	{
	System.out.println("Enter Model of Vehicle(integer only)");
	model= ip.nextLine();
		System.out.println("Enter Fuel type of Vehicle");
	fueltype = ip.nextLine();
	
	
	System.out.println("Enter Weight of Vehicle (in kg)");
	weight = ip.nextInt();



	System.out.println("Enter Year of menufacture of Vehicle");
	yearofMenu = ip.nextInt();


	
	System.out.println(" Weight of Vehicle is  "+ weight);
	System.out.println(" Model of Vehicle is  "+ model);
	System.out.println(" Year of menufacture of Vehicle is "+ yearofMenu);
	System.out.println(" Fuel type of Vehicle is "+ fueltype);
	
    }

	void FuelEff()
	{
	    
	    IP();
		System.out.println("Enter Average of Vehicle(in integer= ___ km/L)");
		int AvgV = ip.nextInt();
		System.out.println("Average of Vehicle is "+AvgV);
	}

	void DisTravel()
	{
	    IP();
		System.out.println("Enter Distance travelled by Vehicle(in integer= ___ km)");
		int Dis = ip.nextInt();
		System.out.println("Distance travelled by Vehicle is "+Dis);
	}

	void MaxSp()
	{
	    IP();
		System.out.println("Enter Max speed of Vehicle((in integer ___ km/h)");
		int MaxSpeed = ip.nextInt();
		System.out.println("Max speed of Vehicle is "+MaxSpeed);
	}
	


}
class Car extends Vehicle
{
    void ShowCar(){
	System.out.println("This is Car");
    }
}
class Truck extends Vehicle
{
    void ShowTruck(){
	System.out.println("This is Truck");

    }
    }

class Motorcycle extends Vehicle
{
    void ShowMotorcycle(){
	System.out.println("This is motorcycle");
    }
}

class Main
{
	public static void main(String[] args) {
		Car C1= new Car();
		Truck T1=new Truck();
		Motorcycle M1=new Motorcycle();
		System.out.println("which vehicle you want to input\n 1.car\n 2.truck\n 3.Motorcycle\n 4.exit\n choose an option from above.\n");
		Scanner ip= new Scanner(System.in);
		int choice=ip.nextInt();
		
		do {
		    
		    switch(choice) {
  case 1:
   	//Car object calling meathods of vehicle
		C1.ShowCar();
		C1.FuelEff();
		C1.DisTravel();
		C1.MaxSp();
    break;
  case 2:
    	//Truck object calling meathods of vehicle
		T1.ShowTruck();
		T1.FuelEff();
		T1.DisTravel();
		T1.MaxSp();
    break;
    case 3:
    	//Motorcycle object calling meathods of vehicle
		M1.ShowMotorcycle();
		M1.FuelEff();
		M1.DisTravel();
		M1.MaxSp();
    break;
    case 4:
        System.out.println("  ");
        System.out.println("Thankyou for using the program.\nYou are Exiting now , Bye Bye !");
    	System.exit(0); 
    break;
    default:
    	System.out.println("Enter a Valid choice");
  
}
		}
while (choice!=4);
		}
	
}