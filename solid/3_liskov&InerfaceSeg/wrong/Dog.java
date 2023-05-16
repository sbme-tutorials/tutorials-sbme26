package wrong;
public class Dog implements Animal {

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Can not fly");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Can not swim");
    }

    @Override
    public void walk() {
   
    }

    public void eat(){}
    public void grow(){}
    
}
