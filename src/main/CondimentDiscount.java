package main;

public class CondimentDiscount extends CondimentDecorator {

    double discount;
    CondimentDiscount(Beverage beverage, double discount) {
        super(beverage);
        this.discount = discount;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "With a " + discount + "% discount";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
