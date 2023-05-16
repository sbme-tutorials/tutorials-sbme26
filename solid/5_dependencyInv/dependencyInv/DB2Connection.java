package dependencyInv;

public class DB2Connection implements DBConnectionInterface {

    @Override
    public String connect()
    {
        // handle the database connection
        return "DB2 connection";
    }
}
