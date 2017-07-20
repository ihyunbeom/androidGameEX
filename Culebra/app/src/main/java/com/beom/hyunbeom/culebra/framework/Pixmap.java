package com.beom.hyunbeom.culebra.framework;

import com.beom.hyunbeom.culebra.framework.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();
}
