package nyettotank2.metier;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Cynthia
 */
public class VolmetrieTest {
    Volmetrie volmetrie;
    
    public VolmetrieTest() {
    }
        
    @Before
    public void setUp() {
       volmetrie = new Volmetrie(); 
    }
    
    @After
    public void tearDown() {
       
    }

   
    @Test
    public void testGenererTableVolumetrie() {
        HashMap<String, Object> info = new HashMap<>();
        info.put("nombre divisions", 50); 
        info.put("unite des hauteurs", "cm");
        info.put("table", "TestTable");
        info.put("type value", "double");
        
        HashMap<String, Object> data = new HashMap<>();
        data.put("volume residuel", 10.0); 

        List<Line> myLine = new ArrayList<>();
        myLine.add(new Line(100, 130)); 
        myLine.add(new Line(150, 160)); 
        myLine.add(new Line(200, 210)); 
        
        volmetrie.genererTableVolumetrie(info, data, myLine);

        // check si le fichier excel a été crée
        String filePath = System.getProperty("user.home") + "/Documents/TestTable.xls";
        File file = new File(filePath);
        assertTrue(file.exists());

        // suprimer le fichier après le test
//        if (file.exists()) {
//            file.delete();
//        }
    }
    
}
