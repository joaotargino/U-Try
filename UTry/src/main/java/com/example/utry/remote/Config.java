package com.example.utry.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
//            url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
            url = new URL("https://www.dropbox.com/s/3pv58dcjvr9a1d8/empsoft.json" );

        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
