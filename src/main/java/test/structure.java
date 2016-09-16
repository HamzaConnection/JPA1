package test;

import java.util.HashMap;
import javax.persistence.Persistence;

public class structure
{
    public static void main(String[] args)
    {
        
        HashMap<String, Object> property = new HashMap<>();
        property.put("javax.persistence.schema-generation.database.action", "drop-and-create");
        property.put("javax.persistence.sql-load-script-source", "scripts/clearDatabase.sql"); // kører vores script
        Persistence.generateSchema("jpa_1PU", property);
        Persistence.generateSchema("jpa_1PU", null);
        
    }
}
