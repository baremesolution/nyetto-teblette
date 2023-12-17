package nyettotank2.metier;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Cynthia
 */
public class BaremeArtisanFormeCylindriqueAndEllipsoidTest {

    BaremeArtisan baremeArtisan;

    public BaremeArtisanFormeCylindriqueAndEllipsoidTest() {
    }

    @Before
    public void setUp() {
        baremeArtisan = new BaremeArtisan();
    }

    @After
    public void tearDown() {
        baremeArtisan = null;
    }

    @Test
    public void testVerifie() {
    }
    
    @Test
    public void testCertificatWithHeadGeometriqueCylindrique(){
        
        HashMap<String, Object> info = new HashMap<>();
        info.put("certificat", "TestCertificatCylindrique"); 
        info.put("type de la capacite", "Bac de stockage");
        info.put("lieu des operations", "TestLocation");
        info.put("unite des hauteurs", "cm");
        info.put("unite de volume", "Litres");
        info.put("orientation", "Horizontal");
        info.put("forme de la capacite", "Cylindrique");
        info.put("nature fond droite", "ELLIPTIQUE");
        info.put("nature fond gauche", "ELLIPTIQUE");


        HashMap<String, Object> data = new HashMap<>();
        data.put("longueur", "45");
        data.put("diametre", "23");
        data.put("volume residuel", 0);       
        data.put("fleche cote droit", 34.0);       
        data.put("fleche cote gauche", 30.0);

        InputStream logo = BaremeArtisan.class.getResourceAsStream("/images/nyettoTankFtLogo.png");      

        try {
            baremeArtisan.certificat_with_head(info, data, logo, "geometrie", null, null);

            String filePath = System.getProperty("user.home") + "/Documents/TestCertificat.pdf";
            File file = new File(filePath);
            assertTrue(!file.exists());
            
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testCertificatWithHeadGeometriqueEllipsoide() {

        HashMap<String, Object> info = new HashMap<>();
         info.put("certificat", "TestCertificatEllipsoide"); 
        info.put("type de la capacite", "Bac de stockage");
        info.put("lieu des operations", "TestLocation");
        info.put("unite des hauteurs", "cm");
        info.put("unite de volume", "Litres");
        info.put("orientation", "Horizontal");
        info.put("forme de la capacite", "Ellipsoide");

        HashMap<String, Object> data = new HashMap<>();
        data.put("hauteur", 120);
        data.put("grand axe", 50);
        data.put("petit axe", 20); 

        InputStream logo = BaremeArtisan.class.getResourceAsStream("/images/nyettoTankFtLogo.png");

        try {
            baremeArtisan.certificat_with_head(info, data, logo, "geometrie", null, null);

            String filePath = System.getProperty("user.home") + "/Documents/TestCertificat.pdf";
            File file = new File(filePath);
            assertTrue(!file.exists());

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

}
