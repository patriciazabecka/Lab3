import java.awt.*;
import java.awt.Dimension;

/**
 * Created by juliaortheden on 2016-12-08.
 */
public class GameUtil {

    /** A Matrix containing the state of the gameboard. */
    //private final GameTile[][] gameboardState;

    /** The size of the state matrix. */
   // private final Dimension gameboardSize = Constants.getGameSize();

    /**
     * Create a new game model.
     */
    public static GameTile[][] createGameModel(GameTile[][] gameboardState, Dimension gameboardSize) {
        gameboardSize = Constants.getGameSize();
        gameboardState = new GameTile[gameboardSize.width][gameboardSize.height];

        return gameboardState;
    }

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     */
    public GameTile getGameboardState(final Position pos, GameTile[][] gameboardState) {return getGameboardState(pos.getX(), pos.getY(), gameboardState);}

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    public static void setGameboardState(final Position pos, final GameTile tile, final GameTile [][] gameboardState) {
        setGameboardState(pos.getX(), pos.getY(), tile, gameboardState);
    }

    public static void setGameboardState(final int x, final int y, final GameTile tile, final GameTile [][]gameboardState) {
        gameboardState [x][y] = tile;
    }
    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     */

    public static GameTile getGameboardState(final int x, final int y, GameTile[][] gameboardState){return gameboardState[x][y]; }

    /**
     * Returns the size of the gameboard.
     */
    public static Dimension getGameboardSize(Dimension gameboardSize) { return Constants.getGameSize();}







}

