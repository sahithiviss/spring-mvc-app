package com.dbs.springmvcapp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateAccept {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMMMM-YYYY EEE zzzzz ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date in dd-MM-yy format");
        String strDate = scanner.next();
        Date date = format.parse(strDate);
        System.out.println(outputFormat.format(date));
        scanner.close();

    }
}