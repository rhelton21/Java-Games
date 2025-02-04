package com.jga.snake.entity;

import com.jga.snake.config.GameConfig;


public class SnakeHead extends EntityBase {

    // == constructors ==
    public SnakeHead() {
        setSize(GameConfig.SNAKE_SIZE, GameConfig.SNAKE_SIZE);
    }

    // == public methods ==
    public void updateX(float amount) {
        x += amount;
        updateBounds();
    }

    public void updateY(float amount) {
        y += amount;
        updateBounds();
    }
}
