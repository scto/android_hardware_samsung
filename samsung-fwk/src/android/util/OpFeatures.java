package android.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.BitSet;

public final class OpFeatures {

    private static String LOG_TAG = OpFeatures.class.getSimpleName();

    private static final BitSet sFeatures = new BitSet();

    public static boolean isSupport(int... features) {
        return true;
    }
}
