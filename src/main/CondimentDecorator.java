package main;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    CondimentDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }
}
