import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        //create apples
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate()); //this is the behavior parametrization portion
        // we are passing the behavior as AppleHeavyPredicate.

        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result = new ArrayList<>();  //creating new empty array list

        for(Apple apple : inventory){  //for loop is going to the inventory and getting the apples one by one
            if(applePredicate.test(apple)){ // I am calling the test method of the passed behavior (heavy or green)
                result.add(apple);
            }
        }
        return result;
    }

// BEHAVIOR PARAMETRIZATION: the ability to tell a method to take multiple behaviors (strategies);


}
