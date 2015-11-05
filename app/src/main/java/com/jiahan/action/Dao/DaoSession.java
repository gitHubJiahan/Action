package com.jiahan.action.Dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;


import com.jiahan.action.Dao.ThingDao;
import com.jiahan.action.Dao.BookDao;
import com.jiahan.action.Dao.DoubtDao;
import com.jiahan.action.Dao.ExpendDao;
import com.jiahan.action.Dao.SentimentDao;
import com.jiahan.action.Dao.IncomeDao;
import com.jiahan.action.Dao.CofferDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig thingDaoConfig;
    private final DaoConfig bookDaoConfig;
    private final DaoConfig doubtDaoConfig;
    private final DaoConfig expendDaoConfig;
    private final DaoConfig sentimentDaoConfig;
    private final DaoConfig incomeDaoConfig;
    private final DaoConfig cofferDaoConfig;

    private final ThingDao thingDao;
    private final BookDao bookDao;
    private final DoubtDao doubtDao;
    private final ExpendDao expendDao;
    private final SentimentDao sentimentDao;
    private final IncomeDao incomeDao;
    private final CofferDao cofferDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        thingDaoConfig = daoConfigMap.get(ThingDao.class).clone();
        thingDaoConfig.initIdentityScope(type);

        bookDaoConfig = daoConfigMap.get(BookDao.class).clone();
        bookDaoConfig.initIdentityScope(type);

        doubtDaoConfig = daoConfigMap.get(DoubtDao.class).clone();
        doubtDaoConfig.initIdentityScope(type);

        expendDaoConfig = daoConfigMap.get(ExpendDao.class).clone();
        expendDaoConfig.initIdentityScope(type);

        sentimentDaoConfig = daoConfigMap.get(SentimentDao.class).clone();
        sentimentDaoConfig.initIdentityScope(type);

        incomeDaoConfig = daoConfigMap.get(IncomeDao.class).clone();
        incomeDaoConfig.initIdentityScope(type);

        cofferDaoConfig = daoConfigMap.get(CofferDao.class).clone();
        cofferDaoConfig.initIdentityScope(type);

        thingDao = new ThingDao(thingDaoConfig, this);
        bookDao = new BookDao(bookDaoConfig, this);
        doubtDao = new DoubtDao(doubtDaoConfig, this);
        expendDao = new ExpendDao(expendDaoConfig, this);
        sentimentDao = new SentimentDao(sentimentDaoConfig, this);
        incomeDao = new IncomeDao(incomeDaoConfig, this);
        cofferDao = new CofferDao(cofferDaoConfig, this);

        registerDao(Thing.class, thingDao);
        registerDao(Book.class, bookDao);
        registerDao(Doubt.class, doubtDao);
        registerDao(Expend.class, expendDao);
        registerDao(Sentiment.class, sentimentDao);
        registerDao(Income.class, incomeDao);
        registerDao(Coffer.class, cofferDao);
    }
    
    public void clear() {
        thingDaoConfig.getIdentityScope().clear();
        bookDaoConfig.getIdentityScope().clear();
        doubtDaoConfig.getIdentityScope().clear();
        expendDaoConfig.getIdentityScope().clear();
        sentimentDaoConfig.getIdentityScope().clear();
        incomeDaoConfig.getIdentityScope().clear();
        cofferDaoConfig.getIdentityScope().clear();
    }

    public ThingDao getThingDao() {
        return thingDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public DoubtDao getDoubtDao() {
        return doubtDao;
    }

    public ExpendDao getExpendDao() {
        return expendDao;
    }

    public SentimentDao getSentimentDao() {
        return sentimentDao;
    }

    public IncomeDao getIncomeDao() {
        return incomeDao;
    }

    public CofferDao getCofferDao() {
        return cofferDao;
    }

}
