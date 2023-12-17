package nyettotank2.metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Cynthia
 */
public class DataResumeDialogTest {
    DataResumeDialog dataResumeDialog;
    
    public DataResumeDialogTest() {
    }        
   
    @Before
    public void setUp() {
        dataResumeDialog = new DataResumeDialog(null, null, true);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testViewDataResumePropertiesDialog() {
        System.out.println("viewDataResumePropertiesDialog");
    }


    @Test
    public void testViewTableHeightToVolumeGeometrie() {
    }

   
    @Test
    public void testTwoDecimale() {
        System.out.println("twoDecimale");
    }

   
    @Test
    public void testViewTableHeightToVolumeVolumetrie() {
        HashMap<String, Object> info = new HashMap<>();
        info.put("unite des hauteurs", "cm"); 
        info.put("unite de volume", "litres");

        HashMap<String, Object> data = new HashMap<>();
        data.put("longueur", 135);
        data.put("diametre", 50.0);

        List<Line> myLine = new ArrayList<>();
        myLine.add(new Line(10, 13)); 
        myLine.add(new Line(15, 16)); 
        myLine.add(new Line(20, 21)); 


        try {
            dataResumeDialog.ViewTableHeightToVolumeVolumetrie(info, data, myLine);
        } catch (Exception e) {
            fail("Exception potentiel: " + e.getMessage());
        }
    }

   
    @Test
    public void testAfficherCourbeGeometrique() {
     
    }

 
    @Test
    public void testAfficherCourbeVolumetrique() {
        
    }
    
}
