package android.support.session5.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gmgn on 8/26/2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {


    public DataBaseHelper(Context context) {
        super(context, "test", null, 1);  //context,Database Name,Cursor,Database version
        System.out.println("from db constractor");
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table mytable (id integer primary key autoincrement,name text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("drop table if exists mytable");
        // Re Create on method  onCreate
        onCreate(sqLiteDatabase);

    }

}