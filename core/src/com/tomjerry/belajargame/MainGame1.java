package com.tomjerry.belajargame;

import com.badlogic.gdx.Game;

public class MainGame1 extends Game {
    @Override
    public void create() {

        setScreen(new MainGameScreen(this));

    }
}
