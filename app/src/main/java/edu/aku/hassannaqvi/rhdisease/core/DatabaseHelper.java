package edu.aku.hassannaqvi.rhdisease.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.rhdisease.contracts.FetusContract;
import edu.aku.hassannaqvi.rhdisease.contracts.FetusContract.FetusTable;
import edu.aku.hassannaqvi.rhdisease.contracts.FilledFormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.FilledFormsContract.FilledFormsTable;
import edu.aku.hassannaqvi.rhdisease.contracts.rh_resultsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.rh_resultsContract.RH_ResultsTable;
import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract.FormsTable;
import edu.aku.hassannaqvi.rhdisease.contracts.UsersContract;
import edu.aku.hassannaqvi.rhdisease.contracts.UsersContract.UsersTable;
import edu.aku.hassannaqvi.rhdisease.otherClasses.MothersLst;


/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.UsersTable.TABLE_NAME + "("
            + UsersContract.UsersTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.UsersTable.ROW_USERNAME + " TEXT,"
            + UsersContract.UsersTable.ROW_PASSWORD + " TEXT );";

    public static final String DATABASE_NAME = "rhdisease.db";
    public static final String DB_NAME = "rhdisease_copy.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECTNAME + " TEXT,"
            + FormsTable.COLUMN__UID + " TEXT,"
            + FormsTable.COLUMN__UUID + " TEXT,"
            + FormsTable.COLUMN_USER + " TEXT,"
            + FormsTable.COLUMN_PARTICIPANTID + " TEXT,"
            + FormsTable.COLUMN_FORMDATE + " TEXT,"
            + FormsTable.COLUMN_FORMTYPE + " TEXT,"
            + FormsTable.COLUMN_LMP + " TEXT," +
            FormsTable.COLUMN_RH_STATUS + " TEXT," +
            FormsTable.COLUMN_F10_ACCEPTANCE + " TEXT," +
            FormsTable.COLUMN_F15_ADVERSE + " TEXT,"
