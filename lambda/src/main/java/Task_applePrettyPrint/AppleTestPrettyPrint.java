package Task_applePrettyPrint;

import java.util.ArrayList;
import java.util.List;

public class AppleTestPrettyPrint {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        prettyPrintApple(inventory, new AppleColorPredicate());
        prettyPrintApple(inventory, new AppleWeightPredicate());

    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate){
        for (Apple apple: inventory){
            String output = applePredicate.accept(apple);
            System.out.println(output);
        }
    }
}
