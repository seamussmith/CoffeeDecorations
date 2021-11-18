package main;

public class Rabbit extends CondimentDecorator {

    Rabbit(Beverage beverage) {
        super(beverage);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Rabbit...?";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return 5000;
    }
    
}
