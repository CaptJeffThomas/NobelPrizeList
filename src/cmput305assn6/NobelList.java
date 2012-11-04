/*  Jeff Thomas
 *  CMPUT 305 Assn 6: Nobel Guys
 */

package cmput305assn6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NobelList {
    
    private ArrayList<NobelRecipient> list;
    
    //creates new list with the parsed input from file
    public NobelList(){
            list = new ArrayList<>();
            Scanner input = new Scanner(NobelList.class.getResourceAsStream("nobel.txt"));
            NobelRecipient heller = new NobelRecipient();
             while(input.hasNextLine()) {
                String next = input.nextLine();
                
                //blank lines signify a new recipient will begin with the next line.  add our current one to the list and then wipe the slate clean
                if (next.equals("")){
                    list.add(heller);
                    heller = new NobelRecipient();
                }
                
                //BEGIN THE AMATUER FILE PARSING!
                if (next.startsWith("year: ")){
                    heller.setPrizeYear(next.substring(6));
                }
                                
                if (next.startsWith("prize: ")){
                    heller.setPrize(next.substring(7));
                }
                                
                if (next.startsWith("name: ")){
                    heller.setName(next.substring(6));
                }
                                
                if (next.startsWith("gender:")){
                    heller.setGender(next.substring(8));
                }
                                
                if (next.startsWith("photo: ")){
                    heller.setPortraitURL(next.substring(7));
                }
                                
                if (next.startsWith("country: ")){
                    heller.setCountry(next.substring(9));
                }
                                
                if (next.startsWith("affiliation: ")){
                    heller.setAffiliaton(next.substring(13));
                }
                                
                if (next.startsWith("birthyear: ")){
                    heller.setBirthYear(next.substring(11));
                }
                                
                if (next.startsWith("deathyear: ")){
                    heller.setDeathYear(next.substring(11));
                }   
                
             }   
             input.close();
    }
    
    public NobelRecipient get(int i){
        return list.get(i);
    }
    public int size(){
        return list.size();
    }
    
    
    
}
