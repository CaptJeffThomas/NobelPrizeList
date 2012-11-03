
package cmput305assn6;




public class NobelController {
    
    private NobelGUI gui;
    private NobelList list;
    private int i;  //universal position in list
    
    public NobelController(NobelGUI gui){
        this.gui = gui;
        this.list = new NobelList();
        this.i = 0;
    }
    
    public void getPortrait(){
            ImageRetriever getIt = new ImageRetriever(list.get(i).getURL());
            getIt.execute();
    }
    

}
