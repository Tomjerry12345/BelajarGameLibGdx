package com.tomjerry.belajargame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MainGame extends ApplicationAdapter {

	private Texture bola , rintangan1;
	private TextureRegion regionDuri;
	private SpriteBatch batch;
//	private int width , height;
	private int widthBola , heightBola;

	@Override
	public void create() {

		ProcessorInput p = new ProcessorInput();
		Gdx.input.setInputProcessor(p);

		bola = new Texture("bola.png");
		rintangan1 = new Texture("rintangan1.png");
		batch = new SpriteBatch();

		regionDuri = new TextureRegion(rintangan1 , 0 , 0 , 52 , 128);

//		width = Gdx.graphics.getWidth();
//	    height = Gdx.graphics.getHeight();

	    widthBola = bola.getWidth();
	    heightBola = bola.getHeight();

	}

	@Override
	public void dispose() {
		bola.dispose();
		batch.dispose();
		rintangan1.dispose();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1 , 0 , 0.5f , 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (Gdx.input.justTouched()) {
			System.out.println("Kyboard Di tekan");
		}

		batch.begin();
		batch.draw(bola , 50 , 0);
		batch.draw(rintangan1 , 250 , 0 , 52 , 128 );
//		batch.draw(bola , width - widthBola , 0);
//		batch.draw(bola , 0 , height - heightBola);
//		batch.draw(bola , width - widthBola , height - heightBola);
//		batch.draw(bola , 100 , 100 , 300 , 250);
		batch.end();

	}
}
