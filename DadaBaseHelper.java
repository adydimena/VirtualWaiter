package com.example.ady.virtualwaiter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ady on 11/13/2017.
 */


public class DadaBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_BASE ="MENU.DB";
    public static final String TABLE_NAME = "MENU_TABLE";
    public static final String COL_1 = "PLATES";
    public static final String COL_2 = "PRICE";
    public DadaBaseHelper(Context context) {
        super(context, DATABASE_BASE, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME + " (PLATES TEXT PRIMARY KEY,PRICE DOUBLE)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
    public boolean insertData (String plates, double price){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,plates);
        contentValues.put(COL_2,price);
        long row  = database.insert(TABLE_NAME,null,contentValues);

        if (row == -1)
            return false;
        else
            return true;
    }
    public Cursor getallgata()
    {
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor results = database.rawQuery("SELECT * FROM "+ TABLE_NAME,null);
        return  results;
    }

}
