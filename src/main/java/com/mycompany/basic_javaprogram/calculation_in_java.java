/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic_javaprogram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author rssk1
 */
public class calculation_in_java {

    public static String finddiff(LocalDate s_date, LocalDate e_date) {
       

        Period diff = Period.between(s_date, e_date);

        String date_diff = "difference in dates : " + diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days";
        
        return date_diff;
    }

    public static String timedeiff(String st_date, String en_date) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY HH:mm:ss");

        Date d1 = sdf.parse(st_date);
        Date d2 = sdf.parse(en_date);

        long diff_in_time = d2.getTime() - d1.getTime();

        final long hours = TimeUnit.MILLISECONDS.toHours(diff_in_time)
                - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(diff_in_time));
        final long minutes = TimeUnit.MILLISECONDS.toMinutes(diff_in_time)
                - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(diff_in_time));
        final long seconds = TimeUnit.MILLISECONDS.toSeconds(diff_in_time)
                - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(diff_in_time));

       
        String time_diff =  hours + " hours " + minutes + " mins " + seconds + " secs ";

        return time_diff;
    }

    public static void main(String[] args) throws ParseException {
        calculation_in_java dc = new calculation_in_java();

        LocalDate s_date
                = LocalDate.of(1998, 8, 10);

        LocalDate e_date = LocalDate.of(2023, 2, 27);

//        dc.finddiff(s_date, e_date);
//        dc.timedeiff("10-08-1998 06:30:00", "24-02-2023 04:30:50");

        System.out.println(finddiff(s_date, e_date)+ " " + timedeiff("10-08-1998 06:30:00", "27-02-2023 06:30:50"));

    }

}
