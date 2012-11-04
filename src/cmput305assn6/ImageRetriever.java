/*  Jeff Thomas
 *  CMPUT 305 Assn 6: Nobel Guys
 */

package cmput305assn6;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;


public class ImageRetriever extends SwingWorker<ImageIcon, Object> { 
   
    private BufferedImage portrait;
    private URL url;
    private NobelGUI gui;
    
    //pulls image off the web and returns it if found.
    public ImageRetriever(NobelGUI gui, String url){
        this.gui = gui;
        try {
            this.url = new URL(url);
        } 
        catch (MalformedURLException e) {
            
        }
    }
    
    
    //reads our image from provided URL or, if not found, returns the not found local image;
    @Override
    protected ImageIcon doInBackground(){
        try {
           portrait = ImageIO.read(url);
        } catch (IOException e) {
            try {
                portrait = ImageIO.read(NobelList.class.getResourceAsStream("image-not-found.gif"));
            } catch (IOException ex) {
                Logger.getLogger(ImageRetriever.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return new ImageIcon(portrait);
       
    }

    
    @Override
    protected void done() {
        try {
            gui.setPortrait(get());
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(ImageRetriever.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

}
