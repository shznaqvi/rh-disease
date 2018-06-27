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
    private String f5  = "";
    private String f8 = "";
    private String f9 = "";
    private String f10first = "";
    private String f15first = "";
    private String f10second = "";
    private String f15second = "";
    private String f10_uid = "";
    private String f11 = "";
    private String f12 = "";
    private String f13 = "";
    private String f14 = "";
    private String f16 = "";


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

    public String getf10_uid() {
        return f10_uid;
    }

    public void setf10_uid(String f10_uid) {
        this.f10_uid = f10_uid;
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
        this.f5= jsonObject.getString(RH_ResultsTable.COLUMN_F5);
        this.f8= jsonObject.getString(RH_ResultsTable.COLUMN_F8);
        this.f9= jsonObject.getString(RH_ResultsTable.COLUMN_F9);
        this.f10first= jsonObject.getString(RH_ResultsTable.COLUMN_F10FIRST);
        this.f15first= jsonObject.getString(RH_ResultsTable.COLUMN_F15FIRST);
        this.f10second= jsonObject.getString(RH_ResultsTable.COLUMN_F10SECOND);
        this.f15second= jsonObject.getString(RH_ResultsTable.COLUMN_F15SECOND);
        this.f10_uid= jsonObject.getString(RH_ResultsTable.COLUMN_F10_UID);
        this.f11= jsonObject.getString(RH_ResultsTable.COLUMN_F11);
        this.f12= jsonObject.getString(RH_ResultsTable.COLUMN_F12);
        this.f13= jsonObject.getString(RH_ResultsTable.COLUMN_F13);
        this.f14= jsonObject.getString(RH_ResultsTable.COLUMN_F14);
        this.f16= jsonObject.getString(RH_ResultsTable.COLUMN_F16);



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
        this.f10_uid = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F10_UID));
        this.f5 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F5));
        this.f8 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F8));
        this.f9 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F9));
        this.f10first = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F10FIRST));
        this.f15first = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F15FIRST));
        this.f10second = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F10SECOND));
        this.f15second = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F15SECOND));
        this.f11 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F11));
        this.f12 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F12));
        this.f13 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F13));
        this.f14 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F14));
        this.f16 = cursor.getString(cursor.getColumnIndex(RH_ResultsTable.COLUMN_F16));


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
        json.put(RH_ResultsTable.COLUMN_F10_UID, this.f10_uid == null ? JSONObject.NULL : this.f10_uid);
        json.put(RH_ResultsTable.COLUMN_F5, this.f5 == null ? JSONObject.NULL : this.f5);
        json.put(RH_ResultsTable.COLUMN_F8, this.f8 == null ? JSONObject.NULL : this.f8);
        json.put(RH_ResultsTable.COLUMN_F9, this.f9 == null ? JSONObject.NULL : this.f9);
        json.put(RH_ResultsTable.COLUMN_F10FIRST, this.f10first == null ? JSONObject.NULL : this.f10first);
        json.put(RH_ResultsTable.COLUMN_F15FIRST, this.f15first == null ? JSONObject.NULL : this.f15first);
        json.put(RH_ResultsTable.COLUMN_F10SECOND, this.f10second == null ? JSONObject.NULL : this.f10second);
        json.put(RH_ResultsTable.COLUMN_F15SECOND, this.f15second == null ? JSONObject.NULL : this.f15second);
        json.put(RH_ResultsTable.COLUMN_F11, this.f11 == null ? JSONObject.NULL : this.f11);
        json.put(RH_ResultsTable.COLUMN_F12, this.f12 == null ? JSONObject.NULL : this.f12);
        json.put(RH_ResultsTable.COLUMN_F13, this.f13 == null ? JSONObject.NULL : this.f13);
        json.put(RH_ResultsTable.COLUMN_F14, this.f14 == null ? JSONObject.NULL : this.f14);
        json.put(RH_ResultsTable.COLUMN_F16, this.f16 == null ? JSONObject.NULL : this.f16);


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
        public static final String COLUMN_F10_UID = "f10_uid";
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


        public static String _URL = "rh_results.php";
    }
    }

