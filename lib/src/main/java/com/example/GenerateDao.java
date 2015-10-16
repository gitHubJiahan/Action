package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by Administrator on 2015/10/16.
 */
public class GenerateDao {
    public static void main(String arg[])throws Exception
    {
        Schema schema = new Schema(1, "com.jiahan.action.Dao");
        addThings(schema);
        addBook(schema);
        addDoubt(schema);
        addExpend(schema);
        addSentiment(schema);
        addIncome(schema);
        new DaoGenerator().generateAll(schema, "H://AndroidStdio");
    }



    //add thing

    private static void addThings(Schema schema)
    {
        Entity thing = schema.addEntity("Thing");
        thing.setTableName("THING");
        thing.addIdProperty();

        thing.addStringProperty("name").notNull();      //
        thing.addStringProperty("type");
        thing.addStringProperty("time");
        thing.addStringProperty("place");
        thing.addStringProperty("rank");
        thing.addStringProperty("notification");


    }



    private static void addBook(Schema schema)
    {
        Entity book = schema.addEntity("Book");
        book.setTableName("BOOK");
        book.addIdProperty();
        book.addStringProperty("bookName").notNull();
        book.addStringProperty("addTime");
        book.addStringProperty("introduction");
        book.addStringProperty("beginTime");
        book.addStringProperty("endTime");
        book.addStringProperty("plan");
        book.addStringProperty("summary");
        book.addIntProperty("readProgress");
        book.addStringProperty("author");
        book.addStringProperty("tag");
    }

    private static void addDoubt(Schema schema)
    {
        Entity doubt = schema.addEntity("Doubt");
        doubt.setTableName("DOUBT");

        doubt.addIdProperty();
        doubt.addStringProperty("question");
        doubt.addStringProperty("answer");
        doubt.addStringProperty("time");
        doubt.addIntProperty("bookId");

    }

    private static void addSentiment(Schema schema)
    {
        Entity sentiment = schema.addEntity("Sentiment");
        sentiment.setTableName("SENTIMENT");

        sentiment.addIdProperty();
        sentiment.addStringProperty("words");
        sentiment.addStringProperty("time");
        sentiment.addIntProperty("booId");
    }


    private static void addExpend(Schema schema)
    {
        Entity expend = schema.addEntity("Expend");
        expend.setTableName("EXPEND");

        expend.addIdProperty();
        expend.addStringProperty("time");
        expend.addDoubleProperty("amount");
        expend.addIntProperty("type");
        expend.addStringProperty("notification");

    }

    private static void addIncome(Schema schema)
    {
        Entity income = schema.addEntity("Income");
        income.setTableName("INCOME");

        income.addIdProperty();
        income.addStringProperty("time");
        income.addDoubleProperty("amount");
        income.addIntProperty("type");
        income.addStringProperty("notification");

    }


}
