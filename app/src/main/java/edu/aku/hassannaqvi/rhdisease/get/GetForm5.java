package edu.aku.hassannaqvi.rhdisease.get;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import edu.aku.hassannaqvi.rhdisease.contracts.rh_resultsContract.RH_ResultsTable;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class GetForm5 extends AsyncTask<String, String, String> {
    private final String TAG = "GetForm5()";
    HttpURLConnection urlConnection;
    private Context mContext;
    private ProgressDialog pd;

    public GetForm5(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Syncing Rh Results");
        pd.setMessage("Getting connected to server...");
        pd.show();
    }

    @Override
    protected String doInBackground(String... strings) {
        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(MainApp._HOST_URL + RH_ResultsTable._URL);
            urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line;
                while ((line = reader.readLine()) != null) {
                    Log.i(TAG, "form In: " + line);
                    result.append(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();


        } finally {
            urlConnection.disconnect();
        }


        return result.toString();
    }

    @Override
    protected void onPostExecute(String result) {
        //Do something with the JSON string

        String json = result;
        //json = json.replaceAll("\\[", "").replaceAll("\\]","");
        Log.d(TAG, result);
        if (json.length() > 0) {
            DatabaseHelper db = new DatabaseHelper(mContext);
            try {

                JSONArray jsonArray = new JSONArray(json);
                db.syncForm5(jsonArray);
                pd.setMessage("Received: " + jsonArray.length());
                pd.show();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            // db.getAllUsers();
        } else {
            pd.setMessage("Received: " + json.length() + "");
            pd.show();
        }
    }
}
