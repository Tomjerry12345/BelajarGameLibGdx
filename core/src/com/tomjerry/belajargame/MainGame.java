package com.tomjerry.belajargame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends ApplicationAdapter {

	private Texture bola;
	private SpriteBatch batch;
	private int width , height;
	private int widthBola , heightBola;

	@Override
	public void create() {

		bola = new Texture("bola.png");
		batch = new SpriteBatch();

		width = Gdx.graphics.getWidth();
	    height = Gdx.graphics.getHeight();

	    widthBola = bola.getWidth();
	    heightBola = bola.getHeight();

	}

	@Override
	public void dispose() {
		bola.dispose();
		batch.dispose();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1 , 0 , 0.5f , 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(bola , 0 , 0);
		batch.draw(bola , width - widthBola , 0);
		batch.draw(bola , 0 , height - heightBola);
		batch.draw(bola , width - widthBola , height - heightBola);
		batch.draw(bola , 100 , 100 , 300 , 250);
		batch.end();

	}
}
