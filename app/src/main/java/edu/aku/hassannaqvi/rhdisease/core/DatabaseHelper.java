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
            + FormsTable.COLUMN_USER + " TEXT,"
            + FormsTable.COLUMN_PARTICIPANTID + " TEXT,"
            + FormsTable.COLUMN_FORMDATE + " TEXT,"
            + FormsTable.COLUMN_FORMTYPE + " TEXT,"
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
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_GPSLAT + " TEXT,"
            + FormsTable.COLUMN_GPSLNG + " TEXT,"
            + FormsTable.COLUMN_GPSDT + " TEXT,"
            + FormsTable.COLUMN_GPSACC + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
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
            FetusContract.FetusTable.COLUMN_F08 + " TEXT," +
            FetusContract.FetusTable.COLUMN_DEVICEID + " TEXT," +
            FetusContract.FetusTable.COLUMN_DEVICETAGID + " TEXT," +
            FetusContract.FetusTable.COLUMN_SYNCED + " TEXT," +
            FetusContract.FetusTable.COLUMN_SYNCED_DATE + " TEXT"

            + " );";



    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + UsersTable.TABLE_NAME;
    private static final String SQL_DELETE_FORMS =
            "DROP TABLE IF EXISTS " + FormsTable.TABLE_NAME;

    private static final String SQL_DELETE_FETUS =
            "DROP TABLE IF EXISTS " + FetusContract.FetusTable.TABLE_NAME;

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

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_FETUS);

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
        values.put(FormsTable.COLUMN_USER, fc.getUser());
        values.put(FormsTable.COLUMN_PARTICIPANTID, fc.getParticipantID());
        values.put(FormsTable.COLUMN_FORMDATE, fc.getFormDate());
        values.put(FormsTable.COLUMN_FORMTYPE, fc.getFormType());
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
        values.put(FormsTable.COLUMN_ISTATUS, fc.getIstatus());
        values.put(FormsTable.COLUMN_GPSLAT, fc.getGpsLat());
        values.put(FormsTable.COLUMN_GPSLNG, fc.getGpsLng());
        values.put(FormsTable.COLUMN_GPSDT, fc.getGpsDT());
        values.put(FormsTable.COLUMN_GPSACC, fc.getGpsAcc());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsContract.FormsTable.TABLE_NAME,
                FormsContract.FormsTable.COLUMN_NAME_NULLABLE,
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
        values.put(FetusContract.FetusTable.COLUMN_F08, fec.getF08());
        values.put(FetusContract.FetusTable.COLUMN_DEVICEID, fec.getDeviceID());
        values.put(FetusContract.FetusTable.COLUMN_DEVICETAGID, fec.getDevicetagID());
        values.put(FetusContract.FetusTable.COLUMN_SYNCED, fec.getSynced());
        values.put(FetusContract.FetusTable.COLUMN_SYNCED_DATE, fec.getSynced_date());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FetusContract.FetusTable.TABLE_NAME,
                FetusContract.FetusTable.COLUMN_NAME_NULLABLE,
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

    public Collection<FormsContract> getUnsyncedForms3() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {

                FormsTable.COLUMN_ID,
                FormsTable.COLUMN_PROJECTNAME,
                FormsTable.COLUMN__UID,
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
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
/*        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null AND " + FormsTable.COLUMN_FORMTYPE + " =?";
        String[] whereArgs = new String[]{"3"};
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
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
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
/*        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null AND " + FormsTable.COLUMN_FORMTYPE + " =?";
        String[] whereArgs = new String[]{"8"};
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

                FetusContract.FetusTable.COLUMN_ID,
                FetusContract.FetusTable.COLUMN__UID,
                FetusContract.FetusTable.COLUMN_USER,
                FetusContract.FetusTable.COLUMN_PARTICIPANTID,
                FetusContract.FetusTable.COLUMN_FORMDATE,
                FetusContract.FetusTable.COLUMN_FORMTYPE,
                FetusContract.FetusTable.COLUMN_F08,
                FetusContract.FetusTable.COLUMN_DEVICEID,
                FetusContract.FetusTable.COLUMN_DEVICETAGID,
                FetusContract.FetusTable.COLUMN_SYNCED,
                FetusContract.FetusTable.COLUMN_SYNCED_DATE,

        };
       /* String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FetusContract.FetusTable.COLUMN_SYNCED + " is null AND " + FetusContract.FetusTable.COLUMN_FORMTYPE + " =?";
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
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
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
      /*  String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null AND " + FormsTable.COLUMN_FORMTYPE + " =?";
        String[] whereArgs = new String[]{"9"};
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
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
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
       /* String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " = '' AND "
                + FormsTable.COLUMN_FORMTYPE + " =?";*/
        String whereClause = FormsTable.COLUMN_SYNCED + " is null AND " + FormsTable.COLUMN_FORMTYPE + " =?";
        String[] whereArgs = new String[]{"10"};
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
                FormsTable.COLUMN_USER,
                FormsTable.COLUMN_PARTICIPANTID,
                FormsTable.COLUMN_FORMDATE,
                FormsTable.COLUMN_FORMTYPE,
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
                FormsTable.COLUMN_ID
        };

        String whereClause = FormsTable.COLUMN_FORMDATE + " LIKE ?";
        String[] whereArgs = {spDateT};
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
        values.put(FormsTable.COLUMN_F07A, MainApp.fc.getF07a());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

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
        values.put(FormsTable.COLUMN_F07B, MainApp.fc.getF07b());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

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
        values.put(FormsTable.COLUMN_F07C, MainApp.fc.getF07c());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

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
        values.put(FormsTable.COLUMN_F07D, MainApp.fc.getF07d());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable.COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

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

// Which row to update, based on the ID
        String selection = FormsTable._ID + " = ?";
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
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
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

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


}