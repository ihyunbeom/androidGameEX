package com.beom.hyunbeom.culebra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.beom.hyunbeom.culebra.framework.Screen;
import com.beom.hyunbeom.culebra.framework.impl.AndroidGame;

public class CulebraGame extends AndroidGame {

    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}
