package decorator;

public class DecoratedCalculator extends Calculator{
    
    @Override
    public int add(int x, int y) {
        int result = super.add(x, y);
        System.out.println("The result of adding %d and %d is %d".formatted(x, y, result));
        return result;
    }
}
