package main;

public class App
{
    public static void main(String[] args) 
    {
        Beverage beverage = new DarkRoast();
        beverage = new MilkCondiment(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
