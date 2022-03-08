package decorator.before;

public class Beverage {

    String description;
    boolean hasMilk, hasSoy, hasMocha;
    double milkCost, soyCost, mochaCost;

    public double cost() {
        double condimentCost = 0;
        if (getHasMilk()) {
            condimentCost += milkCost;
        }
        if (getHasSoy()) {
            condimentCost += soyCost;
        }
        if (getHasMocha()) {
            condimentCost += mochaCost;
        }
        return condimentCost;
    }

    // get, set..
    public boolean getHasMilk() {
        return hasMilk;
    }

    public boolean getHasSoy() {
        return hasSoy;
    }

    public boolean getHasMocha() {
        return hasMocha;
    }

}
