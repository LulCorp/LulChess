package com.jchess.lul;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jchess.lul.screens.JChessScreen;

public class JChess extends Game {

    public static final int WORLD_HEIGHT = 768;
    public static final int WORLD_WIDTH = 768;
    SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new JChessScreen());
    }
}
