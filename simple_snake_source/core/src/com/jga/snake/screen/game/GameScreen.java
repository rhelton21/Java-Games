package com.jga.snake.screen.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.jga.snake.SimpleSnakeGame;
import com.jga.snake.assets.AssetDescriptors;
import com.jga.snake.collision.CollisionListener;
import com.jga.snake.common.GameManager;
import com.jga.snake.screen.menu.MenuScreen;


public class GameScreen extends ScreenAdapter {

    // == attributes ==
    private final SimpleSnakeGame game;
    private final AssetManager assetManager;
    private final CollisionListener listener;

    private GameController controller;
    private GameRenderer renderer;

    private Sound coinSound;
    private Sound loseSound;

    // == constructors ==
    public GameScreen(SimpleSnakeGame game) {
        this.game = game;
        assetManager = game.getAssetManager();

        listener = new CollisionListener() {
            @Override
            public void hitCoin() {
                coinSound.play();
            }

            @Override
            public void lose() {
                loseSound.play();
            }
        };
    }

    // == public methods ==
    @Override
    public void show() {
        coinSound = assetManager.get(AssetDescriptors.COIN_SOUND);
        loseSound = assetManager.get(AssetDescriptors.LOSE_SOUND);

        controller = new GameController(listener);
        renderer = new GameRenderer(game.getBatch(), assetManager, controller);
    }

    @Override
    public void render(float delta) {
        controller.update(delta);
        renderer.render(delta);

        if (GameManager.INSTANCE.isGameOver()) {
            game.setScreen(new MenuScreen(game));
        }
    }

    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void dispose() {
        renderer.dispose();
    }
}
