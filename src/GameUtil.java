import java.awt.*;
import java.awt.Dimension;

/**
 * Created by juliaortheden on 2016-12-08.
 */
public abstract class GameUtil implements GameModel{

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
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *
     */
    public void setGameboardState(final Position pos, final GameTile tile) {
        setGameboardState(pos.getX(), pos.getY(), tile);
    }

    public void setGameboardState(final int x, final int y, final GameTile tile) {
        gameboardState [x][y] = tile;
    }


    @Override
    public void gameUpdate(int lastKey) throws GameOverException {

    }

    @Override
    public Dimension getGameboardSize() {
        return this.gameboardSize;
    }

    @Override
    public GameTile getGameboardState(Position pos) {
        return getGameboardState(pos.getX(), pos.getY());
    }

    @Override
    public GameTile getGameboardState(int x, int y) {
        return this.gameboardState[x][y];
    }
}

