import java.awt.Dimension;

/**
 * Common superclass for all game model classes.
 * 
 * Constructors of subclasses should initiate matrix elements and additional,
 * game-dependent fields.
 */
public interface GameModel {


	/** The size of the state matrix. */
	Dimension gameboardSize = Constants.getGameSize();

	/** A Matrix containing the state of the gameboard. */
	GameTile[][] gameboardState = new GameTile[gameboardSize.width][gameboardSize.height];

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
    public Dimension getGameboardSize(Dimension gameboardSize);

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     */
    public GameTile getGameboardState(final Position pos);

    public GameTile getGameboardState(final int x, final int y);

}