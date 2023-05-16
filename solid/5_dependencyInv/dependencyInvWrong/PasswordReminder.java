package dependencyInvWrong;

public class PasswordReminder {

    private DB1Connection db1connection;

    public PasswordReminder(DB1Connection db1connection) {
        this.db1connection = db1connection;
    }
    
}
