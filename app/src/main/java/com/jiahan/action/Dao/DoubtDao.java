package com.jiahan.action.Dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.jiahan.action.Dao.Doubt;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOUBT".
*/
public class DoubtDao extends AbstractDao<Doubt, Long> {

    public static final String TABLENAME = "DOUBT";

    /**
     * Properties of entity Doubt.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Question = new Property(1, String.class, "question", false, "QUESTION");
        public final static Property Answer = new Property(2, String.class, "answer", false, "ANSWER");
        public final static Property Time = new Property(3, String.class, "time", false, "TIME");
        public final static Property BooK_id = new Property(4, Long.class, "booK_id", false, "BOO_K_ID");
        public final static Property Summary = new Property(5, String.class, "summary", false, "SUMMARY");
    };


    public DoubtDao(DaoConfig config) {
        super(config);
    }
    
    public DoubtDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOUBT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"QUESTION\" TEXT," + // 1: question
                "\"ANSWER\" TEXT," + // 2: answer
                "\"TIME\" TEXT," + // 3: time
                "\"BOO_K_ID\" INTEGER," + // 4: booK_id
                "\"SUMMARY\" TEXT);"); // 5: summary
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOUBT\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Doubt entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String question = entity.getQuestion();
        if (question != null) {
            stmt.bindString(2, question);
        }
 
        String answer = entity.getAnswer();
        if (answer != null) {
            stmt.bindString(3, answer);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(4, time);
        }
 
        Long booK_id = entity.getBooK_id();
        if (booK_id != null) {
            stmt.bindLong(5, booK_id);
        }
 
        String summary = entity.getSummary();
        if (summary != null) {
            stmt.bindString(6, summary);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Doubt readEntity(Cursor cursor, int offset) {
        Doubt entity = new Doubt( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // question
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // answer
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // time
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // booK_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // summary
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Doubt entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setQuestion(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAnswer(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBooK_id(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setSummary(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Doubt entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Doubt entity) {
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
