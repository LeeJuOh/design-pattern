package factory.abstractfactory;

import factory.abstractfactory.domain.Cheese;
import factory.abstractfactory.domain.Clams;
import factory.abstractfactory.domain.Dough;
import factory.abstractfactory.domain.MarinaraSauce;
import factory.abstractfactory.domain.Pepperoni;
import factory.abstractfactory.domain.ReggianoCheese;
import factory.abstractfactory.domain.Sauce;
import factory.abstractfactory.domain.ThinCrustDough;
import factory.abstractfactory.domain.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
