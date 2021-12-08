package com.example.sem7project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {
    public static final String DB_Name="sign up";
    public static  final int DB_Version=1;
    public static final String Table_Name="register";
    public static  final int ID=0;
    public static final String Name_col="name";
    public static final String Email_col="email";
    public static final String Number_col="contact";
    public static final String Address_col="address";
    public static final String Password_col="password";






    public DBHandler(Context context) {
        super(context,DB_Name,null,DB_Version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + Table_Name + "("
                + ID + "INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Name_col + " TEXT,"
                + Email_col + " TEXT,"
                + Number_col + " TEXT,"
                + Address_col + " TEXT" +
                 Password_col + "TEXT"+ ")";
        db.execSQL(query);
    }
  public void addValues(String Name,String Email,String Number,String Address,String Password)
   {
       SQLiteDatabase db=this.getWritableDatabase();

       ContentValues values=new ContentValues();
       values.put(Name_col,Name);
       values.put(Email_col,Email);
       values.put(Number_col,Number);
       values.put(Address_col,Address);
       values.put(Password_col,Password);
       db.insert(Table_Name,null,values);
       db.close();
   }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
        onCreate(db);
    }
}
