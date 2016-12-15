import java.awt.*;

/**
 * Created by Patricia on 2016-12-08.
 */

public class GameUtils {
    //får inte ha något tillstånd (instans-/klassvariabler)
    //alla metoder ska vara statiska



    /**
     * Create a new game model.
     *
     * @param gameboardSize A Matrix containing the state of the gameboard.
     *
     * @return gameboardState A gameboard matrix
     */

   public GameTile [][] createGameboard(Dimension gameboardSize) {
        gameboardSize = Constants.getGameSize(); //istället för variabel, detta för att hämta storleken genom metodanrop
        GameTile [][] gameboardState =  new GameTile[gameboardSize.width][gameboardSize.height];
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
    public void setGameboardState(final Position pos, final GameTile tile, GameTile [][] gameboardState ) {
        setGameboardState(pos.getX(), pos.getY(),gameboardState, tile);
    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    public void setGameboardState(final int x, final int y, GameTile [][] gameboardState,
                                     final GameTile tile) {
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
    public GameTile getGameboardState(final int x, final int y, GameTile [][] gameboardState) {return gameboardState[x][y];}




}
