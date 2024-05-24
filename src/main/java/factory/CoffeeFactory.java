package factory;

public class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO -> {
                return new Espresso();
            }
            case AMERICANO -> {
                return new Americano();
            }
            default -> {
                throw new IllegalArgumentException("Не существует кофе данного типа");
            }
        }
    }
}
