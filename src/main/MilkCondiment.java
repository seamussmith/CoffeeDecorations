package main;

public class MilkCondiment extends CondimentDecorator {

    MilkCondiment(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Milk Condiment";
    }

    @Override
    public double cost() {
        return 0.20;
    }
    
}
