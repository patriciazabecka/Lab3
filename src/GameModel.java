import java.awt.Dimension;

/**
 * Common Interface for all game model classes.
 * 
 * Constructors of subclasses should initiate matrix elements and additional,
 * game-dependent fields.
 */
public interface GameModel {

	//Klassvariabler(då static, kan ej ha instanser av interface), ärvs automatiskt av klasser som implementerar detta.

	/** The size of the state matrix. */
	Dimension gameboardSize = Constants.getGameSize();


	/**
	 * This method is called repeatedly so that the game can update it's state.
	 * 
	 * @param lastKey
	 *            The most recent keystroke.
	 */
	public void gameUpdate(int lastKey) throws GameOverException;

    /**
     * Returns the size of the gameboard.
     */
    public Dimension getGameboardSize();

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     */
    public GameTile getGameboardState(final Position pos);

    public GameTile getGameboardState(final int x, final int y);

	/**
	 * Returns the GameTile in logical position (x,y) of the gameboard.
	 *
	 * @param pos
	 *            The position in the gameboard matrix.
	 */


}