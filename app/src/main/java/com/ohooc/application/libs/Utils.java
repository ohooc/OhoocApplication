package com.ohooc.application.libs;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

import androidx.core.graphics.drawable.DrawableCompat;

/**
 * Created by Alexander Pataridze
 */

class Utils {
    static float getViewWeight(View view) {
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view.getLayoutParams();
        return lp.weight;
    }

    static void setViewWeight(View view, float weight){
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view.getLayoutParams();
        lp.weight = weight;
        view.setLayoutParams(lp);
    }

    static void setViewWidth(View view, int width){
        view.getLayoutParams().width = width;
        view.requestLayout();
    }

    static void setViewHeight(View view, int height){
        view.getLayoutParams().height = height;
        view.requestLayout();
    }

    static Drawable setTint(Drawable drawable, int color) {
        drawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawable, color);
        return drawable.mutate();
    }
}
