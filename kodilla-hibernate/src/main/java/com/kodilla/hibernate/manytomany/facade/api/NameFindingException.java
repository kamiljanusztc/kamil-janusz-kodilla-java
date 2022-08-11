package com.kodilla.hibernate.manytomany.facade.api;

public class NameFindingException extends Exception {

    public static String ERR_EMPLOYEE_NOT_FOUND = "Cannot find this employee";
    public static String ERR_COMPANY_NOT_FOUND = "Cannot find this company";

    public NameFindingException(String message) {
        super(message);
    }
}
