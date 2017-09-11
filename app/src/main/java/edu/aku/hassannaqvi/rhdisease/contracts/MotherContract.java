package edu.aku.hassannaqvi.rhdisease.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gul.sanober on 5/9/2017.
 */

public class MotherContract {

    private final String projectName = "DSS Census";
    private String _ID = "";
    private String UID = "";
    private String _UUID = "";
    private String deviceId = "";
    private String formDate = ""; // Date
    private String user = ""; // Interviewer
    private String childID = "", motherID = "", dssID = "";

    private String sF = "";
    private String sG = "";
    private String sH = "";
    private String sI = "";
    private String sJ = "";
    //private String sK = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";
    private String istatus = "";


    public MotherContract() {
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


    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String get_UUID() {
        return _UUID;
    }

    public void set_UUID(String _UUID) {
        this._UUID = _UUID;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }

    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }

    public String getsJ() {
        return sJ;
    }

    public void setsJ(String sJ) {
        this.sJ = sJ;
    }

   /* public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }*/

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

    public String getChildID() {
        return childID;
    }

    public void setChildID(String childID) {
        this.childID = childID;
    }

    public String getMotherID() {
        return motherID;
    }

    public void setMotherID(String motherID) {
        this.motherID = motherID;
    }

    public String getDssID() {
        return dssID;
    }

    public void setDssID(String dssID) {
        this.dssID = dssID;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public MotherContract Sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(MotherTB.COLUMN_ID);
        this._UUID = jsonObject.getString(MotherTB.COLUMN_UUID);
        this.UID = jsonObject.getString(MotherTB.COLUMN_UID);
        this.formDate = jsonObject.getString(MotherTB.COLUMN_FORMDATE);
        this.user = jsonObject.getString(MotherTB.COLUMN_USER);
        this.sF = jsonObject.getString(MotherTB.COLUMN_SF);
        this.sG = jsonObject.getString(MotherTB.COLUMN_SG);
        this.sH = jsonObject.getString(MotherTB.COLUMN_SH);
        this.sI = jsonObject.getString(MotherTB.COLUMN_SI);
        this.sJ = jsonObject.getString(MotherTB.COLUMN_SJ);
        //this.sK = jsonObject.getString(MotherTB.COLUMN_SK);
        this.deviceID = jsonObject.getString(MotherTB.COLUMN_DEVICEID);
        this.synced = jsonObject.getString(MotherTB.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(MotherTB.COLUMN_SYNCED_DATE);

        this.childID = jsonObject.getString(MotherTB.COLUMN_CHILDID);
        this.dssID = jsonObject.getString(MotherTB.COLUMN_DSSID);
        this.motherID = jsonObject.getString(MotherTB.COLUMN_MOTHERID);
        this.istatus = jsonObject.getString(MotherTB.COLUMN_ISTATUS);


        return this;

    }

    public MotherContract Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_ID));
        this._UUID = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_UUID));
        this.UID = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_FORMDATE));
        this.user = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_USER));
        this.sF = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_SG));
        this.sH = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_SH));
        this.sI = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_SI));
        this.sJ = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_SJ));
        //this.sK = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_SK));
        this.deviceID = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_DEVICEID));

        this.childID = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_CHILDID));
        this.dssID = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_DSSID));
        this.motherID = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_MOTHERID));
        this.istatus = cursor.getString(cursor.getColumnIndex(MotherTB.COLUMN_ISTATUS));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(MotherTB.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(MotherTB.COLUMN_UUID, this._UUID == null ? JSONObject.NULL : this._UUID);
        json.put(MotherTB.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(MotherTB.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(MotherTB.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(MotherTB.COLUMN_SF, this.sF == null ? JSONObject.NULL : new JSONObject(this.sF));
        json.put(MotherTB.COLUMN_SG, this.sG == null ? JSONObject.NULL : new JSONObject(this.sG));
        json.put(MotherTB.COLUMN_SH, this.sH == null ? JSONObject.NULL : new JSONObject(this.sH));
        json.put(MotherTB.COLUMN_SI, this.sI == null ? JSONObject.NULL : new JSONObject(this.sI));
        json.put(MotherTB.COLUMN_SJ, this.sJ == null ? JSONObject.NULL : new JSONObject(this.sJ));
        //json.put(MotherTB.COLUMN_SK, this.sK == null ? JSONObject.NULL : this.sK);
        json.put(MotherTB.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);

        json.put(MotherTB.COLUMN_CHILDID, this.childID == null ? JSONObject.NULL : this.childID);
        json.put(MotherTB.COLUMN_DSSID, this.dssID == null ? JSONObject.NULL : this.dssID);
        json.put(MotherTB.COLUMN_MOTHERID, this.motherID == null ? JSONObject.NULL : this.motherID);
        json.put(MotherTB.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);

        return json;
    }

    public static abstract class MotherTB implements BaseColumns {

        public static final String TABLE_NAME = "mother";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECT_NAME = "project_name";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";
        public static final String COLUMN_SH = "sh";
        public static final String COLUMN_SI = "si";
        public static final String COLUMN_SJ = "sj";
        //public static final String COLUMN_SK = "sk";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

        public static final String COLUMN_CHILDID = "childid";
        public static final String COLUMN_DSSID = "dssid";
        public static final String COLUMN_MOTHERID = "motherid";
        public static final String COLUMN_ISTATUS = "istatus";


        public static String _URL = "mothers.php";
    }
}
