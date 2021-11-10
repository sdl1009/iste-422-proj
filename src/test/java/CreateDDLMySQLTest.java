import static org.junit.Assert.*;

import java.util.List;
import java.util.Map.Entry;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;

import org.junit.Test;

public class CreateDDLMySQLTest {

    CreateDDLMySQL createDDLMySQL;

    @Before
    public void initializeDDL(){

        EdgeTable[] tables = new EdgeTable[] {
            new EdgeTable("1|Table1"),
            new EdgeTable("2|Table2"),
            new EdgeTable("3|Table3")
        };

        for (EdgeTable table : tables) {
            table.makeArrays();
        }

        EdgeField[] fields = new EdgeField[] {
            new EdgeField("1|Field1"),
            new EdgeField("2|Field2"),
            new EdgeField("3|Field3")
        };

        createDDLMySQL = new CreateDDLMySQL(tables, fields);

    }

    @Test
    public void SQLDDLStringTest(){
        String actualSQL = createDDLMySQL.getSQLString();
        assertEquals("CREATE DATABASE MySQLDB;\r\nUSE MySQLDB;\r\nCREATE TABLE Table1 (\r\n);\r\n\r\nCREATE TABLE Table2 (\r\n);\r\n\r\nCREATE TABLE Table3 (\r\n);\r\n\r\n", actualSQL);
    }
    
}
