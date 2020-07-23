package com.jchess.lul.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.jchess.lul.JChess;

public class JChessScreen implements Screen {

    JChess chess;
    Texture background;

    @Override
    public void show() {
        chess = new JChess();
        background = new Texture("");
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
