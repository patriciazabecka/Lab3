import java.awt.*;
import java.awt.Dimension;

/**
 * Created by juliaortheden on 2016-12-08.
 */
public class GameUtil {

    /**
     * Create a new game model.
     */
    public GameTile[][] createGameModel(GameTile[][] gameboardState, Dimension gameboardSize) {
        gameboardSize = Constants.getGameSize();
        gameboardState = new GameTile[gameboardSize.width][gameboardSize.height];

        return gameboardState;
    }
    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    public void setGameboardState(final Position pos, final GameTile tile, final GameTile [][] gameboardState) {
        setGameboardState(pos.getX(), pos.getY(), tile, gameboardState);
    }

    public void setGameboardState(final int x, final int y, final GameTile tile, final GameTile [][]gameboardState) {
        gameboardState [x][y] = tile;
    }







}
