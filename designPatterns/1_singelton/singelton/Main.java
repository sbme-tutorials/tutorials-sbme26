package singelton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Admin> adminList = new ArrayList<Admin>();
        for(int i = 0; i < 3; i++) {
            adminList.add(Admin.getInstance());
        }
        for(Admin admin : adminList) {
            System.out.println(admin.getAdminName());
        }

        // SClass s1 = SClass.getInstance();
        // SClass s2 = SClass.getInstance();
    }
}