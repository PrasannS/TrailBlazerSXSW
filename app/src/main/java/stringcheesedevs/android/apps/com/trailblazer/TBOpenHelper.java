package stringcheesedevs.android.apps.com.trailblazer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import stringcheesedevs.android.apps.com.trailblazer.Models.DaoMaster;

public class TBOpenHelper extends DaoMaster.OpenHelper {
    public TBOpenHelper(Context context, String name) {
        super(context, name);
    }

    public TBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
}
