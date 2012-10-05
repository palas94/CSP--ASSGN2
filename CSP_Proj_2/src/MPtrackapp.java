
import prefuse.data.Table;
import prefuse.data.io.DelimitedTextTableReader;
import prefuse.util.ui.JPrefuseApplet;


public class MPtrackapp extends JPrefuseApplet {

    public void init() {
        // load the data
        Table t = null;
        try {
            t = new DelimitedTextTableReader().readTable("/File4.txt");
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(1);
        }
        this.getContentPane().add(new two(t));
    }
    
} // end of class Congress