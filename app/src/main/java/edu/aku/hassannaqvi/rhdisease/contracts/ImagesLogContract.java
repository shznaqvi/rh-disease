package edu.aku.hassannaqvi.rhdisease.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class ImagesLogContract {
    private String _id = "";
    private String _uid = "";
    private String uuid = "";
    private String deviceid = "";
    private String user = "";
    private String imageuri = "";
    private String participantid = "";
    private String imagename = "";
    private String imagetype = "";
    private String isuploaded = "";
    private String synced = "";
    private String synced_date = "";

    public ImagesLogContract() {
    }

    public ImagesLogContract Sync(JSONObject jsonObject) throws JSONException {
        this._id= jsonObject.getString(ImagesLogTable.COLUMN__ID);
        this._uid= jsonObject.getString(ImagesLogTable.COLUMN__UID);
        this.uuid= jsonObject.getString(ImagesLogTable.COLUMN_UUID);
        this.deviceid= jsonObject.getString(ImagesLogTable.COLUMN_DEVICEID);
        this.imageuri= jsonObject.getString(ImagesLogTable.COLUMN_IMAGEURI);
        this.user= jsonObject.getString(ImagesLogTable.COLUMN_USER);
        this.participantid= jsonObject.getString(ImagesLogTable.COLUMN_PARTICIPANTID);
        this.imagename= jsonObject.getString(ImagesLogTable.COLUMN_IMAGENAME);
        this.imagetype= jsonObject.getString(ImagesLogTable.COLUMN_IMAGETYPE);
        this.isuploaded= jsonObject.getString(ImagesLogTable.COLUMN_ISUPLOADED);
        this.synced= jsonObject.getString(ImagesLogTable.COLUMN_SYNCED);
        this.synced_date= jsonObject.getString(ImagesLogTable.COLUMN_SYNCED_DATE);



        return this;
    }

    public ImagesLogContract Hydrate(Cursor cursor) {
        this._id = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN__ID));
        this._uid = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN__UID));
        this.uuid = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_UUID));
        this.deviceid = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_DEVICEID));
        this.imageuri = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_IMAGEURI));
        this.user = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_USER));
        this.participantid = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_PARTICIPANTID));
        this.imagename = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_IMAGENAME));
        this.imagetype = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_IMAGETYPE));
        this.isuploaded = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_ISUPLOADED));
        this.synced = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(ImagesLogTable.COLUMN_SYNCED_DATE));



        return this;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(ImagesLogTable.COLUMN__ID, this._id == null ? JSONObject.NULL : this._id);
        json.put(ImagesLogTable.COLUMN__UID, this._uid == null ? JSONObject.NULL : this._uid);
        json.put(ImagesLogTable.COLUMN_UUID, this.uuid == null ? JSONObject.NULL : this.uuid);
        json.put(ImagesLogTable.COLUMN_DEVICEID, this.deviceid == null ? JSONObject.NULL : this.deviceid);
        json.put(ImagesLogTable.COLUMN_IMAGEURI, this.imageuri == null ? JSONObject.NULL : this.imageuri);
        json.put(ImagesLogTable.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(ImagesLogTable.COLUMN_PARTICIPANTID, this.participantid == null ? JSONObject.NULL : this.participantid);
        json.put(ImagesLogTable.COLUMN_IMAGENAME, this.imagename == null ? JSONObject.NULL : this.imagename);
        json.put(ImagesLogTable.COLUMN_IMAGETYPE, this.imagetype == null ? JSONObject.NULL : this.imagetype);
        json.put(ImagesLogTable.COLUMN_ISUPLOADED, this.isuploaded == null ? JSONObject.NULL : this.isuploaded);
        json.put(ImagesLogTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(ImagesLogTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);

        return json;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_uid() {
        return _uid;
    }

    public void set_uid(String _uid) {
        this._uid = _uid;
    }

    public String getuuid() {
        return uuid;
    }

    public void setuuid(String uuid) {
        this.uuid = uuid;
    }

    public String getdeviceid() {
        return deviceid;
    }

    public void setdeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getimageuri() {
        return imageuri;
    }

    public void setimageuri(String imageuri) {
        this.imageuri = imageuri;
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

    public String getimagename() {
        return imagename;
    }

    public void setimagename(String imagename) {
        this.imagename = imagename;
    }

    public String getimagetype() {
        return imagetype;
    }

    public void setimagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public String getisuploaded() {
        return isuploaded;
    }

    public void setisuploaded(String isuploaded) {
        this.isuploaded = isuploaded;
    }

    public String getsynced() {
        return synced;
    }

    public void setsynced(String synced) {
        this.synced = synced;
    }

    public String getsynced_date() {
        return synced_date;
    }

    public void setsynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public static abstract class ImagesLogTable implements BaseColumns {
        public static final String TABLE_NAME = "imageslog";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN__UID = "_uid";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_IMAGEURI = "imageuri";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_PARTICIPANTID = "participantid";
        public static final String COLUMN_IMAGENAME = "imagename";
        public static final String COLUMN_IMAGETYPE = "imagetype";
        public static final String COLUMN_ISUPLOADED = "isuploaded";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static String _URL = "uploadimage.php";

    }

}
