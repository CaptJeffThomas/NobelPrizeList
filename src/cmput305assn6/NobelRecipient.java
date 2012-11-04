/*
 *  Jeff Thomas To change this template, choose Tools | Templates
 *  Jeff Thomas and open the template in the editor.
 */

package cmput305assn6;


public class NobelRecipient {

       // deathYear, although lacking in imagination, is a fine complement to birthYear soooooo...yeah
    private String prizeYear, prize, name, gender, birthYear, deathYear, country, affiliation, portraitURL;
    
    public NobelRecipient(){
        prizeYear = "unknown";
        prize = "unknown";
        name = "unknown";
        gender = "unknown";
        birthYear  = "unknown";
        deathYear  = "unknown";
        country  = "unknown";
        affiliation  = "unknown";
        portraitURL = "unknown";
    }
    
    public String getPrizeYear() {
        return this.prizeYear;
    }
    public void setPrizeYear(String s){
        this.prizeYear = s;
    }
    
    public String getPrize() {
         return this.prize.toUpperCase();
    }
    public void setPrize(String s){
        this.prize = s;
    }
    
     public String getName() {
         return this.name;
    }
    public void setName(String s){
        this.name = s;
    }
    
     public String getGender() {
         return this.gender;
    }
    public void setGender(String s){
        this.gender = s;
    }
    
    public String getBirthYear() {
         return this.birthYear;
    }
    public void setBirthYear(String s){
        this.birthYear = s;
    }
    
    public String getDeathYear() {
         return this.deathYear;
    }
    public void setDeathYear(String s){
        this.deathYear = s;
    }
    
    public String getCountry() {
         return this.country;
    }
    public void setCountry(String s){
        this.country = s;
    }
    
    public String getAffiliation() {
         return this.affiliation;
    }
    public void setAffiliaton(String s){
        this.affiliation = s;
    }
    
    public String getPortraitURL() {
         return this.portraitURL;
    }
    public void setPortraitURL(String s){
        this.portraitURL = s;
    }

}
