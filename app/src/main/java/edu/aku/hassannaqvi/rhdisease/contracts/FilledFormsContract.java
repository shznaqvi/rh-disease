package edu.aku.hassannaqvi.rhdisease.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class FilledFormsContract {
    private String _id = "";
    private String user = "";
    private String participantid = "";
    private String rh_status = "";
    private String f5 = "";
    private String f8 = "";
    private String f9 = "";
    private String f10first = "";
    private String f15first = "";
    private String f10second = "";
    private String f15second = "";
    private String f11 = "";
    private String f12 = "";
    private String f13 = "";
    private String f14 = "";
    private String f16 = "";


    public FilledFormsContract() {
    }

    public FilledFormsContract Sync(JSONObject jsonObject) throws JSONException {
        this._id = jsonObject.getString(FilledFormsTable.COLUMN__ID);
        this.user = jsonObject.getString(FilledFormsTable.COLUMN_USER);
        this.participantid = jsonObject.getString(FilledFormsTable.COLUMN_PARTICIPANTID);
        this.rh_status = jsonObject.getString(FilledFormsTable.COLUMN_RH_STATUS);
        this.f5 = jsonObject.getString(FilledFormsTable.COLUMN_F5);
        this.f8 = jsonObject.getString(FilledFormsTable.COLUMN_F8);
        this.f9 = jsonObject.getString(FilledFormsTable.COLUMN_F9);
        this.f10first = jsonObject.getString(FilledFormsTable.COLUMN_F10FIRST);
        this.f15first = jsonObject.getString(FilledFormsTable.COLUMN_F15FIRST);
        this.f10second = jsonObject.getString(FilledFormsTable.COLUMN_F10SECOND);
        this.f15second = jsonObject.getString(FilledFormsTable.COLUMN_F15SECOND);
        this.f11 = jsonObject.getString(FilledFormsTable.COLUMN_F11);
        this.f12 = jsonObject.getString(FilledFormsTable.COLUMN_F12);
        this.f13 = jsonObject.getString(FilledFormsTable.COLUMN_F13);
        this.f14 = jsonObject.getString(FilledFormsTable.COLUMN_F14);
        this.f16 = jsonObject.getString(FilledFormsTable.COLUMN_F16);
        return this;
    }

    public FilledFormsContract Hydrate(Cursor cursor) {
        this._id = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN__ID));
        this.user = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_USER));
        this.participantid = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_PARTICIPANTID));
        this.rh_status = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_RH_STATUS));
        this.f5 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F5));
        this.f8 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F8));
        this.f9 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F9));
        this.f10first = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F10FIRST));
        this.f15first = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F15FIRST));
        this.f10second = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F10SECOND));
        this.f15second = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F15SECOND));
        this.f11 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F11));
        this.f12 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F12));
        this.f13 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F13));
        this.f14 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F14));
        this.f16 = cursor.getString(cursor.getColumnIndex(FilledFormsTable.COLUMN_F16));
        return this;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(FilledFormsTable.COLUMN__ID, this._id == null ? JSONObject.NULL : this._id);
        json.put(FilledFormsTable.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(FilledFormsTable.COLUMN_PARTICIPANTID, this.participantid == null ? JSONObject.NULL : this.participantid);
        json.put(FilledFormsTable.COLUMN_RH_STATUS, this.rh_status == null ? JSONObject.NULL : this.rh_status);
        json.put(FilledFormsTable.COLUMN_F5, this.f5 == null ? JSONObject.NULL : this.f5);
        json.put(FilledFormsTable.COLUMN_F8, this.f8 == null ? JSONObject.NULL : this.f8);
        json.put(FilledFormsTable.COLUMN_F9, this.f9 == null ? JSONObject.NULL : this.f9);
        json.put(FilledFormsTable.COLUMN_F10FIRST, this.f10first == null ? JSONObject.NULL : this.f10first);
        json.put(FilledFormsTable.COLUMN_F15FIRST, this.f15first == null ? JSONObject.NULL : this.f15first);
        json.put(FilledFormsTable.COLUMN_F10SECOND, this.f10second == null ? JSONObject.NULL : this.f10second);
        json.put(FilledFormsTable.COLUMN_F15SECOND, this.f15second == null ? JSONObject.NULL : this.f15second);
        json.put(FilledFormsTable.COLUMN_F11, this.f11 == null ? JSONObject.NULL : this.f11);
        json.put(FilledFormsTable.COLUMN_F12, this.f12 == null ? JSONObject.NULL : this.f12);
        json.put(FilledFormsTable.COLUMN_F13, this.f13 == null ? JSONObject.NULL : this.f13);
        json.put(FilledFormsTable.COLUMN_F14, this.f14 == null ? JSONObject.NULL : this.f14);
        json.put(FilledFormsTable.COLUMN_F16, this.f16 == null ? JSONObject.NULL : this.f16);
        return json;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public String getparticipantid() {
        return participantid;
    }

    public void setparticipantid(String participantid) {
        this.participantid = participantid;
    }

    public String getrh_status() {
        return rh_status;
    }

    public void setrh_status(String rh_status) {
        this.rh_status = rh_status;
    }

    public String getf5() {
        return f5;
    }

    public void setf5(String f5) {
        this.f5 = f5;
    }

    public String getf8() {
        return f8;
    }

    public void setf8(String f8) {
        this.f8 = f8;
    }

    public String getf9() {
        return f9;
    }

    public void setf9(String f9) {
        this.f9 = f9;
    }

    public String getf10first() {
        return f10first;
    }

    public void setf10first(String f10first) {
        this.f10first = f10first;
    }

    public String getf15first() {
        return f15first;
    }

    public void setf15first(String f15first) {
        this.f15first = f15first;
    }

    public String getf10second() {
        return f10second;
    }

    public void setf10second(String f10second) {
        this.f10second = f10second;
    }

    public String getf15second() {
        return f15second;
    }

    public void setf15second(String f15second) {
        this.f15second = f15second;
    }

    public String getf11() {
        return f11;
    }

    public void setf11(String f11) {
        this.f11 = f11;
    }

    public String getf12() {
        return f12;
    }

    public void setf12(String f12) {
        this.f12 = f12;
    }

    public String getf13() {
        return f13;
    }

    public void setf13(String f13) {
        this.f13 = f13;
    }

    public String getf14() {
        return f14;
    }

    public void setf14(String f14) {
        this.f14 = f14;
    }

    public String getf16() {
        return f16;
    }

    public void setf16(String f16) {
        this.f16 = f16;
    }

    public static abstract class FilledFormsTable implements BaseColumns {
        public static final String TABLE_NAME = "filledforms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_PARTICIPANTID = "participantid";
        public static final String COLUMN_RH_STATUS = "rh_status";
        public static final String COLUMN_F5 = "f5";
        public static final String COLUMN_F8 = "f8";
        public static final String COLUMN_F9 = "f9";
        public static final String COLUMN_F10FIRST = "f10first";
        public static final String COLUMN_F15FIRST = "f15first";
        public static final String COLUMN_F10SECOND = "f10second";
        public static final String COLUMN_F15SECOND = "f15second";
        public static final String COLUMN_F11 = "f11";
        public static final String COLUMN_F12 = "f12";
        public static final String COLUMN_F13 = "f13";
        public static final String COLUMN_F14 = "f14";
        public static final String COLUMN_F16 = "f16";


        public static String _URL = "filledforms.php";


    }
}
