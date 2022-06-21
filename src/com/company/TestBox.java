package com.company;

import java.awt.dnd.DropTarget;
import java.util.Calendar;
import java.util.Date;

public class TestBox {

    Integer i;
    int j;

    public static void main (String[] args) {
        /*TestBox t = new TestBox();
        t.go();
*/
        String s = "2";
        int x = Integer.parseInt(s);
        double d = Double.parseDouble("420.24");
        boolean b = new Boolean("true").booleanValue();
        System.out.println(x);
        System.out.println(d);
        System.out.println(b);

        double dd = 42.5;
        /*String doubleString = "" + dd;
        System.out.println(dd);
        */
        String doubleString2 = Double.toString(dd);
        System.out.println(dd);

        String ss = String.format("%,d", 10000000);
        System.out.println(ss);

        String aa = String.format("I have %.2f, bugs to fix.", 476578.09876);
        System.out.println(aa);

        int one = 20456654;
        double two = 100567890.248907;
        String bb = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(bb);

        String cc = String.format("%tc", new Date());
        System.out.println(cc);

        String onlytime = String.format("%tr", new Date());
        System.out.println(onlytime);

        Date today = new Date();
        String yearmonthday = String.format("%tA, %<tB, %<td", today);
        System.out.println(yearmonthday);

        System.out.println("Calendar>>>>>");
        Calendar cal = Calendar.getInstance();
        cal.set(2004,1,7,15,40);
        System.out.println("HOUR:" + cal.get(cal.HOUR_OF_DAY));
        long day1 = cal.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        cal.setTimeInMillis(day1);
        System.out.println("NEW HOUR:" + cal.get(cal.HOUR_OF_DAY));
        cal.add(cal.DATE, 35);
        System.out.println(cal.getTime());
        cal.roll(cal.DATE, 35);
        cal.set(cal.DATE, 1);
        System.out.println(cal.getTime());



    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
