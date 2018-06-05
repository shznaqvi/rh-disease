package edu.aku.hassannaqvi.rhdisease.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class rh_resultsContract {

    private String _id = "";
    private String participantid = "";
    private String lmp = "";
    private String form5_uid = "";
    private String isrhCompleted = "";
    private String rh_status = "";
    private String ga_weeks = "";
    private String ga_days = "";
    private String f10_acceptance = "";
    private String f15_adverse = "";

    public String getIsrhCompleted() {
        return isrhCompleted;
    }

    public void setIsrhCompleted(String isrhCompleted) {
        this.isrhCompleted = isrhCompleted;
    }

    public String getRh_status() {
        return rh_status;
    }

    public void setRh_status(String rh_status) {
        this.rh_status = rh_status;
    }

    public String getGa_weeks() {
        return ga_weeks;
    }

    public void setGa_weeks(String ga_weeks) {
        this.ga_weeks = ga_weeks;
    }

    public String getGa_days() {
        return ga_days;
    }

    public void setGa_days(String ga_days) {
        this.ga_days = ga_days;
    }

    public String getForm5_uid() {
        return form5_uid;
    }

    public void setForm5_uid(String form5_uid) {
        this.form5_uid = form5_uid;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getParticipantid() {
        return participantid;
    }

    public void setParticipantid(String participantid) {
        this.participantid = participantid;
    }

    public String getLmp() {
        return lmp;
    }

    public void setLmp(String lmp) {
        this.lmp = lmp;
    }

    public String getF10_acceptance() {
        return f10_acceptance;
    }

    public void setF10_acceptance(String f10_acceptance) {
        this.f10_acceptance = f10_acceptance;
    }

    public String getF15_adverse() {
        return f15_adverse;
    }

    public void setF15_adverse(String f15_adverse) {
        this.f15_adverse = f15_adverse;
    }

    public rh_resultsContract Sync(JSONObject jsonObject) throws JSONException {
        this.participantid= jsonObject.getString(RH_ResultsTable.COLUMN_PARTICIPANTID);
        this.lmp= jsonObject.getString(RH_ResultsTable.COLUMN_LMP);
        this.isrhCompleted= jsonObject.getString(RH_ResultsTable.COLUMN_ISRHCOMPLETED);
        this.rh_status= jsonObject.getString(RH_ResultsTable.COLUMN_RH_STATUS);
        this.ga_weeks= jsonObject.getString(RH_ResultsTable.COLUMN_GA_WEEKS);
        this.ga_days= jsonObject.getString(RH_ResultsTable.COLUMN_GA_DAYS);
        this.form5_uid= jsonObject.getString(RH_ResultsTable.COLUMN_FORM5_UID);
        this.f10_acceptance= jsonObject.getString(RH_ResultsTable.COLUMN_F10_ACCEPTANCE);
        this.f15_adverse= jsonObject.getString(RH_ResultsTable.COLUMN_F15_ADVERSE);



        return this;
    }

    public rh_resultsContract Hydrate(Cursor cursor) {
        this._id = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN__ID));
        this.participantid = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_PARTICIPANTID));
        this.lmp = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_LMP));
        this.isrhCompleted = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_ISRHCOMPLETED));
        this.rh_status = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_RH_STATUS));
        this.ga_weeks = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_GA_WEEKS));
        this.ga_days = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_GA_DAYS));
        this.form5_uid = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_FORM5_UID));
        this.f10_acceptance = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F10_ACCEPTANCE));
        this.f15_adverse = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F15_ADVERSE));


        return this;
    }
    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(RH_ResultsTable.COLUMN__ID, this._id == null ? JSONObject.NULL : this._id);
        json.put(RH_ResultsTable.COLUMN_PARTICIPANTID, this.participantid == null ? JSONObject.NULL : this.participantid);
        json.put(RH_ResultsTable.COLUMN_LMP, this.lmp == null ? JSONObject.NULL : this.lmp);
        json.put(RH_ResultsTable.COLUMN_ISRHCOMPLETED, this.isrhCompleted == null ? JSONObject.NULL : this.isrhCompleted);
        json.put(RH_ResultsTable.COLUMN_RH_STATUS, this.rh_status == null ? JSONObject.NULL : this.rh_status);
        json.put(RH_ResultsTable.COLUMN_GA_WEEKS, this.ga_weeks == null ? JSONObject.NULL : this.ga_weeks);
        json.put(RH_ResultsTable.COLUMN_GA_DAYS, this.ga_days == null ? JSONObject.NULL : this.ga_days);
        json.put(RH_ResultsTable.COLUMN_FORM5_UID, this.form5_uid == null ? JSONObject.NULL : this.form5_uid);
        json.put(RH_ResultsTable.COLUMN_F10_ACCEPTANCE, this.f10_acceptance == null ? JSONObject.NULL : this.f10_acceptance);
        json.put(RH_ResultsTable.COLUMN_F15_ADVERSE, this.f15_adverse == null ? JSONObject.NULL : this.f15_adverse);


        return json;
    }
    public static abstract class RH_ResultsTable implements BaseColumns {
        public static final String TABLE_NAME = "rh_results";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN_PARTICIPANTID = "participantid";
        public static final String COLUMN_LMP = "lmp";
        public static final String COLUMN_FORM5_UID = "form5_uid";
        public static final String COLUMN_ISRHCOMPLETED = "isrhCompleted";
        public static final String COLUMN_RH_STATUS = "rh_status";
        public static final String COLUMN_GA_WEEKS = "ga_weeks";
        public static final String COLUMN_GA_DAYS = "ga_days";
        public static final String COLUMN_F10_ACCEPTANCE = "f10_acceptance";
        public static final String COLUMN_F15_ADVERSE = "f15_adverse";

        public static String _URL = "rh_results.php";
    }
    }

