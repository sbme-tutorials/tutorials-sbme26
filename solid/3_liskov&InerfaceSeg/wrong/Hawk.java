package wrong;

public class Hawk implements Animal{

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("can not swim");
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("can not walk");
    }
    
    public void eat(){}
    public void grow(){}
}