/*
+            FormsTable.COLUMN_G_AGE + " TEXT,"*/
            //+ FormsTable.COLUMN_INFO + " TEXT,"
            + FormsTable.COLUMN_F03 + " TEXT,"
            + FormsTable.COLUMN_F04 + " TEXT,"
            + FormsTable.COLUMN_F07A + " TEXT,"
            + FormsTable.COLUMN_F07B + " TEXT,"
            + FormsTable.COLUMN_F07C + " TEXT,"
            + FormsTable.COLUMN_F07D + " TEXT,"
            + FormsTable.COLUMN_F08 + " TEXT,"
            + FormsTable.COLUMN_F09 + " TEXT,"
            + FormsTable.COLUMN_F10A + " TEXT,"
            + FormsTable.COLUMN_F10B + " TEXT,"
            + FormsTable.COLUMN_F10C + " TEXT,"
            + FormsTable.COLUMN_F11 + " TEXT," +
            FormsTable.COLUMN_F15 + " TEXT,"
            + FormsTable.COLUMN_ISRHCOMPLETED + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_GPSLAT + " TEXT,"
            + FormsTable.COLUMN_GPSLNG + " TEXT,"
            + FormsTable.COLUMN_GPSDT + " TEXT,"
            + FormsTable.COLUMN_GPSACC + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_APP_VERSION + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT"

            + " );";


    private static final String SQL_CREATE_FETUS = "CREATE TABLE "
            + FetusContract.FetusTable.TABLE_NAME + "("
            + FetusContract.FetusTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FetusContract.FetusTable.COLUMN_PROJECTNAME + " TEXT,"
            + FetusContract.FetusTable.COLUMN__UID + " TEXT," +
            FetusContract.FetusTable.COLUMN__UUID + " TEXT," +
            FetusContract.FetusTable.COLUMN_USER + " TEXT," +
            FetusContract.FetusTable.COLUMN_PARTICIPANTID + " TEXT," +
            FetusContract.FetusTable.COLUMN_FORMDATE + " TEXT," +
            FetusContract.FetusTable.COLUMN_FORMTYPE + " TEXT," +
            FetusContract.FetusTable.COLUMN_F08 + " TEXT," +
            FetusContract.FetusTable.COLUMN_DEVICEID + " TEXT," +
            FetusContract.FetusTable.COLUMN_DEVICETAGID + " TEXT," +
            FetusContract.FetusTable.COLUMN_SYNCED + " TEXT," +
            FetusContract.FetusTable.COLUMN_APP_VERSION + " TEXT," +
            FetusContract.FetusTable.COLUMN_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_CREATE_RHRESULTS = "CREATE TABLE "
            + RH_ResultsTable.TABLE_NAME + "("
            + RH_ResultsTable.COLUMN__ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + RH_ResultsTable.COLUMN_PARTICIPANTID + " TEXT," +
            RH_ResultsTable.COLUMN_LMP + " TEXT," +
            RH_ResultsTable.COLUMN_FORM5_UID + " TEXT," +
            RH_ResultsTable.COLUMN_ISRHCOMPLETED + " TEXT," +
            RH_ResultsTable.COLUMN_RH_STATUS + " TEXT," +
            RH_ResultsTable.COLUMN_GA_WEEKS + " TEXT," +
            RH_ResultsTable.COLUMN_GA_DAYS + " TEXT," +
            RH_ResultsTable.COLUMN_F10_ACCEPTANCE + " TEXT," +
            RH_ResultsTable.COLUMN_F15_ADVERSE + " TEXT,"+
            RH_ResultsTable.COLUMN_F5 + " TEXT,"+
            RH_ResultsTable.COLUMN_F8 + " TEXT,"+
            RH_ResultsTable.COLUMN_F9 + " TEXT,"+
            RH_ResultsTable.COLUMN_F10FIRST + " TEXT,"+
            RH_ResultsTable.COLUMN_F15FIRST + " TEXT,"+
            RH_ResultsTable.COLUMN_F10SECOND + " TEXT,"+
            RH_ResultsTable.COLUMN_F15SECOND + " TEXT,"+
            RH_ResultsTable.COLUMN_F11 + " TEXT,"+
            RH_ResultsTable.COLUMN_F12 + " TEXT,"+
            RH_ResultsTable.COLUMN_F13 + " TEXT,"+
            RH_ResultsTable.COLUMN_F14 + " TEXT,"+
            RH_ResultsTable.COLUMN_F16 + " TEXT"
            + " );";
    private static final String SQL_CREATE_FILLEDFORMS = "CREATE TABLE "
            + FilledFormsTable.TABLE_NAME + "("
            + FilledFormsTable.COLUMN__ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            FilledFormsTable.COLUMN_USER + " TEXT," +
            FilledFormsTable.COLUMN_PARTICIPANTID + " TEXT," +
            FilledFormsTable.COLUMN_F5 + " TEXT," +
            FilledFormsTable.COLUMN_F8 + " TEXT," +
            FilledFormsTable.COLUMN_F9 + " TEXT," +
            FilledFormsTable.COLUMN_F10FIRST + " TEXT," +
            FilledFormsTable.COLUMN_F15FIRST + " TEXT," +
            FilledFormsTable.COLUMN_F10SECOND + " TEXT," +
            FilledFormsTable.COLUMN_F15SECOND + " TEXT," +
            FilledFormsTable.COLUMN_F11 + " TEXT," +
            FilledFormsTable.COLUMN_F12 + " TEXT," +
            FilledFormsTable.COLUMN_F13 + " TEXT," +
            FilledFormsTable.COLUMN_F14 + " TEXT," +
            FilledFormsTable.COLUMN_F16 + " TEXT," +
            FilledFormsTable.COLUMN_SYNCED + " TEXT," +
            FilledFormsTable.COLUMN_SYNCED_DATE + " TEXT"
            + " );";


    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + UsersTable.TABLE_NAME;
    private static final String SQL_DELETE_FORMS =
            "DROP TABLE IF EXISTS " + FormsTable.TABLE_NAME;

    private static final String SQL_DELETE_FETUS =
            "DROP TABLE IF EXISTS " + FetusContract.FetusTable.TABLE_NAME;
    private static final String SQL_DELETE_RHRESULTS =
            "DROP TABLE IF EXISTS " + RH_ResultsTable.TABLE_NAME;
    private static final String SQL_DELETE_FILLEDFORMS =
            "DROP TABLE IF EXISTS " + FilledFormsTable.TABLE_NAME;

    private static final String SQL_SELECT_MOTHER_BY_CHILD =
            "SELECT c.agem cm, c.agey cy, c.aged cd, c.gender, c.serial serial, m.serial serialm, c.name child_name, c.dss_id_member child_id, m.name mother_name, c.dss_id_member mother_id, c.dob date_of_birth FROM census C join census m on c.dss_id_m = m.dss_id_member where c.member_type =? and c.uuid = m.uuid and c.current_status IN ('1', '2') and c.uuid = ? group by mother_id order by substr(c.dob, 7) desc, substr(c.dob, 4,2) desc, substr(c.dob, 1,2) desc;";
    private static final String SQL_SELECT_CHILD =
            "SELECT * from census where member_type =? and dss_id_hh =? and uuid =? and current_status IN ('1', '2')";


    private final String TAG = "DatabaseHelper";


    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());


    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_FETUS);
        db.execSQL(SQL_CREATE_RHRESULTS);
        db.execSQL(SQL_CREATE_FILLEDFORMS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_FETUS);
        db.execSQL(SQL_DELETE_RHRESULTS);
        db.execSQL(SQL_DELETE_FILLEDFORMS);

    }

    public void addUser(UsersContract userscontract) {
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(UsersTable.ROW_USERNAME, userscontract.getUserName());
            values.put(UsersTable.ROW_PASSWORD, userscontract.getPassword());
            db.insert(UsersTable.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncUsers(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");


                ContentValues values = new ContentValues();

                values.put(UsersTable.ROW_USERNAME, userName);
                values.put(UsersTable.ROW_PASSWORD, password);
                db.insert(UsersTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncForm5(JSONArray formparticipantlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(RH_ResultsTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = formparticipantlist;
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObjectch = jsonArray.getJSONObject(i);

                rh_resultsContract rh = new rh_resultsContract();
                rh.Sync(jsonObjectch);
                ContentValues values = new ContentValues();
                values.put(RH_ResultsTable.COLUMN_PARTICIPANTID, rh.getParticipantid());
                values.put(RH_ResultsTable.COLUMN_LMP, rh.getLmp());
                values.put(RH_ResultsTable.COLUMN_FORM5_UID, rh.getForm5_uid());
                values.put(RH_ResultsTable.COLUMN_ISRHCOMPLETED, rh.getIsrhCompleted());
                values.put(RH_ResultsTable.COLUMN_RH_STATUS, rh.getRh_status());
                values.put(RH_ResultsTable.COLUMN_GA_WEEKS, rh.getGa_weeks());
                values.put(RH_ResultsTable.COLUMN_GA_DAYS, rh.getGa_days());
                values.put(RH_ResultsTable.COLUMN_F10_ACCEPTANCE, rh.getF10_acceptance());
                values.put(RH_ResultsTable.COLUMN_F15_ADVERSE, rh.getF15_adverse());
                values.put(RH_ResultsTable.COLUMN_F5, rh.getf5());
                values.put(RH_ResultsTable.COLUMN_F8, rh.getf8());
                values.put(RH_ResultsTable.COLUMN_F9, rh.getf9());
                values.put(RH_ResultsTable.COLUMN_F10FIRST, rh.getf10first());
                values.put(RH_ResultsTable.COLUMN_F15FIRST, rh.getf15first());
                values.put(RH_ResultsTable.COLUMN_F10SECOND, rh.getf10second());
                values.put(RH_ResultsTable.COLUMN_F15SECOND, rh.getf15second());
                values.put(RH_ResultsTable.COLUMN_F11, rh.getf11());
                values.put(RH_ResultsTable.COLUMN_F12, rh.getf12());
                values.put(RH_ResultsTable.COLUMN_F13, rh.getf13());
                values.put(RH_ResultsTable.COLUMN_F14, rh.getf14());
                values.put(RH_ResultsTable.COLUMN_F16, rh.getf16());



                db.insert(RH_ResultsTable.TABLE_NAME, null, values);
            }
        } catch (Exception e) {
            Log.d(TAG, "syncform5(e): " + e);
        } finally {
            db.close();
        }
    }

    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + UsersTable.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    UsersContract user = new UsersContract();
                    user.setId(cursor.getInt(0));
                    user.setUserName(cursor.getString(1));
                    user.setPassword(cursor.getString(2));
                    userList.add(user);
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }

    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersContract.UsersTable.TABLE_NAME + " WHERE " + UsersContract.UsersTable.ROW_USERNAME + "=? AND " + UsersContract.UsersTable.ROW_PASSWORD + "=?", new String[]{username, password});

        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public boolean checkFormParticipantID(String participantID, String formType) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FormsTable.COLUMN_FORMTYPE + "=" + formType;
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    //Todo change filledForms to RH_Result start

    public boolean isF8dublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F8 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF9dublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F9 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean checkF5filled(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F5 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF10firstdublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F10FIRST + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF10seconddublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F10SECOND + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF15firstdublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F15FIRST + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF15seconddublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F15SECOND + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF11dublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F11 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF12dublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F12 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF13dublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F13 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF14dublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F14 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean isF16dublicate(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F16 + "= '1'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    //Todo change filledForms to RH_Result end

    public String getLmp(String participantID, int formType) {
        SQLiteDatabase db = this.getReadableDatabase();
        String lmp = null;
        String query = "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FormsTable.COLUMN_FORMTYPE + "='" + formType + "'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                mCursor.moveToFirst();
                lmp = mCursor.getString(mCursor.getColumnIndex(RH_ResultsTable.COLUMN_LMP));
            }
        }
        db.close();
        return lmp;
    }

    public boolean checkForRH_Results(String participantID, int formType) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FormsTable.COLUMN_FORMTYPE + "='" + formType + "'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public String getForm5_UID(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT " + RH_ResultsTable.COLUMN_FORM5_UID + " FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return mCursor.getString(0);
            }
        }
        db.close();
        return null;
    }

    public String getForm5_UID(String participantID, String formType) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT " + FormsTable.COLUMN__UID + " FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FormsTable.COLUMN_FORMTYPE + "='" + formType + "'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                mCursor.moveToFirst();
                return mCursor.getString(0);
            }
        }
        db.close();
        return null;
    }

    public boolean checkFormParticipantID(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_RH_STATUS + "= 'null'";
        //String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public String getlmp(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String lmp = null;
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_RH_STATUS + "= 'null'";
        //String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "'";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                mCursor.moveToFirst();
                lmp = mCursor.getString(mCursor.getColumnIndex(RH_ResultsTable.COLUMN_LMP));
            }
        }
        db.close();
        return lmp;
    }
    public String checkParticipantIDExist(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String partID = null;
        String query = "SELECT * FROM " + FilledFormsTable.TABLE_NAME + " WHERE " + FilledFormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "'";

        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                mCursor.moveToFirst();
                partID = mCursor.getString(mCursor.getColumnIndex(FilledFormsTable.COLUMN_PARTICIPANTID));
            }
        }
        db.close();
        return partID;
    }
    public String getidof(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String ID = null;
        String query = "SELECT * FROM " + FilledFormsTable.TABLE_NAME + " WHERE " + FilledFormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "'";

        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                mCursor.moveToFirst();
                ID = mCursor.getString(mCursor.getColumnIndex(FilledFormsTable.COLUMN__ID));
            }
        }
        db.close();
        return ID;
    }
    public String getRhidof(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String ID = null;
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "'";

        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                mCursor.moveToFirst();
                ID = mCursor.getString(mCursor.getColumnIndex(RH_ResultsTable.COLUMN__ID));
            }
        }
        db.close();
        return ID;
    }
    public String checkParticipantIDExistinRH(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String partID = null;
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "'";

        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                mCursor.moveToFirst();
                partID = mCursor.getString(mCursor.getColumnIndex(RH_ResultsTable.COLUMN_PARTICIPANTID));
            }
        }
        db.close();
        return partID;
    }

    public boolean checkForRH_Results(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND (" + RH_ResultsTable.COLUMN_RH_STATUS + "= null OR " + RH_ResultsTable.COLUMN_RH_STATUS + "= '')";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }
    public boolean checkForRH_Results(String participantID, String status) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_RH_STATUS + "= " + status;
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public boolean checkForRH_Results(String participantID, String status, String formtype) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FormsTable.COLUMN_RH_STATUS + "= " + status + " AND " + FormsTable.COLUMN_FORMTYPE + " = " + formtype;
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public boolean checkForf15Adverse(String participantID, String formtype) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FormsTable.COLUMN_FORMTYPE + " = " + formtype + " AND " + FormsTable.COLUMN_F10_ACCEPTANCE + "= '1' ";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public boolean checkForf15Adverse(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F10_ACCEPTANCE + "= '1' ";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public boolean isAdverseReaction(String participantID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + RH_ResultsTable.COLUMN_F10_ACCEPTANCE + "= '1' AND " + RH_ResultsTable.COLUMN_F15_ADVERSE + " = '1' ";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public boolean isAdverseReaction(String participantID, String formtype) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FormsTable.COLUMN_FORMTYPE + " = " + formtype + " AND " + FormsTable.COLUMN_F15_ADVERSE + " = '1' ";
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public boolean checkForf10Acceptance(String participantID, String formtype) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + FetusTable.TABLE_NAME + " WHERE " + FetusTable.COLUMN_PARTICIPANTID + "='" + participantID + "' AND " + FetusTable.COLUMN_FORMTYPE + " = " + formtype;
        Cursor mCursor = db.rawQuery(query, null);
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        db.close();
        return false;
    }

    public String getRH_Results(String participantID) {
            SQLiteDatabase db = this.getReadableDatabase();
            String rh = null;
        String query = "SELECT  * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + " = " + participantID;

        Cursor mCursor = db.rawQuery(query, null);
            if (mCursor != null) {
                if (mCursor.getCount() > 0) {
                    mCursor.moveToFirst();
                    rh = mCursor.getString(mCursor.getColumnIndex(RH_ResultsTable.COLUMN_RH_STATUS));
                }
            }
            db.close();
            return rh;

    }
    public rh_resultsContract getRH_Results(String participantID, String status) {

        // Select All Query
        String selectQuery = "SELECT  * FROM " + RH_ResultsTable.TABLE_NAME + " WHERE " + RH_ResultsTable.COLUMN_PARTICIPANTID + " = '" + participantID + "' AND " + RH_ResultsTable.COLUMN_RH_STATUS + "=" + status;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);
        rh_resultsContract rh = new rh_resultsContract();
        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            rh.Hydrate(c);
        }
        // return contact list
        return rh;
    }

    public String getRH_Results(String participantID, String status, String formtype) {

        // Select All Query
        String selectQuery = "SELECT * FROM " + FormsTable.TABLE_NAME + " WHERE " + FormsTable.COLUMN_PARTICIPANTID + " = " + participantID + " AND " + FormsTable.COLUMN_RH_STATUS + "=" + status + " AND " + FormsTable.COLUMN_FORMTYPE + " = " + formtype;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);
        FormsContract fc = new FormsContract();
        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            fc.Hydrate(c);
        }
        // return contact list
        return fc.getLmp();
    }

    public List<FormsContract> getFormsByDSS(String dssID) {
        List<FormsContract> formList = new ArrayList<FormsContract>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + FormsTable.TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                FormsContract fc = new FormsContract();
                formList.add(fc.Hydrate(c));
            } while (c.moveToNext());
        }

        // return contact list
        return formList;
    }

    public Collection<MothersLst> getMotherByUUID(String uuid) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        // COLUMNS RETURNED: child_name, child_id, mother_name, mother_id, date_of_birth, serial
        Collection<MothersLst> memList = new ArrayList<>();
        try {

//            c = db.rawQuery(SQL_SELECT_MOTHER_BY_CHILD, new String[]{"c", "('1', '2')", uuid});
            c = db.rawQuery(SQL_SELECT_MOTHER_BY_CHILD, new String[]{"c", uuid});

            while (c.moveToNext()) {

                MothersLst mc = new MothersLst();
                memList.add(mc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return memList;
    }


    public Long addForm(FormsContract fc) {
        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();
// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_PROJECTNAME, fc.getProjectName());
        values.put(FormsTable.COLUMN__UID, fc.get_UID());
        values.put(FormsTable.COLUMN__UUID, fc.get_UUID());
        values.put(FormsTable.COLUMN_USER, fc.getUser());
        values.put(FormsTable.COLUMN_PARTICIPANTID, fc.getParticipantID());
        values.put(FormsTable.COLUMN_FORMDATE, fc.getFormDate());
        values.put(FormsTable.COLUMN_FORMTYPE, fc.getFormType());
        values.put(FormsTable.COLUMN_LMP, fc.getLmp());
        values.put(FormsTable.COLUMN_RH_STATUS, fc.getRh_status());
        values.put(FormsTable.COLUMN_F10_ACCEPTANCE, fc.getF10_acceptance());
        values.put(FormsTable.COLUMN_F15_ADVERSE, fc.getF15_adverse());

    /*

        values.put(FormsTable.COLUMN_G_AGE, fc.getg_age());
*/
        //values.put(FormsTable.COLUMN_INFO, fc.getInfo());
        values.put(FormsTable.COLUMN_F03, fc.getF03());
        values.put(FormsTable.COLUMN_F04, fc.getF04());
        values.put(FormsTable.COLUMN_F07A, fc.getF07a());
        values.put(FormsTable.COLUMN_F07B, fc.getF07b());
        values.put(FormsTable.COLUMN_F07C, fc.getF07c());
        values.put(FormsTable.COLUMN_F07D, fc.getF07d());
        values.put(FormsTable.COLUMN_F08, fc.getF08());
        values.put(FormsTable.COLUMN_F09, fc.getF09());
        values.put(FormsTable.COLUMN_F10A, fc.getF10a());
        values.put(FormsTable.COLUMN_F10B, fc.getF10b());
        values.put(FormsTable.COLUMN_F10C, fc.getF10c());
        values.put(FormsTable.COLUMN_F11, fc.getF11());
        values.put(FormsTable.COLUMN_F15, fc.getF15());
        values.put(FormsTable.COLUMN_ISRHCOMPLETED, fc.getIsrhCompleted());
        values.put(FormsTable.COLUMN_ISTATUS, fc.getIstatus());
        values.put(FormsTable.COLUMN_GPSLAT, fc.getGpsLat());
        values.put(FormsTable.COLUMN_GPSLNG, fc.getGpsLng());
        values.put(FormsTable.COLUMN_GPSDT, fc.getGpsDT());
        values.put(FormsTable.COLUMN_GPSACC, fc.getGpsAcc());
        values.put(FormsTable.COLUMN_DEVICEID, fc.getDeviceID());
        values.put(FormsTable.COLUMN_DEVICETAGID, fc.getDevicetagID());
        values.put(FormsTable.COLUMN_APP_VERSION, fc.getApp_version());
        values.put(FormsTable.COLUMN_SYNCED, fc.getSynced());
        values.put(FormsTable.COLUMN_SYNCED_DATE, fc.getSynced_date());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsContract.FormsTable.TABLE_NAME,
                FormsContract.FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addFilledForms(FilledFormsContract ffc) {
        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();
// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_USER, ffc.getuser());
        values.put(FilledFormsTable.COLUMN_PARTICIPANTID, ffc.getparticipantid());
        values.put(FilledFormsTable.COLUMN_FORMDATE, ffc.getformDate());
        values.put(FilledFormsTable.COLUMN_F5, ffc.getf5());
        values.put(FilledFormsTable.COLUMN_F8, ffc.getf8());
        values.put(FilledFormsTable.COLUMN_F9, ffc.getf9());
        values.put(FilledFormsTable.COLUMN_F10FIRST, ffc.getf10first());
        values.put(FilledFormsTable.COLUMN_F15FIRST, ffc.getf15first());
        values.put(FilledFormsTable.COLUMN_F10SECOND, ffc.getf10second());
        values.put(FilledFormsTable.COLUMN_F15SECOND, ffc.getf15second());
        values.put(FilledFormsTable.COLUMN_F11, ffc.getf11());
        values.put(FilledFormsTable.COLUMN_F12, ffc.getf12());
        values.put(FilledFormsTable.COLUMN_F13, ffc.getf13());
        values.put(FilledFormsTable.COLUMN_F14, ffc.getf14());
        values.put(FilledFormsTable.COLUMN_F16, ffc.getf16());
        values.put(FilledFormsTable.COLUMN_DEVICEID, ffc.getdeviceID());
        values.put(FilledFormsTable.COLUMN_SYNCED, ffc.getsynced());
        values.put(FilledFormsTable.COLUMN_SYNCED_DATE, ffc.getsynced_date());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FilledFormsTable.TABLE_NAME,
                FilledFormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addFetus(FetusContract fec) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FetusContract.FetusTable.COLUMN_PROJECTNAME, fec.getProjectName());
        values.put(FetusContract.FetusTable.COLUMN__UID, fec.get_UID());
        values.put(FetusContract.FetusTable.COLUMN__UUID, fec.get_UUID());
        values.put(FetusContract.FetusTable.COLUMN_USER, fec.getUser());
        values.put(FetusContract.FetusTable.COLUMN_PARTICIPANTID, fec.getParticipantID());
        values.put(FetusContract.FetusTable.COLUMN_FORMDATE, fec.getFormDate());
        values.put(FetusContract.FetusTable.COLUMN_FORMTYPE, fec.getFormType());
        values.put(FetusContract.FetusTable.COLUMN_F08, fec.getF08());
        values.put(FetusContract.FetusTable.COLUMN_DEVICEID, fec.getDeviceID());
        values.put(FetusContract.FetusTable.COLUMN_DEVICETAGID, fec.getDevicetagID());
        values.put(FetusContract.FetusTable.COLUMN_SYNCED, fec.getSynced());
        values.put(FetusContract.FetusTable.COLUMN_SYNCED_DATE, fec.getSynced_date());
        values.put(FetusContract.FetusTable.COLUMN_APP_VERSION, fec.getApp_version());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FetusContract.FetusTable.TABLE_NAME,
                FetusContract.FetusTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addRhResults(rh_resultsContract rh) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_PARTICIPANTID, rh.getParticipantid());
        values.put(RH_ResultsTable.COLUMN_LMP, rh.getLmp());
        values.put(RH_ResultsTable.COLUMN_ISRHCOMPLETED, rh.getIsrhCompleted());
        values.put(RH_ResultsTable.COLUMN_RH_STATUS, rh.getRh_status());
        values.put(RH_ResultsTable.COLUMN_GA_WEEKS, rh.getGa_weeks());
        values.put(RH_ResultsTable.COLUMN_GA_DAYS, rh.getGa_days());
        values.put(RH_ResultsTable.COLUMN_FORM5_UID, rh.getForm5_uid());
        values.put(RH_ResultsTable.COLUMN_F10_ACCEPTANCE, rh.getF10_acceptance());
        values.put(RH_ResultsTable.COLUMN_F15_ADVERSE, rh.getF15_adverse());
        values.put(RH_ResultsTable.COLUMN_F5, rh.getf5());
        values.put(RH_ResultsTable.COLUMN_F8, rh.getf8());
        values.put(RH_ResultsTable.COLUMN_F9, rh.getf9());
        values.put(RH_ResultsTable.COLUMN_F10FIRST, rh.getf10first());
        values.put(RH_ResultsTable.COLUMN_F15FIRST, rh.getf15first());
        values.put(RH_ResultsTable.COLUMN_F10SECOND, rh.getf10second());
        values.put(RH_ResultsTable.COLUMN_F15SECOND, rh.getf15second());
        values.put(RH_ResultsTable.COLUMN_F11, rh.getf11());
        values.put(RH_ResultsTable.COLUMN_F12, rh.getf12());
        values.put(RH_ResultsTable.COLUMN_F13, rh.getf13());
        values.put(RH_ResultsTable.COLUMN_F14, rh.getf14());
        values.put(RH_ResultsTable.COLUMN_F16, rh.getf16());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                RH_ResultsTable.TABLE_NAME,
                RH_ResultsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SYNCED, true);
        values.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }
    public void updateSyncedFilledForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_SYNCED, true);
        values.put(FilledFormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FilledFormsTable.COLUMN__ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FilledFormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public void updateSyncedFetus(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FetusContract.FetusTable.COLUMN_SYNCED, true);
        values.put(FetusContract.FetusTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FetusContract.FetusTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FetusContract.FetusTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updateForm4ID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN__UID, MainApp.fc4.get_UID());

// Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc4.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateFormID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN__UID, MainApp.fc.get_UID());

// Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateFetusID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FetusContract.FetusTable.COLUMN__UID, MainApp.fec.get_UID());

// Which row to update, based on the ID
        String selection = FetusContract.FetusTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fec.get_ID())};

        int count = db.update(FetusContract.FetusTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public void updateForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_SYNCED, true);
        values.put(FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateFetus(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FetusContract.FetusTable.COLUMN_SYNCED, true);
        values.put(FetusContract.FetusTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FetusContract.FetusTable.COLUMN_ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FetusContract.FetusTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public Collection<FormsContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable._ID,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_RH_STATUS,
                FormsTable.COLUMN_F10_ACCEPTANCE,
                FormsTable.COLUMN_F15_ADVERSE,

/*
                FormsTable.COLUMN_G_AGE,*/

                //FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_F11,
                FormsTable.COLUMN_F15,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_APP_VERSION,
                FormsTable.COLUMN_SYNCED_DATE
        };
/*        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + "='' AND " + FormsTable.COLUMN_FORMTYPE + " =? AND " + FormsTable.COLUMN_ISTATUS + "=?";
        String[] whereArgs = new String[]{"5", "1"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }
    public Collection<FilledFormsContract> getUnsyncedFilledForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FilledFormsTable.COLUMN__ID,
                FilledFormsTable.COLUMN_USER,
                FilledFormsTable.COLUMN_PARTICIPANTID,
                FilledFormsTable.COLUMN_FORMDATE,
                FilledFormsTable.COLUMN_F5,
                FilledFormsTable.COLUMN_F8,
                FilledFormsTable.COLUMN_F9,
                FilledFormsTable.COLUMN_F10FIRST,
                FilledFormsTable.COLUMN_F15FIRST,
                FilledFormsTable.COLUMN_F10SECOND,
                FilledFormsTable.COLUMN_F15SECOND,
                FilledFormsTable.COLUMN_F11,
                FilledFormsTable.COLUMN_F12,
                FilledFormsTable.COLUMN_F13,
                FilledFormsTable.COLUMN_F14,
                FilledFormsTable.COLUMN_F16,
                FilledFormsTable.COLUMN_DEVICEID,
                FilledFormsTable.COLUMN_SYNCED,
                FilledFormsTable.COLUMN_SYNCED_DATE,

        };
        String whereClause = FilledFormsTable.COLUMN_SYNCED + " is null OR " + FilledFormsTable.COLUMN_SYNCED + "=''";
        String[] whereArgs = new String[]{};
        String groupBy = null;
        String having = null;

        String orderBy =
                FilledFormsTable._ID + " ASC";

        Collection<FilledFormsContract> allFC = new ArrayList<FilledFormsContract>();
        try {
            c = db.query(
                    FilledFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FilledFormsContract ffc = new FilledFormsContract();
                allFC.add(ffc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<FormsContract> getUnsyncedForms7() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_RH_STATUS,
                FormsTable.COLUMN_F10_ACCEPTANCE,
                FormsTable.COLUMN_F15_ADVERSE,

/*
                FormsTable.COLUMN_G_AGE,*/

                //FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_F11,
                FormsTable.COLUMN_F15,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_SYNCED_DATE,
                FormsTable.COLUMN_APP_VERSION

        };
