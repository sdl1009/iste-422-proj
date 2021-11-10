import static org.junit.Assert.*;

import java.util.List;
import java.util.Map.Entry;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;

import org.junit.Test;

public class EdgeConvertCreateDDLTest {

    EdgeConvertCreateDDL edgeConvertCreateDDL;
    
    @Before
	public void initializeTable() {
		// because Account is an abstract we need to provide an impl for monthEnd
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

		edgeConvertCreateDDL = new EdgeConvertCreateDDL(tables, fields) {

			@Override 
            public String getDatabaseName(){
                return null;
            };

            @Override 
            public String getProductName(){
                return null;
            };
            
            @Override 
            public String getSQLString(){
                return null;
            };
            
            @Override 
            public void createDDL(){
                
            };
		};
	}

    @Test
    public void getTableTest(){
        EdgeTable actualTable = edgeConvertCreateDDL.getTable(1);
        assertEquals(1, actualTable.getNumFigure());
        assertEquals("Table1", actualTable.getName());
        EdgeTable actualTable2 = edgeConvertCreateDDL.getTable(2);
        assertEquals(2, actualTable2.getNumFigure());
        assertEquals("Table2", actualTable2.getName());
        EdgeTable actualTable3 = edgeConvertCreateDDL.getTable(3);
        assertEquals(3, actualTable3.getNumFigure());
        assertEquals("Table3", actualTable3.getName());
        
    }

    public void getFieldTest(){
        EdgeTable actualField = edgeConvertCreateDDL.getTable(1);
        assertEquals(1, actualField.getNumFigure());
        assertEquals("Table1", actualField.getName());
        EdgeTable actualField2 = edgeConvertCreateDDL.getTable(2);
        assertEquals(2, actualField2.getNumFigure());
        assertEquals("Table2", actualField2.getName());
        EdgeTable actualField3 = edgeConvertCreateDDL.getTable(3);
        assertEquals(3, actualField3.getNumFigure());
        assertEquals("Table3", actualField3.getName());
    }

}
