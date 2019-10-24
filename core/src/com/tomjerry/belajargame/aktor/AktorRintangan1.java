package com.tomjerry.belajargame.aktor;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class AktorRintangan1 extends Actor {

    private TextureRegion rintangan1;

    public AktorRintangan1(TextureRegion rintangan1) {
        this.rintangan1 = rintangan1;
    }

    @Override
    public void act(float delta) {
        setX(getX() - 50 * delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(rintangan1 , getX() , getY());
    }
}
