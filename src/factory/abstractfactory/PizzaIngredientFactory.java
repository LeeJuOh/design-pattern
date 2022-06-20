package factory.abstractfactory;

import factory.abstractfactory.domain.Cheese;
import factory.abstractfactory.domain.Clams;
import factory.abstractfactory.domain.Dough;
import factory.abstractfactory.domain.Pepperoni;
import factory.abstractfactory.domain.Sauce;
import factory.abstractfactory.domain.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
