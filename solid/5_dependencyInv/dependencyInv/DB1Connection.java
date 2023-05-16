package dependencyInv;

public class DB1Connection implements DBConnectionInterface{

    @Override
    public String connect()
    {
        // handle the database connection
        return "DB1 connection";
    }
}
