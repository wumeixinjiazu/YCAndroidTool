package com.yc.catonhelperlib.fps;

import android.os.Bundle;

public class PageIntent {
    public static final int MODE_NORMAL = 0;
    public static final int MODE_SINGLE_INSTANCE = 1;
    public Class<? extends BaseFloatPage> targetClass;
    public Bundle bundle;
    public String tag;
    public int mode = 0;

    public PageIntent() {
    }

    public PageIntent(Class<? extends BaseFloatPage> targetClass) {
        this.targetClass = targetClass;
    }
}
