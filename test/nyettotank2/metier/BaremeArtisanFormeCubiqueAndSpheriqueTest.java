package nyettotank2.metier;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Cynthia
 */
public class BaremeArtisanFormeCubiqueAndSpheriqueTest {

    BaremeArtisan baremeArtisan;

    public BaremeArtisanFormeCubiqueAndSpheriqueTest() {
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

//    @Test
//    public void testConvertToCentimeter() {
//        float value = 5.0f;
//
////        float resultMeters = BaremeArtisan.convertToCentimeter("m", value);
////        assertEquals(500, resultMeters);
////        
////
////        float resultDecimeters = BaremeArtisan.convertToCentimeter("dm", value);
////        assertEquals(50, resultDecimeters);
//
//        float resultInches = BaremeArtisan.convertToCentimeter("pouce", value);
//        assertEquals(12.7f, resultInches, 0.01);
//
//        float resultFeet = BaremeArtisan.convertToCentimeter("pied", value);
//        assertEquals(152.4f, resultFeet, 0.01);
//
//        float resultMillimeters = BaremeArtisan.convertToCentimeter("mm", value);
//        assertEquals(0.5f, resultMillimeters, 0.01);
//    }

    @Test
    public void testConvertToVolumeDesired() {
        double volume = 10.0;

        double resultGallonUSA = baremeArtisan.convertToVolumeDesired("gallon USA", volume);
        assertEquals(2.64172, resultGallonUSA, 0.01);

        double resultGallonImperial = baremeArtisan.convertToVolumeDesired("gallon IMPERIAL", volume);
        assertEquals(2.20053, resultGallonImperial, 0.01);

        double resultBaril = baremeArtisan.convertToVolumeDesired("baril", volume);
        assertEquals(0.0628931, resultBaril, 0.01);

        double resultM3 = baremeArtisan.convertToVolumeDesired("m3", volume);
        assertEquals(0.01, resultM3, 0.01);

        double resultCm3 = baremeArtisan.convertToVolumeDesired("cm3", volume);
        assertEquals(10000, resultCm3, 0.01);
    }

    @Test
    public void testCertificatWithHeadGeometriqueSpherique(){
        
        HashMap<String, Object> info = new HashMap<>();
        info.put("certificat", "TestCertificatSpherique"); 
        info.put("type de la capacite", "Bac de stockage");
        info.put("lieu des operations", "TestLocation");
        info.put("unite des hauteurs", "cm");
        info.put("unite de volume", "Litres");
        info.put("orientation", "Horizontal");
        info.put("forme de la capacite", "SPHERIQUE");


        HashMap<String, Object> data = new HashMap<>();
        data.put("rayon sphere", 45.0);

        InputStream logo = BaremeArtisan.class.getResourceAsStream("/images/nyettoTankFtLogo.png"); 

        List<Float> abcisse = new ArrayList<>();
        List<Double> ordonne = new ArrayList<>();
        abcisse.add(30f);
        ordonne.add(40.0);       

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
    public void testCertificatWithHeadGeometriqueCubique() {

        HashMap<String, Object> info = new HashMap<>();
        info.put("certificat", "TestCertificatCubique");
        info.put("type de la capacite", "CUBIQUE");
        info.put("lieu des operations", "TestLocation");
        info.put("unite des hauteurs", "cm");
        info.put("unite de volume", "litres");
        info.put("orientation", "Horizontales");
        info.put("forme de la capacite", "CUBIQUE");

        HashMap<String, Object> data = new HashMap<>();
        data.put("longueur", 45);

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
    
    @Test
    public void testCertificatWithHeadVolumetrieSpherique(){
        
        HashMap<String, Object> info = new HashMap<>();
        info.put("certificat", "TestCertificatSpheriqueVol"); 
        info.put("type de la capacite", "Bac de stockage");
        info.put("lieu des operations", "TestLocation");
        info.put("unite des hauteurs", "cm");
        info.put("unite de volume", "Litres");
        info.put("orientation", "Horizontal");
        info.put("forme de la capacite", "SPHERIQUE");

        HashMap<String, Object> data = new HashMap<>();
        data.put("diametre", "45");
        data.put("volume residuel", 0); 

        InputStream logo = BaremeArtisan.class.getResourceAsStream("/images/nyettoTankFtLogo.png"); 

        List<Float> abcisse = new ArrayList<>();
        abcisse.add(30f);
        abcisse.add(80f);
        abcisse.add(130f);
        abcisse.add(199f);
        abcisse.add(211f);
        
        List<Double> ordonne = new ArrayList<>();
        ordonne.add(40.0);
        ordonne.add(95.0);
        ordonne.add(140.0);
        ordonne.add(201.0);
        ordonne.add(250.0);

        try {
            baremeArtisan.certificat_with_head(info, data, logo, "volumetrie", abcisse, ordonne);

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

}
