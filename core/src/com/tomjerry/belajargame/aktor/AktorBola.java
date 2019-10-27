package com.tomjerry.belajargame.aktor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class AktorBola extends Actor {

    private Texture aktor;

    private boolean alive;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public AktorBola(Texture aktor) {

        this.aktor = aktor;
        this.alive = true;

        setSize(aktor.getWidth() , aktor.getHeight());

    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(aktor , getX() , getY());
    }
}
