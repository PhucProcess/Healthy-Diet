package com.example.healthyfitness;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConnectDataBase extends SQLiteOpenHelper {

    // database version
    private static final int DATABASE_VERSION = 1;
    // database name

    private static final String DATABASE_NAME = "db_StudentManagement";
    // table name
    private static final String TABLE_PERSON = "tbl_Person";

    // tao cot
    private static final String KEY_ID = "_id";
    private static final String KEY_NAME = "_username";
    private static final String KEY_EMAIL = "_email";
    private static final String KEY_PASS = "_password";

    public ConnectDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String CREATE_PERSON_TABLE = "CREATE TABLE " + TABLE_PERSON + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_EMAIL + " TEXT,"
                + KEY_PASS + " TEXT" + ")";

        sqLiteDatabase.execSQL(CREATE_PERSON_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERSON);
    }

    public Boolean AddUser(String username, String email, String password){
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_NAME, username);
        contentValues.put(KEY_EMAIL, email);
        contentValues.put(KEY_PASS, password);
        long ketqua = myDB.insert(TABLE_PERSON, null, contentValues);
        if(ketqua == -1) return false;
        else{
            return true;
        }
    }

    //Cac phuong thuc kiem tra
    public Boolean CheckAccount(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from "+ TABLE_PERSON
                +" where "+ KEY_NAME + " = ? and " + KEY_PASS + "= ?", new String[] {username, password});
        if(cursor.getCount() > 0){
            return true;
        }
        else
            return false;
    }
}
