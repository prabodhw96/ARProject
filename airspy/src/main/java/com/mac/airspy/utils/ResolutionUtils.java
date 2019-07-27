package com.mac.airspy.utils;

import android.content.Context;

public class ResolutionUtils {
    public static float dpToPx(Context ctx, int dp) {
        return ctx.getResources().getDisplayMetrics().density * dp;
    }
}
