package edu.aku.hassannaqvi.rhdisease.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.contracts.FetusContract;
import edu.aku.hassannaqvi.rhdisease.contracts.FilledFormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.ImagesLogContract;
import edu.aku.hassannaqvi.rhdisease.contracts.rh_resultsContract;
import edu.aku.hassannaqvi.rhdisease.otherClasses.MothersLst;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class MainApp extends Application {

    public static final String _IP = "43.245.131.159"; // Test PHP server
    public static final Integer _PORT = 8080; // Port - with colon (:)
    public static final String _HOST_URL = "http://" + MainApp._IP + ":" + MainApp._PORT + "/rhd/api/";
    public static final String FILENAME = "DMU-RH_DISEASE";
    /*
        public static final String _IP = "43.245.131.159"; // Test server
    */
    public static final Integer MONTHS_LIMIT = 11;
    public static final Integer DAYS_LIMIT = 29;
    //public static final long MILLISECONDS_IN_5YEAR = (MILLISECONDS_IN_YEAR + MILLISECONDS_IN_YEAR + MILLISECONDS_IN_YEAR + MILLISECONDS_IN_YEAR + MILLISECONDS_IN_YEAR);
    private static final long MINIMUM_DISTANCE_CHANGE_FOR_UPDATES = 1; // in Meters
    private static final long MINIMUM_TIME_BETWEEN_UPDATES = 1000; // in Milliseconds
    private static final int TWENTY_MINUTES = 1000 * 60 * 20;
    private static final int TWO_MINUTES = 1000 * 60 * 2;
    private static final long MILLIS_IN_SECOND = 1000;
    private static final long SECONDS_IN_MINUTE = 60;
    private static final long MINUTES_IN_HOUR = 60;
    private static final long HOURS_IN_DAY = 24;
    public static final long MILLISECONDS_IN_DAY = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;
    private static final long DAYS_IN_YEAR = 365;
    public static final long MILLISECONDS_IN_YEAR = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
    private static final long DAYS_IN_MONTH = 30;
    public static final long MILLISECONDS_IN_MONTH = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_MONTH;
    //public static final long MILLISECONDS_IN_100_YEAR = MILLISECONDS_IN_YEAR * 100;

    private static final long DAYS_IN_13_WEEKS = (7 * 13);
    public static final long MILLISECONDS_IN_13_WEEKS = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_13_WEEKS;

    private static final long DAYS_IN_42_WEEKS = (7 * 42);
    public static final long MILLISECONDS_IN_42_WEEKS = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_42_WEEKS;

    private static final long DAYS_IN_3_WEEKS = (7 * 3);
    public static final long MILLISECONDS_IN_3_WEEKS = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_3_WEEKS;

    public static String deviceId;

    public static Boolean admin = false;
    public static String interviewerCode;
    public static int loginFieldArea = -1;
    public static String child_name = "TEST";
    public static FormsContract fc = new FormsContract();
    public static ImagesLogContract imgl = new ImagesLogContract();
    public static FilledFormsContract ffc = new FilledFormsContract();
    public static rh_resultsContract rh = new rh_resultsContract();
    public static FormsContract fc4 = new FormsContract();
    public static FetusContract fec;
    public static JSONObject f03;
    public static String userName = "0000";
    public static String areaCode;
    public static String participantID;
    //    Total No of members got from Section A
    public static int NoMembersCount = 0;
    public static int NoMaleCount = 0;
    public static int NoFemaleCount = 0;
    public static int NoBoyCount = 0;
    public static int NoGirlCount = 0;

    public static int TotalMembersCount = 0;
    public static int TotalMaleCount = 0;
    public static int TotalFemaleCount = 0;
    public static int TotalBoyCount = 0;
    public static int FetusCount = 1;
    public static int TotalFetusCount = 0;
    public static int versionCode;
    public static String versionName;

    final public static String FORM5 = "5";
    final public static String FORM7 = "7";
    final public static String FORM9 = "9";
    final public static String FORM8 = "8";
    final public static String FORM10 = "10";
    final public static String FORM11 = "11";
    final public static String FORM12 = "12";
    final public static String FORM13 = "13";
    final public static String FORM14 = "14";
    final public static String FORM15 = "15";
    final public static String FORM16 = "16";
    final public static String RH_POSITIVE = "1";
    final public static String RH_NEGATIVE = "2";
    public static boolean F10First = false;
    public static boolean F10Second = false;
    public static boolean F15First = false;
    public static boolean F15Second = false;


    //    Total No of Alive members got from Section B
    public static int currentStatusCount = 0;
    public static int currentDeceasedCheck = 0;
    public static int currentMotherCheck = 0;
    public static List<deadMemberClass> deadMembers = new ArrayList<deadMemberClass>();
    //    Ali
    public static String regionDss = "";
    public static int mm = 1;
    public static int totalChild = 0;
    public static int memFlag = 0;
    public static List<Integer> memClicked;
    public static ArrayList<MothersLst> lstMothers;
    public static int position = 0;
    public static double selectedCHILD = 24;
    public static int selectedPos = -1;
    public static int selectedCh = -1;
    public static List<String> insertMem;
    public static int randID = 1;
    public static Boolean isRsvp = false;
    public static Boolean isHead = false;
    public static List<FormsContract> participantList;
    public static String formType;
    public static boolean eligibleFlag = false;
    protected static LocationManager locationManager;
    Location location;

    public static int monthsBetweenDates(Date startDate, Date endDate) {

        Calendar start = Calendar.getInstance();
        start.setTime(startDate);

        Calendar end = Calendar.getInstance();
        end.setTime(endDate);

        int monthsBetween = 0;
        int dateDiff = end.get(Calendar.DAY_OF_MONTH) - start.get(Calendar.DAY_OF_MONTH);

        if (dateDiff < 0) {
            int borrrow = end.getActualMaximum(Calendar.DAY_OF_MONTH);
            dateDiff = (end.get(Calendar.DAY_OF_MONTH) + borrrow) - start.get(Calendar.DAY_OF_MONTH);
            monthsBetween--;

            if (dateDiff > 0) {
                monthsBetween++;
            }
        }

        monthsBetween += end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
        monthsBetween += (end.get(Calendar.YEAR) - start.get(Calendar.YEAR)) * 12;
        return monthsBetween;
    }

    public static Calendar getCalendarDate(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = sdf.parse(value);
            calendar.setTime(date);
            //   sdf.format(date);
            return calendar;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }

    public static void errorCheck(final Context context, String error) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);
        alertDialogBuilder
                .setMessage(error)
                .setCancelable(false)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public static void errorCountDialog(final Context context, final Activity activity, String error) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);
        alertDialogBuilder
                .setMessage(error)
                .setCancelable(false)
                .setPositiveButton("Discard",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
//                                MainApp.memFlag--;
                                activity.finish();
                            }
                        });
        alertDialogBuilder.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public static void finishActivity(final Context context, final Activity activity) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);
        alertDialogBuilder
                .setMessage("Do you want to Exit??")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                activity.finish();
                            }
                        });
        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public static void endActivity(final Context context, final Activity activity) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);
        alertDialogBuilder
                .setMessage("Do you want to Exit??")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                activity.finish();
                                Intent end_intent = new Intent(context, EndingActivity.class);
                                end_intent.putExtra("check", false);
                                context.startActivity(end_intent);
                            }
                        });
        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public static void setGPS(Activity activity) {
        SharedPreferences GPSPref = activity.getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

//        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("Time", "0");

            if (lat == "0" && lang == "0") {
                Toast.makeText(activity, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(activity, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

            MainApp.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
            MainApp.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
            MainApp.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            AppMain.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            MainApp.fc.setGpsDT(date); // Timestamp is converted to date above

            Toast.makeText(activity, "GPS set", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e("GPS", "setGPS: " + e.getMessage());
        }

    }

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/MBLateefi.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

        deviceId = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);


        // Requires Permission for GPS -- android.permission.ACCESS_FINE_LOCATION
        // Requires Additional permission for 5.0 -- android.hardware.location.gps
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                MINIMUM_TIME_BETWEEN_UPDATES,
                MINIMUM_DISTANCE_CHANGE_FOR_UPDATES,
                new GPSLocationListener() // Implement this class from code

        );


//        Initialize Dead Member List
//        deadMembers = new ArrayList<String>();

    }

    protected void showCurrentLocation() {

        Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        if (location != null) {
            String message = String.format(
                    "Current Location \n Longitude: %1$s \n Latitude: %2$s",
                    location.getLongitude(), location.getLatitude()
            );
            //Toast.makeText(getApplicationContext(), message,
            //Toast.LENGTH_SHORT).show();
        }

    }

    protected boolean isBetterLocation(Location location, Location currentBestLocation) {
        if (currentBestLocation == null) {
            // A new location is always better than no location
            return true;
        }

        // Check whether the new location fix is newer or older
        long timeDelta = location.getTime() - currentBestLocation.getTime();
        boolean isSignificantlyNewer = timeDelta > TWO_MINUTES;
        boolean isSignificantlyOlder = timeDelta < -TWO_MINUTES;
        boolean isNewer = timeDelta > 0;

        // If it's been more than two minutes since the current location, use the new location
        // because the user has likely moved
        if (isSignificantlyNewer) {
            return true;

            // If the new location is more than two minutes older, it must be worse
        } else if (isSignificantlyOlder) {
            return false;
        }

        // Check whether the new location fix is more or less accurate
        int accuracyDelta = (int) (location.getAccuracy() - currentBestLocation.getAccuracy());
        boolean isLessAccurate = accuracyDelta > 0;
        boolean isMoreAccurate = accuracyDelta < 0;
        boolean isSignificantlyLessAccurate = accuracyDelta > 200;

        // Check if the old and new location are from the same provider
        boolean isFromSameProvider = isSameProvider(location.getProvider(),
                currentBestLocation.getProvider());

        // Determine location quality using a combination of timeliness and accuracy
        if (isMoreAccurate) {
            return true;
        } else if (isNewer && !isLessAccurate) {
            return true;
        } else if (isNewer && !isSignificantlyLessAccurate && isFromSameProvider) {
            return true;
        }
        return false;
    }

    /**
     * Checks whether two providers are the same
     */
    private boolean isSameProvider(String provider1, String provider2) {
        if (provider1 == null) {
            return provider2 == null;
        }
        return provider1.equals(provider2);
    }

    public static class deadMemberClass {

        int position;
        String DSSId;

        public deadMemberClass(int i, String s) {
            position = i;
            DSSId = s;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int i) {
            position = i;
        }

        public void setDSSId(String id) {
            DSSId = id;
        }

    }

    public class GPSLocationListener implements LocationListener {
        public void onLocationChanged(Location location) {

            SharedPreferences sharedPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();

            String dt = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(sharedPref.getString("Time", "0"))).toString();

            Location bestLocation = new Location("storedProvider");
            bestLocation.setAccuracy(Float.parseFloat(sharedPref.getString("Accuracy", "0")));
            bestLocation.setTime(Long.parseLong(sharedPref.getString(dt, "0")));
            bestLocation.setLatitude(Float.parseFloat(sharedPref.getString("Latitude", "0")));
            bestLocation.setLongitude(Float.parseFloat(sharedPref.getString("Longitude", "0")));

            if (isBetterLocation(location, bestLocation)) {
                editor.putString("Longitude", String.valueOf(location.getLongitude()));
                editor.putString("Latitude", String.valueOf(location.getLatitude()));
                editor.putString("Accuracy", String.valueOf(location.getAccuracy()));
                editor.putString("Time", String.valueOf(location.getTime()));
                String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(String.valueOf(location.getTime()))).toString();
//                Toast.makeText(getApplicationContext(),
//                        "GPS Commit! LAT: " + String.valueOf(location.getLongitude()) +
//                                " LNG: " + String.valueOf(location.getLatitude()) +
//                                " Accuracy: " + String.valueOf(location.getAccuracy()) +
//                                " Time: " + date,
//                        Toast.LENGTH_SHORT).show();

                editor.apply();
            }
        }


        public void onStatusChanged(String s, int i, Bundle b) {
            showCurrentLocation();
        }

        public void onProviderDisabled(String s) {

        }

        public void onProviderEnabled(String s) {

        }
    }
}