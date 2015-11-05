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
        Schema schema = new Schema(2, "com.jiahan.action.Bean");


        addThings(schema);
        addBook(schema);
        addDoubt(schema);
        addExpend(schema);
        addSentiment(schema);
        addIncome(schema);
        addCoffer(schema);
        new DaoGenerator().generateAll(schema, "F://AndroidStdio");
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
        thing.addIntProperty("tag");
        thing.addStringProperty("summary");
        thing.addStringProperty("plan");


    }



    private static void addBook(Schema schema)
    {
        Entity book = schema.addEntity("Book");
        book.setTableName("BOOK");
        book.addIdProperty();
        book.addStringProperty("StringURL");
        book.addStringProperty("bookName").notNull();
        book.addStringProperty("author");
        book.addStringProperty("language");
        book.addStringProperty("introduction");
        book.addStringProperty("addTime");
        book.addIntProperty("type");
        book.addStringProperty("plane");
        book.addIntProperty("readProgress");
        book.addIntProperty("tag");
        book.addStringProperty("finish");
    }

    private static void addDoubt(Schema schema)
    {
        Entity doubt = schema.addEntity("Doubt");
        doubt.setTableName("DOUBT");

        doubt.addIdProperty();
        doubt.addStringProperty("question");
        doubt.addStringProperty("answer");
        doubt.addStringProperty("time");
        doubt.addLongProperty("boo_id");
        doubt.addStringProperty("summary");

    }

    private static void addSentiment(Schema schema)
    {
        Entity sentiment = schema.addEntity("Sentiment");
        sentiment.setTableName("SENTIMENT");

        sentiment.addIdProperty();
        sentiment.addStringProperty("words");
        sentiment.addStringProperty("time");
        sentiment.addLongProperty("book_id");
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
    private static void addCoffer(Schema schema)
    {
        Entity coffer = schema.addEntity("Coffer");
        coffer.setTableName("Coffer");
        coffer.addDoubleProperty("money");
        coffer.addIntProperty("password");

    }


}