/*        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + "='' AND " + FormsTable.COLUMN_FORMTYPE + " =? AND " + FormsTable.COLUMN_ISTATUS + "=?";
        String[] whereArgs = new String[]{"7", "1"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );

            /*c = db.rawQuery("Select *from forms where "+
                    FormsTable.COLUMN_SYNCED + " is null AND " + FormsTable.COLUMN_FORMTYPE + " =?", new String[]{"3"});
*/
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<FormsContract> getUnsyncedForms8() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_RH_STATUS,
                FormsTable.COLUMN_F10_ACCEPTANCE,
                FormsTable.COLUMN_F15_ADVERSE,

                /*
                      FormsTable.COLUMN_G_AGE,*/
//FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_F11,
                FormsTable.COLUMN_F15,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_APP_VERSION,
                FormsTable.COLUMN_SYNCED_DATE

        };
/*        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + "='' AND " + FormsTable.COLUMN_FORMTYPE + " =? AND " + FormsTable.COLUMN_ISTATUS + "=?";
        String[] whereArgs = new String[]{"8", "1"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<FetusContract> getUnsyncedFetus() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FetusTable.COLUMN_ID,
                FetusTable.COLUMN__UID,
                FetusTable.COLUMN__UUID,
                FetusTable.COLUMN_USER,
                FetusTable.COLUMN_PARTICIPANTID,
                FetusTable.COLUMN_FORMDATE,
                FetusTable.COLUMN_FORMTYPE,
                FetusTable.COLUMN_F08,
                FetusTable.COLUMN_DEVICEID,
                FetusTable.COLUMN_DEVICETAGID,
                FetusTable.COLUMN_SYNCED,
                FetusTable.COLUMN_SYNCED_DATE,
                FetusTable.COLUMN_APP_VERSION

        };
       /* String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FetusTable.COLUMN_SYNCED + " is null OR " + FetusTable.COLUMN_SYNCED + "='' AND " + FetusTable.COLUMN_FORMTYPE + " =?";
        String[] whereArgs = new String[]{"8"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FetusContract.FetusTable.COLUMN_ID + " ASC";

        Collection<FetusContract> allFC = new ArrayList<FetusContract>();
        try {
            c = db.query(
                    FetusContract.FetusTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FetusContract fc = new FetusContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getUnsyncedForms9() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_RH_STATUS,
                FormsTable.COLUMN_F10_ACCEPTANCE,
                FormsTable.COLUMN_F15_ADVERSE,
/*
                FormsTable.COLUMN_G_AGE,*/
//FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_F11,
                FormsTable.COLUMN_F15,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_SYNCED_DATE,
                FormsTable.COLUMN_APP_VERSION

        };
      /*  String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + "='' AND " + FormsTable.COLUMN_FORMTYPE + " =? AND " + FormsTable.COLUMN_ISTATUS + "=?";
        String[] whereArgs = new String[]{"9", "1"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getUnsyncedForms10() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_RH_STATUS,
                FormsTable.COLUMN_F10_ACCEPTANCE,
                FormsTable.COLUMN_F15_ADVERSE,
/*
               FormsTable.COLUMN_G_AGE,*/
                //FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_F11,
                FormsTable.COLUMN_F15,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_SYNCED_DATE,
                FormsTable.COLUMN_APP_VERSION

        };
       /* String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + "='' AND " + FormsTable.COLUMN_FORMTYPE + " =? AND " + FormsTable.COLUMN_ISTATUS + "=?";
        String[] whereArgs = new String[]{MainApp.FORM10, "1"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<FormsContract> getUnsyncedForms11() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_RH_STATUS,
                FormsTable.COLUMN_F10_ACCEPTANCE,
                FormsTable.COLUMN_F15_ADVERSE,

/*
                FormsTable.COLUMN_G_AGE,*/
//FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_F11,
                FormsTable.COLUMN_F15,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_SYNCED_DATE,
                FormsTable.COLUMN_APP_VERSION

        };
       /* String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + "='' AND " + FormsTable.COLUMN_FORMTYPE + " =? AND " + FormsTable.COLUMN_ISTATUS + "=?";
        String[] whereArgs = new String[]{MainApp.FORM11, "1"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getUnsyncedForms15() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_RH_STATUS,
                FormsTable.COLUMN_F10_ACCEPTANCE,
                FormsTable.COLUMN_F15_ADVERSE,

/*
                FormsTable.COLUMN_G_AGE,*/
//FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_F11,
                FormsTable.COLUMN_F15,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_SYNCED_DATE,
                FormsTable.COLUMN_APP_VERSION

        };
       /* String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + "='' AND " + FormsTable.COLUMN_FORMTYPE + " =? AND " + FormsTable.COLUMN_ISTATUS + "=?";
        String[] whereArgs = new String[]{MainApp.FORM15, "1"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN__UUID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
/*                FormsTable.COLUMN_LMP,
                FormsTable.COLUMN_G_AGE,*/
//FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_ISRHCOMPLETED,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_SYNCED_DATE,
                FormsTable.COLUMN_APP_VERSION


        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    /*public Collection<FormsContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
                FormsTable.COLUMN_INFO,
                FormsTable.COLUMN_F03,
                FormsTable.COLUMN_F04,
                FormsTable.COLUMN_F07A,
                FormsTable.COLUMN_F07B,
                FormsTable.COLUMN_F07C,
                FormsTable.COLUMN_F07D,
                FormsTable.COLUMN_F08,
                FormsTable.COLUMN_F09,
                FormsTable.COLUMN_F10A,
                FormsTable.COLUMN_F10B,
                FormsTable.COLUMN_F10C,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_GPSLAT,
                FormsTable.COLUMN_GPSLNG,
                FormsTable.COLUMN_GPSDT,
                FormsTable.COLUMN_GPSACC,
                FormsTable.COLUMN_DEVICEID,
                FormsTable.COLUMN_DEVICETAGID,
                FormsTable.COLUMN_SYNCED,
                FormsTable.COLUMN_SYNCED_DATE,

        };
        String whereClause = FormsContract.FormsTable.COLUMN_SYNCED + " is null";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }*/

    public Collection<FormsContract> getTodayForms() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

        };

        String whereClause = FormsTable.COLUMN_FORMDATE + " LIKE ?";
        String[] whereArgs = {"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> formList = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                formList.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }


        // return contact list
        return formList;
    }

    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    public int updateInfo() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        //values.put(FormsTable.COLUMN_INFO, MainApp.fc.getInfo());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, MainApp.fc.getIstatus());

