package hackerrank.easy;

import java.util.Objects;

public class JavaFactoryPattern {
}


interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (Objects.isNull(order)) throw new RuntimeException("Order is null");
        if (order.equals("cake")) {
            return new Cake();
        } else if (order.equals("pizza")) {
            return new Pizza();
        } else {
            throw new RuntimeException("Wrong order");
        }
    }
}
