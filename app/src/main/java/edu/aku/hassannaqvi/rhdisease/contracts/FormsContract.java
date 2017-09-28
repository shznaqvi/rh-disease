package edu.aku.hassannaqvi.rhdisease.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    private final String projectName = "rh - Disease";
    //private final String surveyType = "SN";
    private String _ID = "";
    private String _UID = "";
    private String formDate = ""; // Date
    private String user = ""; // Interviewer
    private String participantID = "";
    private String formType = "";
    private String info = "";
    private String istatus = ""; // Interview Status
    private String f03 = "";
    private String f04 = "";
    private String f07a = "";
    private String f07b = "";
    private String f07c = "";
    private String f07d = "";
    private String f08 = "";
    private String f09 = "";
    private String f10a = "";
    private String f10b = "";
    private String f10c = "";


    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }


    public FormsContract Sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(FormsTable.COLUMN_ID);
        this._UID = jsonObject.getString(FormsTable.COLUMN__UID);
        this.user = jsonObject.getString(FormsTable.COLUMN_USER);
        this.participantID = jsonObject.getString(FormsTable.COLUMN_PARTICIPANTID);
        this.formDate = jsonObject.getString(FormsTable.COLUMN_FORMDATE);
        this.formType = jsonObject.getString(FormsTable.COLUMN_FORMTYPE);
        //this.info = jsonObject.getString(FormsTable.COLUMN_INFO);
        this.f03 = jsonObject.getString(FormsTable.COLUMN_F03);
        this.f04 = jsonObject.getString(FormsTable.COLUMN_F04);
        this.f07a = jsonObject.getString(FormsTable.COLUMN_F07A);
        this.f07b = jsonObject.getString(FormsTable.COLUMN_F07B);
        this.f07c = jsonObject.getString(FormsTable.COLUMN_F07C);
        this.f07d = jsonObject.getString(FormsTable.COLUMN_F07D);
        this.f08 = jsonObject.getString(FormsTable.COLUMN_F08);
        this.f09 = jsonObject.getString(FormsTable.COLUMN_F09);
        this.f10a = jsonObject.getString(FormsTable.COLUMN_F10A);
        this.f10b = jsonObject.getString(FormsTable.COLUMN_F10B);
        this.f10c = jsonObject.getString(FormsTable.COLUMN_F10C);
        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(FormsTable.COLUMN_GPSDT);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);



        return this;

    }

    public FormsContract Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN__UID));
        this.user = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_USER));
        this.participantID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_PARTICIPANTID));
        this.formDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMDATE));
        this.formType = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMTYPE));
        //this.info = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_INFO));
        this.f03 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F03));
        this.f04 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F04));
        this.f07a = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F07A));
        this.f07b = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F07B));
        this.f07c = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F07C));
        this.f07d = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F07D));
        this.f08 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F08));
        this.f09 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F09));
        this.f10a = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F10A));
        this.f10b = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F10B));
        this.f10c = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_F10C));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSDT));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FormsTable.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(FormsTable.COLUMN__UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(FormsTable.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(FormsTable.COLUMN_PARTICIPANTID, this.participantID == null ? JSONObject.NULL : this.participantID);
        json.put(FormsTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(FormsTable.COLUMN_FORMTYPE, this.formType == null ? JSONObject.NULL : this.formType);

       /* if (!this.info.equals("")) {
            json.put(FormsTable.COLUMN_INFO, this.info == null ? JSONObject.NULL : this.info);
        }*/

        if (!this.f03.equals("")) {
            json.put(FormsTable.COLUMN_F03, this.f03 == null ? JSONObject.NULL : this.f03);
        }
        if (!this.f04.equals("")) {
            json.put(FormsTable.COLUMN_F04, this.f04 == null ? JSONObject.NULL : this.f04);
        }

        if (!this.f07a.equals("")) {
            json.put(FormsTable.COLUMN_F07A, this.f07a == null ? JSONObject.NULL : this.f07a);
        }
        if (!this.f07b.equals("")) {
            json.put(FormsTable.COLUMN_F07B, this.f07b == null ? JSONObject.NULL : this.f07b);
        }
        if (!this.f07c.equals("")) {
            json.put(FormsTable.COLUMN_F07C, this.f07c == null ? JSONObject.NULL : this.f07c);
        }
        if (!this.f07d.equals("")) {
            json.put(FormsTable.COLUMN_F07D, this.f07d == null ? JSONObject.NULL : this.f07d);
        }
        if (!this.f08.equals("")) {
            json.put(FormsTable.COLUMN_F08, this.f08 == null ? JSONObject.NULL : this.f08);
        }
        if (!this.f09.equals("")) {
            json.put(FormsTable.COLUMN_F09, this.f09 == null ? JSONObject.NULL : this.f09);
        }
        if (!this.f10a.equals("")) {
            json.put(FormsTable.COLUMN_F10A, this.f10a == null ? JSONObject.NULL : this.f10a);
        }
        if (!this.f10b.equals("")) {
            json.put(FormsTable.COLUMN_F10B, this.f10b == null ? JSONObject.NULL : this.f10b);
        }
        if (!this.f10c.equals("")) {
            json.put(FormsTable.COLUMN_F10C, this.f10c == null ? JSONObject.NULL : this.f10c);
        }

        json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_GPSDT, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public String getProjectName() {
        return projectName;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }

    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getF03() {
        return f03;
    }

    public void setF03(String f03) {
        this.f03 = f03;
    }

    public String getF04() {
        return f04;
    }

    public void setF04(String f04) {
        this.f04 = f04;
    }

    public String getF07a() {
        return f07a;
    }

    public void setF07a(String f07a) {
        this.f07a = f07a;
    }

    public String getF07b() {
        return f07b;
    }

    public void setF07b(String f07b) {
        this.f07b = f07b;
    }

    public String getF07c() {
        return f07c;
    }

    public void setF07c(String f07c) {
        this.f07c = f07c;
    }

    public String getF07d() {
        return f07d;
    }

    public void setF07d(String f07d) {
        this.f07d = f07d;
    }

    public String getF08() {
        return f08;
    }

    public void setF08(String f08) {
        this.f08 = f08;
    }

    public String getF09() {
        return f09;
    }

    public void setF09(String f09) {
        this.f09 = f09;
    }

    public String getF10a() {
        return f10a;
    }

    public void setF10a(String f10a) {
        this.f10a = f10a;
    }

    public String getF10b() {
        return f10b;
    }

    public void setF10b(String f10b) {
        this.f10b = f10b;
    }

    public String getF10c() {
        return f10c;
    }

    public void setF10c(String f10c) {
        this.f10c = f10c;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN_ID = "_id ";
        public static final String COLUMN__UID = "_uid ";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_PARTICIPANTID = "participantid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_FORMTYPE = "formtype";
        //public static final String COLUMN_INFO = "info";
        public static final String COLUMN_F03 = "f03";
        public static final String COLUMN_F04 = "f04";
        public static final String COLUMN_F07A = "f07a";
        public static final String COLUMN_F07B = "f07b";
        public static final String COLUMN_F07C = "f07c";
        public static final String COLUMN_F07D = "f07d";
        public static final String COLUMN_F08 = "f08";
        public static final String COLUMN_F09 = "f09";
        public static final String COLUMN_F10A = "f10a";
        public static final String COLUMN_F10B = "f10b";
        public static final String COLUMN_F10C = "f10c";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_GPSLAT = "gpslat ";
        public static final String COLUMN_GPSLNG = "gpslng ";
        public static final String COLUMN_GPSDT = "gpsdt ";
        public static final String COLUMN_GPSACC = "gpsacc ";
        public static final String COLUMN_DEVICEID = "deviceid ";
        public static final String COLUMN_DEVICETAGID = "devicetagid ";
        public static final String COLUMN_SYNCED = "synced ";
        public static final String COLUMN_SYNCED_DATE = "synced_date ";

        public static String _URL = "forms.php";
    }
}