// Which row to update, based on the ID
        String selection = " _ID = " + MainApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    /*todo copy these functions and update Rh table*/
    public int updatef5filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F5, MainApp.ffc.getf5());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef9filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F9, MainApp.ffc.getf9());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef8filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F8, MainApp.ffc.getf8());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+"= " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef10firstfilled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F10FIRST, MainApp.ffc.getf10first());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef10secondfilled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F10SECOND, MainApp.ffc.getf10second());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef15firstfilled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F15FIRST, MainApp.ffc.getf15first());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef15secondfilled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F15SECOND, MainApp.ffc.getf15second());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef11filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F11, MainApp.ffc.getf11());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();

        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef12filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F12, MainApp.ffc.getf12());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();

        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef13filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F13, MainApp.ffc.getf13());

// Which row to update, based on the ID
 String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef14filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F14, MainApp.ffc.getf14());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();

        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef16filled() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FilledFormsTable.COLUMN_F16, MainApp.ffc.getf16());

// Which row to update, based on the ID
        String selection = FilledFormsTable.COLUMN__ID+" = " + MainApp.ffc.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.ffc.get_id())};

        int count = db.update(FilledFormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef5filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F5, MainApp.rh.getf5());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updaterhstatus() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_RH_STATUS, MainApp.rh.getRh_status());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef9filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F9, MainApp.rh.getf9());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef8filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F8, MainApp.rh.getf8());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+"= " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef10firstfilledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F10FIRST, MainApp.rh.getf10first());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef10secondfilledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F10SECOND, MainApp.rh.getf10second());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef15firstfilledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F15FIRST, MainApp.rh.getf15first());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef15secondfilledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F15SECOND, MainApp.rh.getf15second());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef11filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F11, MainApp.rh.getf11());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();

        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef12filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F12, MainApp.rh.getf12());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();

        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef13filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F13, MainApp.rh.getf13());

