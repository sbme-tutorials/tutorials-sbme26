package dependencyInv;

public class PasswordReminder {

    private DBConnectionInterface dbconnection;

    public PasswordReminder(DBConnectionInterface dbconnection) {
        this.dbconnection = dbconnection;
    }
    
}
