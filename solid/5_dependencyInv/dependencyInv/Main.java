// Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.

package dependencyInv;

public class Main {

    DB1Connection db1Connection = new DB1Connection();
    PasswordReminder pw1 = new PasswordReminder(db1Connection);

    DB2Connection db2Connection = new DB2Connection();
    PasswordReminder pw2 = new PasswordReminder(db2Connection);
}
