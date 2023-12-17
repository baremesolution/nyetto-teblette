package nyettotank2.utilitaires;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Cynthia
 */
public class ConfigureImageButton {

    private static InputStream logo;
    private static InputStream signature;

    // Méthode pour configurer un bouton pour sélectionner une image et l'afficher sur un JLabel
    public File showImage(JButton button, JLabel label, int width, int height, boolean imageAlreadySelected) throws MalformedURLException, IOException {
        if (imageAlreadySelected) {
            // Si une image a déjà été sélectionnée, retourner null pour éviter de montrer la fenêtre de sélection
            return null;
        }

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Fichiers images", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            // Redimensionnement de l'image
            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            // Affectation de l'image redimensionnée à l'icône du JLabel
            label.setIcon(new ImageIcon(scaledImage));
            if (button.getText().equals("Ajouter un logo")) {
                logo = fileChooser.getSelectedFile().toURI().toURL().openStream();

                String fileName = file.getName();
                String[] chs = fileName.split(".");
                System.out.println("vous avez cliquez sur le bouton  ========  " + fileName + " avec longueur ======= " + fileName.length());

                //fileName = chs[0] + ""+ (new Date()).getTime() + "." + chs[1];
                logoName = "logo/" + (new Date()).getTime() + fileName;
                Path path_file = Files.createFile(Paths.get(logoName));
                Files.copy(logo, path_file, StandardCopyOption.REPLACE_EXISTING);

            } else {
                signature = fileChooser.getSelectedFile().toURI().toURL().openStream();
                String fileName = file.getName();
                String[] chs = fileName.split(".");
                //fileName = chs[0] + ""+ (new Date()).getTime() + "." + chs[1];
                signatureName = "signature/" + (new Date()).getTime() + fileName;
                Path path_file = Files.createFile(Paths.get(signatureName));
                Files.copy(signature, path_file, StandardCopyOption.REPLACE_EXISTING);
            }
            return file;
        }
        return null;
    }

    public void saveImage(File image, String nomImage) throws IOException {
        if (image != null) {
            String destinationDirectory = "D:\\IPE Sarl\\Project repo\\images\\";

            Path sourceImagePath = image.toPath();
            Path destinationImagePath = Paths.get(destinationDirectory + nomImage);
            Files.move(sourceImagePath, destinationImagePath, StandardCopyOption.REPLACE_EXISTING);
        }

    }
    
    public static void sterchImage(JLabel label)  {  
        Icon icon = label.getIcon();
        ImageIcon imageIcon = (ImageIcon) icon;
        Image image = imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    }

    public static String logoName = "";
    public static String signatureName = "";

}
