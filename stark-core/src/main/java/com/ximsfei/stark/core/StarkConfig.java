package com.ximsfei.stark.core;

import android.content.Context;

/**
 * All fields will be automatically generated by stark-gradle. DO NOT MODIFY.
 */
public class StarkConfig {
    public static String BUILD_HASH;

    public static void init(Context context) {
        try {
            Class.forName(context.getPackageName() + ".StarkConfig");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
