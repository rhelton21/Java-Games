package com.jga.snake.entity;

import com.jga.snake.config.GameConfig;

public class BodyPart extends EntityBase {

    private boolean justAdded = true;

    public BodyPart() {
        setSize(GameConfig.SNAKE_SIZE, GameConfig.SNAKE_SIZE);
    }

    public boolean isJustAdded() {
        return justAdded;
    }

    public void setJustAdded(boolean justAdded) {
        this.justAdded = justAdded;
    }
}
