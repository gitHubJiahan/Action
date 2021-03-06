package com.jiahan.action.Dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.jiahan.action.Dao.Summary;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SUMMARY".
*/
public class SummaryDao extends AbstractDao<Summary, Long> {

    public static final String TABLENAME = "SUMMARY";

    /**
     * Properties of entity Summary.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Time = new Property(1, java.util.Date.class, "time", false, "TIME");
        public final static Property Words = new Property(2, String.class, "words", false, "WORDS");
        public final static Property Book_id = new Property(3, Long.class, "book_id", false, "BOOK_ID");
    };


    public SummaryDao(DaoConfig config) {
        super(config);
    }
    
    public SummaryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SUMMARY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TIME\" INTEGER," + // 1: time
                "\"WORDS\" TEXT," + // 2: words
                "\"BOOK_ID\" INTEGER);"); // 3: book_id
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SUMMARY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Summary entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        java.util.Date time = entity.getTime();
        if (time != null) {
            stmt.bindLong(2, time.getTime());
        }
 
        String words = entity.getWords();
        if (words != null) {
            stmt.bindString(3, words);
        }
 
        Long book_id = entity.getBook_id();
        if (book_id != null) {
            stmt.bindLong(4, book_id);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Summary readEntity(Cursor cursor, int offset) {
        Summary entity = new Summary( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)), // time
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // words
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3) // book_id
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Summary entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTime(cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)));
        entity.setWords(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBook_id(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Summary entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Summary entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
