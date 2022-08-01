package templatemethod.compareTo;

public class Duck implements Comparable<Duck> {

    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        return Integer.compare(this.weight, otherDuck.getWeight());
    }
}
