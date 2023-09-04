package Task_applePrettyPrint;

public class AppleWeightPredicate implements ApplePredicate{


    @Override
    public String  accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
