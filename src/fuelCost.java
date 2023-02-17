import java.util.Scanner;
public class fuelCost {
    public static void main(String[] args) {//Creating scanner to take input from the user
        Scanner input = new Scanner(System.in);
        double gallons = 15;
        double efficiency = 25;
        double price = 3.19;
        System.out.println("Number of gallons of gas in the tank: " + gallons);//Gallons of fuel remaining
        System.out.println("Fuel efficiency in miles per gallon: " + efficiency);//Calculates the mileage of the car
        System.out.println("Price of gas per gallon: $" + price);//calculates gas price
        double costPer100Miles = price / efficiency * 100;
        double distance = gallons * efficiency;
        System.out.println("Cost per 100 miles: $" + costPer100Miles);//Tells the amount of gas required for 100 miles
        System.out.println("Distance the car can go: " + distance + " miles");//Tells the distance it can travel
    }
}
