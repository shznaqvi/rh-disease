package edu.aku.hassannaqvi.rhdisease.sync;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.ImagesLogContract;
import edu.aku.hassannaqvi.rhdisease.contracts.ImagesLogContract.ImagesLogTable;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class SyncImages extends AsyncTask<Void, Void, String> {

    private static final String TAG = "SyncImages";
    private Context mContext;
    private ProgressDialog pd;


    public SyncImages(Context context) {
        mContext = context;
    }

    public static void longInfo(String str) {
        if (str.length() > 4000) {
            Log.i(TAG, str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i("TAG: ", str);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
      /*  pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Forms");
        pd.show();
        */
    }


    @Override
    protected String doInBackground(Void... params) {
        try {

            String url = MainApp._HOST_URL + ImagesLogTable._URL;

            Log.d(TAG, "doInBackground: URL " + url);
            return downloadUrl(url);
        } catch (IOException e) {
            return "Unable to upload data. Server may be down.";
        }
    }
    public String getStringImage(Bitmap bmp) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] imageBytes = baos.toByteArray();
        String encodedImage = Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return encodedImage;

    }
    private void updateProfile(final String image) {
        // Tag used to cancel the request
        String tag_string_req = "req_register";

//        String url = MainApp._HOST_URL + ImagesLogTable._URL;
        String url = "http://10.1.42.101/testapi/" + ImagesLogTable._URL;
        StringRequest strReq = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {


                try {
                    JSONObject jObj = new JSONObject(response);
                   boolean error = jObj.getBoolean("status");
//                    message = jObj.getString("message");
                    if (error) {



                    } else {


                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {

            @Override
            protected Map<String
                    , String> getParams() {
                // Posting params to register url
                Map<String, String> params = new HashMap<String, String>();
                params.put("image", image);

                return params;
            }

        };
        int socketTimeout = 60000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        strReq.setRetryPolicy(policy);
        RequestQueue requestQueue = Volley.newRequestQueue(mContext);
        requestQueue.add(strReq);
        // Adding request to request queue
//        AppController.getInstance().addToRequestQueue(strReq, tag_string_req);
    }

   /* private void SendImage( final String[] image, final String[] name) {
        String url = MainApp._HOST_URL + ImagesLogTable._URL;
        final StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("upload",response);
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
    },
            new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
           Log.e(TAG, "No internet connection");
        }
    }) {
        @Override
        protected Map<String, String> getParams() throws AuthFailureError {

            Map<String, String> params = new Hashtable<String, String>();
            for (String img:
                 image) {
                params.put("image", img);
            } for (String img:
                 name) {
                params.put("name", img);
            }

            return params;
        }
    };
    {
        int socketTimeout = 30000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(policy);
        RequestQueue requestQueue = Volley.newRequestQueue(mContext);
        requestQueue.add(stringRequest);
    }
}*/
    private String downloadUrl(String myurl) throws IOException {
        String line = "No Response";

        DatabaseHelper db = new DatabaseHelper(mContext);
        Collection<ImagesLogContract> images = db.getUnsyncedImages();

        Log.d(TAG, String.valueOf(images.size()));

        if (images.size() > 0) {

        //    HttpURLConnection connection = null;
            try {
                String request = myurl;
                //String request = "http://10.1.42.30:3000/Forms";

                URL url = new URL(request);
               /* connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                int HttpResult = connection.getResponseCode();
                if (HttpResult == HttpURLConnection.HTTP_OK) {
                    JSONArray jsonSync = new JSONArray();
                    connection = (HttpURLConnection) url.openConnection();

                    connection.setDoOutput(true);
                    connection.setDoInput(true);
                    connection.setInstanceFollowRedirects(false);
                    connection.setRequestMethod("POST");
//                    connection.setRequestProperty("Content-Type", "application/json");
                    connection.setRequestProperty("charset", "utf-8");
                    connection.setUseCaches(false);
                    connection.connect();


                    DataOutputStream wr = new DataOutputStream(connection.getOutputStream());

//            pd.setMessage("Total Forms: " );*/
                    String encodedString;

                    for (ImagesLogContract imglc : images) {
                        //if (fc.getIstatus().equals("1")) {
//                        jsonSync.put(imglc.toJSONObject());
                        //}
                       String imagename = imglc.getimagename()+".jpeg";
                        File sdCard = Environment.getExternalStorageDirectory();
                        File directory = new File (sdCard.getAbsolutePath() +File.separator+ MainApp.FILENAME+File.separator+"EldonCardImages"+File.separator);
                        File file = new File(directory, imagename); //or any other format supported

                        FileInputStream streamIn = new FileInputStream(file);

                        Bitmap bitmap = BitmapFactory.decodeStream(streamIn); //This gets the image
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();

                        bitmap.compress(Bitmap.CompressFormat.JPEG, 60, stream);
                        byte[] byte_arr = stream.toByteArray();
                        // Encode Image to String
                        encodedString = Base64.encodeToString(byte_arr, 0);

                        updateProfile(encodedString);
                        streamIn.close();
                    }
                  /*  wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
                    longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
                    wr.flush();


                    BufferedReader br = new BufferedReader(new InputStreamReader(
                            connection.getInputStream(), "utf-8"));
                    StringBuffer sb = new StringBuffer();

                    while ((line = br.readLine()) != null) {
                        sb.append(line + "\n");
                    }
                    br.close();

                    System.out.println("" + sb.toString());
                    return sb.toString();
                } else {
                    System.out.println(connection.getResponseMessage());
                    return connection.getResponseMessage();
                }*/
            } catch (MalformedURLException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            }
        } else {
            return "No new records to sync";
        }
        return line;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        int sSynced = 0;
        int sDuplicate = 0;
        String sSyncedError = "";
        JSONArray json = null;
        try {
            json = new JSONArray(result);
            DatabaseHelper db = new DatabaseHelper(mContext);
            for (int i = 0; i < json.length(); i++) {
                JSONObject jsonObject = new JSONObject(json.getString(i));

                if (jsonObject.getString("status").equals("1") && jsonObject.getString("error").equals("0")) {
                    db.updateSyncedImages(jsonObject.getString("id"));  // UPDATE SYNCED
                    sSynced++;
                } else if (jsonObject.getString("status").equals("2") && jsonObject.getString("error").equals("0")) {
                    db.updateSyncedImages(jsonObject.getString("id")); // UPDATE DUPLICATES
                    sDuplicate++;
                } else {
                    sSyncedError += "\nError: " + jsonObject.getString("message");
                }
            }
            Toast.makeText(mContext, sSynced + " Images synced." + String.valueOf(json.length() - sSynced) + " Errors: " + sSyncedError, Toast.LENGTH_SHORT).show();
/*
            pd.setMessage(sSynced + " Images synced." + String.valueOf(json.length() - sSynced) + " Errors: " + sSyncedError);
            pd.setTitle("Done uploading Images");
            pd.show();*/
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "Failed Sync " + result, Toast.LENGTH_SHORT).show();
/*
            pd.setMessage(result);
            pd.setTitle("Images Sync Failed");
            pd.show();*/
        }
    }

}