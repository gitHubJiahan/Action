package com.jiahan.action.Utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015/8/31.
 */
public class DateUtil {


    public static String getDateString(Date date)
    {
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simple.format(date);
    }


    public static String getYearString(String date) {
        if (date != null) {
            return date.substring(0, 4);
        } else {
            return null;
        }
    }

    public static String getMonthString(String date)
    {
        if (date != null) {
            return date.substring(5, 7);
        } else {
            return null;
        }

    }



    public static String getDayString(String data)
    {
        if(data != null)
        {
            return data.substring(8, 10);
        }else
        {
            return null;
        }
    }



    public static String getTimeString(String data)
    {
        if(data != null)
        {
            return data.substring(data.indexOf(" ") + 1);
        }else
        {
            return null;
        }
    }

    /*

     */
    public static boolean compareYear(String date1,String date2)
    {
        if(getYearString(date1).equals(getYearString(date2)))
        {
            return true;
        }
        return  false;
    }


    public static boolean compareYearAndMonth(String date1,String date2)
    {
        if(compareYear(date1, date2))
        {
            if(getMonthString(date1).equals(date2))
                return true;
        }
        return false;

    }

    public static boolean compareYMDay(String date1,String date2)
    {
        if(compareYearAndMonth(date1, date2))
        {
            if(getDayString(date1).equals(getDayString(date2)))
                return true;
        }
        return false;
    }

   /* public static List<String> getWendayFromNow(String stringData)
    {
        List<String> mDate = new ArrayList<String>();

        String syear = getYearString(stringData);
        String smonth = getMonthString(stringData);
        String sday = getDayString(stringData);

        int iyear = Integer.parseInt(syear);
        int imonth = Integer.parseInt(smonth);
        int iday  = Integer.parseInt(sday);

        if (iday / 7 >= 1)
        {
                int day_branch_1 = day%7 ;
                int day_branch_2 = 7 - day%7;
                if(1 == month)
                {
                    for(int i=0 ; i< day_branch_1; i++) {
                        String mday = Integer.toString(day);
                        if (mday.length() == 1) {
                            mday = "0" + mday +year;
                        }else
                        {
                            mday = "0" + mday +year;
                        }
                        mDays.add(mday);
                        day--;
                    }
                }else
                {

                    for(int i=0 ; i< day_branch_1; i++) {
                        String mday = Integer.toString(day);
                        String myear = getYearString(dateNow);
                        String mmonth = getMonthString(dateNow);

                        if (mday.length() == 1) {
                            mday = myear + "-" + mmonth + "-" + "0" + mday;
                        }else
                        {
                            mday = myear + "-" + mmonth + "-" + mday;
                        }
                        mDate.add(mday);
                        day--;
                    }
                    for(int i=0 ; i<day_branch_2; i++)
                    {
                        day = getdays(month-1,year);
                        String mday = Integer.toString(day);
                        if (mday.length() == 1) {
                            mday = "0" + mday;
                        }
                        mDays.add(mday);
                        day--;
                    }
                }
        }else
        {
            for(int i=0; i<7;i++)
            {

                String mday = Integer.toString(iday);
                if(mday.length() == 1)
                {
                    mday = syear + "-" + smonth +"-" + "0" + mday;
                }
                mDays.add(mday);
                day--;
            }
        }
        return mDate;

    }
*/
    public static boolean judgeCommomYear(int year)
    {
        if(year%4 == 0 && year%100 != 0)
        {
            return false;
        }
        return  true;
    }

    public static int getdays (int month,int year)
    {
        int mdays = 0;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                mdays = 31;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                mdays = 30;
            break;
            case 2:
            {
                if(judgeCommomYear(year)){
                    mdays = 28;
                }else {
                    return 29;
                }
            }
            break;
            default:
                break;
        }
        return mdays;
    }


}