// Which row to update, based on the ID
 String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef14filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F14, MainApp.rh.getf14());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();

        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    public int updatef16filledinRH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(RH_ResultsTable.COLUMN_F16, MainApp.rh.getf16());

// Which row to update, based on the ID
        String selection = RH_ResultsTable.COLUMN__ID+" = " + MainApp.rh.get_id();
        String[] selectionArgs = {String.valueOf(MainApp.rh.get_id())};

        int count = db.update(RH_ResultsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }
    /*todo copy these functions and update Rh table end*/



    public int updateEnding4() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, MainApp.fc4.getIstatus());
        values.put(FormsTable.COLUMN_PARTICIPANTID, MainApp.fc4.getParticipantID());

// Which row to update, based on the ID
        String selection = " _ID = " + MainApp.fc4.get_ID();
        String[] selectionArgs = {String.valueOf(MainApp.fc4.get_ID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    /*public List<FormsContract> getWomenByParticipantID(String participantID) {
        List<FormsContract> formsList = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT * FROM " + FormsContract.FormsTable.TABLE_NAME ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                FormsContract fc = new FormsContract();
                formsList.add(fc.Hydrate(c));
            } while (c.moveToNext());
        }

        // return contact list
        return formsList;
    }*/


    public int updateF04() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F04, MainApp.fc.getF04());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateF07A() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F07A, MainApp.fc4.getF07a());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc4.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateF07B() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F07B, MainApp.fc4.getF07b());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc4.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateF07C() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F07C, MainApp.fc4.getF07c());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc4.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateF07D() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F07D, MainApp.fc4.getF07d());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc4.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateF08() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FetusContract.FetusTable.COLUMN_F08, MainApp.fec.getF08());

// Which row to update, based on the ID
        String selection = FetusContract.FetusTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fec.get_ID())};

        int count = db.update(FetusContract.FetusTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateF09() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F09, MainApp.fc.getF09());
        values.put(FormsTable.COLUMN_LMP, MainApp.fc.getLmp());
        values.put(FormsTable.COLUMN_RH_STATUS, MainApp.fc.getRh_status());
        values.put(FormsTable.COLUMN__UUID, MainApp.fc.get_UUID());
        values.put(FormsTable.COLUMN_ISRHCOMPLETED, "1");
// Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateF10A() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F10A, MainApp.fc.getF10a());


// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateF10B() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F10B, MainApp.fc.getF10b());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateF10C() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F10C, MainApp.fc.getF10c());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateF011() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F11, MainApp.fc.getF11());
        values.put(FormsTable.COLUMN_F10_ACCEPTANCE, "1");
        values.put(FormsTable.COLUMN_F15_ADVERSE, MainApp.fc.getF15_adverse());
// Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateF015() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F15, MainApp.fc.getF15());
// Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateF03() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_F03, MainApp.fc.getF03());
        values.put(FormsTable.COLUMN_PARTICIPANTID, MainApp.fc.getParticipantID());

// Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }



}