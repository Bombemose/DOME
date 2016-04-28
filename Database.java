import java.util.ArrayList;

/**
 * The database class provides a facility to store entertainment
 * item objects. A list of all items can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
        populateDatabase();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(Item item : items) {
            item.print();
            System.out.println();   // empty line between items
        }
    }
    
    /**
     * add default items to the database
     */
    private void populateDatabase() {
        CD aCD;
        DVD aDVD;
        VideoGame aVideoGame;
        
        aCD = new CD("Brothers in Arms", "Dire Straits", 7, 73);
        aCD.setComment("Min allerførste CD");
        aCD.setOwn(true);
        addItem(aCD);
        
        aCD = new CD("Converts in China", "Jean Michel Jarre", 12, 121);
        aCD.setComment("Dobbelt CD");
        aCD.setOwn(true);
        addItem(aCD);
        
        aDVD = new DVD("The 6th sense", "M. Night Shaylabibam", 137);
        addItem(aDVD);
        
        aVideoGame = new VideoGame("World of Warcraft", "PC", 10, 0);
        addItem(aVideoGame);
    }
}
