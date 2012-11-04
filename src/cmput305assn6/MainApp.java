// Jeff Thomas
// CMPUT 305 Assn 6 

package cmput305assn6;


import javax.swing.SwingUtilities;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                NobelGUI gui = new NobelGUI();
                NobelController controller = new NobelController(gui);
                controller.fillGUI();
                gui.setVisible(true);
            }
        });
    }
}