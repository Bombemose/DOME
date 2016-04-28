/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class VideoGame extends Item
{
    private String platform;
    private int numberOfPlayers;

    /**
     * Initialize the Videogam.
     * @param theTitle The title of the videogame.
     * @param thePlatform The platform of the videogame.
     * @param theNumberOfPlayers The number of players for the videogame.
     * @param time The playing time of the Videogame.
     */
    public VideoGame(String theTitle, String thePlatform, int theNumberOfPlayers, int time)
    {
        super(theTitle, time);
        platform = thePlatform;
        numberOfPlayers = theNumberOfPlayers;
    }

    /**
     * @return The artist for this CD.
     */
    public String getPlatform()
    {
        return platform;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfPlayers()
    {
        return numberOfPlayers;
    }
    
    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {

        System.out.println("    " + platform);
        
    }
}
