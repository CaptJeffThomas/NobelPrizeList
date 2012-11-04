/*  Jeff Thomas
 *  CMPUT 305 Assn 6: Nobel Guys
 */
package cmput305assn6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class NobelController {
    
    private NobelGUI gui;
    private NobelList list;
    private int i;  //universal position in list
    
    public NobelController(NobelGUI gui){
        this.gui = gui;
        this.list = new NobelList();
        this.i = 0;
        
        gui.addNextButtonListener(new NextListener());
        gui.addPreviousButtonListener(new PreviousListener());
        
        gui.disablePreviousButton();
 
    }
    
    //throws recipient detail and photo up on gui.
    public void fillGUI(){
        this.getPortrait();
        
        NobelRecipient vonnegut = list.get(i);
        gui.setPrizeLabel(vonnegut.getPrize() + " (" + vonnegut.getPrizeYear() + ")");
        gui.setFullNameLabel(vonnegut.getName());
        gui.setGenderLabel(vonnegut.getGender());
        gui.setLifeSpanLabel(vonnegut.getBirthYear() + " - " + vonnegut.getDeathYear());
        gui.setCountryLabel(vonnegut.getCountry());
        gui.setAffiliationLabel(vonnegut.getAffiliation());
        
    }
    
    //starts a new thread that throws recipient portrait onto label
    public void getPortrait(){
            ImageRetriever getIt = new ImageRetriever(gui, list.get(i).getPortraitURL());
            getIt.execute();
    }
    
    //holds logic for previous button
     private class PreviousListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            i--;
            if(i == 0){
                gui.disablePreviousButton();
            }
            if(i == list.size() - 2 ){
                gui.enableNextButton();
            }
            fillGUI();
        }
    }
     
     //holds logic for next button
      private class NextListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           i++;
           if(i == list.size() - 1){
                gui.disableNextButton();
            }
            if(i ==  1){
                gui.enablePreviousButton();
            }
            fillGUI();
        }
    }
   
}
