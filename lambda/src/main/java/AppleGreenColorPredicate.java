public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
        //get the apples that are green
    }
}
