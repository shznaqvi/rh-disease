package edu.aku.hassannaqvi.rhdisease.otherClasses;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

import edu.aku.hassannaqvi.rhdisease.core.MainApp;

/**
 * Created by ramsha.ahmed on 4/23/2018.
 */

public class NetworkUtils {
    public static URL buildUrl(String getApiUrl) {
        Uri builtUri = Uri.parse(MainApp._HOST_URL).buildUpon()
                .appendPath(getApiUrl)
                .build();

        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }

}
