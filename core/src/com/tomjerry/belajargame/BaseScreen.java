package com.tomjerry.belajargame;

import com.badlogic.gdx.Screen;

public abstract class BaseScreen implements Screen {

    protected MainGame1 game;

    public BaseScreen(MainGame1 game) {
        this.game = game;
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
