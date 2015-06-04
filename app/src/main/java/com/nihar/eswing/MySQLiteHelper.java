package com.nihar.eswing;

/**
 * Created by sangn008 on 5/30/15.
 */

        import java.util.LinkedList;
        import java.util.List;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "PlayerDB";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    // Test edit
    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL statement to create book table

        String CREATE_PLAYER_TABLE = "CREATE TABLE player ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT NOT NULL, " +
                "displayName TEXT NOT NULL UNIQUE, " +
                "email TEXT, " +
                "password TEXT, " +
                "golfSwing TEXT, " +
                "usualScore TEXT, " +
                "gender TEXT, " +
                "birthDate TEXT, " +
                "streetAddress TEXT, " +
                "city TEXT, " +
                "state TEXT, " +
                "postalCode TEXT, " +
                "country TEXT, " +
                "shareEmail TEXT, " +
                "inGolfIndustry TEXT, " +
                "golfProfessional TEXT)";


        // create books table
        db.execSQL(CREATE_PLAYER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older books table if existed
        db.execSQL("DROP TABLE IF EXISTS player");

        // create fresh player table
        this.onCreate(db);
    }
    //---------------------------------------------------------------------

    /**
     * CRUD operations (create "add", read "get", update, delete) book + get all player + delete all player
     */

    // player table name
    private static final String TABLE_PLAYER = "player";

    // player Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_DISPLAY_NAME = "displayName";

    private static final String[] COLUMNS = {KEY_ID, KEY_NAME, KEY_DISPLAY_NAME};

    public void addPlayer(Player player) {
        SQLiteDatabase db = this.getWritableDatabase();

        Log.d("addPlayer", player.toString());
        // 1. get reference to writable DB

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, player.name); // get name
        values.put(KEY_DISPLAY_NAME, player.displayName); // get displayName
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());
        values.put(KEY_NAME, player.getName());

        // 3. insert
        db.insert(TABLE_PLAYER, // table
                null, //nullColumnHack
                values); // key/value -> keys = column names/ values = column values
        System.out.println(values.toString());
        // 4. close
        db.close();
    }

    public Player getPlayer(String displayName) {

        // 1. get reference to readable DB
        SQLiteDatabase db = this.getReadableDatabase();

        // 2. build query
        Cursor cursor =
                db.query(TABLE_PLAYER, // a. table
                        COLUMNS, // b. column names
                        " displayName = ?", // c. selections
                        new String[]{String.valueOf(displayName)}, // d. selections args
                        null, // e. group by
                        null, // f. having
                        null, // g. order by
                        null); // h. limit

        // 3. if we got results get the first one
        if (cursor != null)
            cursor.moveToFirst();

        // 4. build book object
        Player book = new Player();
        book.setId(Integer.parseInt(cursor.getString(0)));
        book.setName(cursor.getString(1));
        book.setDisplayName(cursor.getString(2));

        Log.d("getPlayer(" + displayName + ")", book.toString());

        // 5. return book
        return book;
    }

    /*// Get All Books
    public List<Book> getAllBooks() {
        List<Book> player = new LinkedList<Book>();

        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_PLAYER;

        // 2. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        // 3. go over each row, build book and add it to list
        Book book = null;
        if (cursor.moveToFirst()) {
            do {
                book = new Book();
                book.setId(Integer.parseInt(cursor.getString(0)));
                book.setTitle(cursor.getString(1));
                book.setAuthor(cursor.getString(2));

                // Add book to player
                player.add(book);
            } while (cursor.moveToNext());
        }

        Log.d("getAllBooks()", player.toString());

        // return player
        return player;
    }

    // Updating single book
    public int updateBook(Book book) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put("title", book.getTitle()); // get title
        values.put("author", book.getAuthor()); // get author

        // 3. updating row
        int i = db.update(TABLE_PLAYER, //table
                values, // column/value
                KEY_ID+" = ?", // selections
                new String[] { String.valueOf(book.getId()) }); //selection args

        // 4. close
        db.close();

        return i;

    }

    // Deleting single book
    public void deleteBook(Book book) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. delete
        db.delete(TABLE_PLAYER,
                KEY_ID+" = ?",
                new String[] { String.valueOf(book.getId()) });

        // 3. close
        db.close();

        Log.d("deleteBook", book.toString());
        }

*/
}
