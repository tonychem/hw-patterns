package factory;

public abstract class Coffee {
    private final String coffeeName;

    public Coffee(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    @Override
    public String toString() {
        return coffeeName;
    }
}
