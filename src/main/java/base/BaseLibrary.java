package base;

import java.util.UUID;

public class BaseLibrary extends Veriler{

    public String emailYarat() {
        return "user" + UUID.randomUUID().toString() + "@example.com";
    }

}
