package edu.aku.hassannaqvi.rhdisease.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gul.sanober on 18-Sep-17.
 */

public class FetusContract
{

    private final String projectName = "rh - Disease";
    //private final String surveyType = "SN";
    private String _ID = "";
    private String _UID = "";
    private String _UUID = "";
    private String formDate = ""; // Date
    private String user = ""; // Interviewer
    private String participantID = "";
    private String formType = "";
    private String f08 = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";

    public FetusContract() {
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

    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }

    public String get_UUID() {
        return _UUID;
    }

    public void set_UUID(String _UUID) {
        this._UUID = _UUID;
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

    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getF08() {
        return f08;
    }

    public void setF08(String f08) {
        this.f08 = f08;
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

    public FetusContract Sync(JSONObject jsonObject) throws JSONException {


        this._ID = jsonObject.getString(FetusTable.COLUMN_ID);
        this._UID = jsonObject.getString(FetusTable.COLUMN__UID);
        this._UUID = jsonObject.getString(FetusTable.COLUMN__UUID);
        this.user = jsonObject.getString(FetusTable.COLUMN_USER);
        this.participantID = jsonObject.getString(FetusTable.COLUMN_PARTICIPANTID);
        this.formDate = jsonObject.getString(FetusTable.COLUMN_FORMDATE);
        this.formType = jsonObject.getString(FetusTable.COLUMN_FORMTYPE);
        this.f08 = jsonObject.getString(FetusTable.COLUMN_F08);
        this.deviceID = jsonObject.getString(FetusTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(FetusTable.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(FetusTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FetusTable.COLUMN_SYNCED_DATE);


        return this;

    }

    public FetusContract Hydrate(Cursor cursor) {


        this._ID = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN__UID));
        this._UUID = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN__UUID));
        this.user = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_USER));
        this.participantID = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_PARTICIPANTID));
        this.formDate = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_FORMDATE));
        this.formType = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_FORMTYPE));
        this.f08 = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_F08));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_DEVICETAGID));
        this.synced = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(FetusTable.COLUMN_SYNCED_DATE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FetusTable.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FetusTable.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(FetusTable.COLUMN__UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(FetusTable.COLUMN__UUID, this._UUID == null ? JSONObject.NULL : this._UUID);
        json.put(FetusTable.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(FetusTable.COLUMN_PARTICIPANTID, this.participantID == null ? JSONObject.NULL : this.participantID);
        json.put(FetusTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(FetusTable.COLUMN_FORMTYPE, this.formType == null ? JSONObject.NULL : this.formType);
        if (!this.f08.equals("")) {
            json.put(FetusTable.COLUMN_F08, this.f08 == null ? JSONObject.NULL : this.f08);
        }

        json.put(FetusTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FetusTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(FetusTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FetusTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);

        return json;
    }

    public static abstract class FetusTable implements BaseColumns
    {

        public static final String TABLE_NAME = "fetus";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN_ID = "_id ";
        public static final String COLUMN__UID = "_uid";
        public static final String COLUMN__UUID = "_uuid";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_PARTICIPANTID = "participantid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_FORMTYPE = "formtype";
        public static final String COLUMN_F08 = "f08";
        public static final String COLUMN_DEVICEID = "deviceid ";
        public static final String COLUMN_DEVICETAGID = "devicetagid ";
        public static final String COLUMN_SYNCED = "synced ";
        public static final String COLUMN_SYNCED_DATE = "synced_date ";

        public static String _URL = "fetus.php";
    }

}
