package com.js.rate;

import android.content.Context;
import android.graphics.Typeface;

public class FontUntil {
    public static Typeface getTypeface(String name, Context context) {
        return Typeface.createFromAsset(context.getAssets(), name);
    }
}
