package com.jga.snake.config;

public class GameConfig {

    // == constants ==
    private static final float Y_OFFSET = 2;

    public static final float WIDTH = 800f; // pixels
    public static final float HEIGHT = 480f; // pixels

    public static final float HUD_WIDTH = 800f; // world units
    public static final float HUD_HEIGHT = 480f; // world units

    public static final float WORLD_WIDTH = 25f; // world units
    public static final float WORLD_HEIGHT = 15f; // world units

    public static final float WORLD_CENTER_X = WORLD_WIDTH / 2f; // world units
    public static final float WORLD_CENTER_Y = WORLD_HEIGHT / 2f; // world units

    public static final float SNAKE_SIZE = 1; // world units
    public static final float MOVE_TIME = 0.2f;
    public static final float SNAKE_SPEED = 1f; // world units

    public static final float COIN_SIZE = 1; // world units
    public static final int COIN_SCORE = 20;

    public static final float MAX_Y = WORLD_HEIGHT - Y_OFFSET;

    private GameConfig() {
    }
}
