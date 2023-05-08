package singelton;

public class SClass {
    static public SClass instance = null;

    private SClass(){

    }

    public static SClass getInstance(){
        if(instance == null){
            instance = new SClass();
        }
        return instance;
    }
}
