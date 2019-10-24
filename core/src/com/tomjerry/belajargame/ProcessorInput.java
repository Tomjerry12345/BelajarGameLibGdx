package com.tomjerry.belajargame;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;

public class ProcessorInput extends InputAdapter {

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("Screen x : " + screenX );
        System.out.println("Screen y : " + screenY);
        System.out.println("Pointer : " + pointer);
        System.out.println("Button : " + button);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }
}
