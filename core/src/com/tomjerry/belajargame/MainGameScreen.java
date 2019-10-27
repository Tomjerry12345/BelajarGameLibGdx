package com.tomjerry.belajargame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.tomjerry.belajargame.aktor.AktorBola;
import com.tomjerry.belajargame.aktor.AktorRintangan1;

public class MainGameScreen extends BaseScreen {

    private AktorBola aktorBola;
    private AktorRintangan1 aktorRintangan1;
    private Stage stage;
    private Texture bola , rintangan1;
    private TextureRegion regionRintangan1;

    public MainGameScreen(MainGame1 game) {
        super(game);
        bola = new Texture("bola.png");
        rintangan1 = new Texture("rintangan1.png");
        regionRintangan1 = new TextureRegion(rintangan1 , 0 , 64 , 128 , 64);
    }

    @Override
    public void show() {
        stage = new Stage();
        stage.setDebugAll(true);
        aktorBola = new AktorBola(bola);
        aktorRintangan1 = new AktorRintangan1(regionRintangan1);
        stage.addActor(aktorBola);
        stage.addActor(aktorRintangan1);

        aktorBola.setPosition(20 , 100);
        aktorRintangan1.setPosition(400 , 100);
    }

    @Override
    public void hide() {
        stage.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f , 0.5f , 0.8f , 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        tabrakan();
        stage.draw();
    }

    private void tabrakan() {
        if (aktorBola.isAlive() && (aktorBola.getX() + aktorBola.getWidth()) > aktorRintangan1.getX()) {
            System.out.println("Bertabrkan");
            aktorBola.setAlive(false);
        }
    }

    @Override
    public void dispose() {
        bola.dispose();
    }
}
