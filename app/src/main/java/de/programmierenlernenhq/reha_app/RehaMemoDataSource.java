package de.programmierenlernenhq.reha_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;


public class RehaMemoDataSource {

    private static final String LOG_TAG = RehaMemoDataSource.class.getSimpleName();

    private SQLiteDatabase database;
    private RehaMemoDataSource dbHelper;


    public RehaMemoDataSource(Context context) {
        Log.d(LOG_TAG, "Unsere DataSource erzeugt jetzt den dbHelper.");
        dbHelper = new RehaMemoDataSource(context);
    }
}