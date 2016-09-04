package com.fitechsoft.report.domain;

import java.util.Date;
import java.util.Objects;

/**
 * Created by chun on 16/9/4.
 */
public enum FRSqlType {
    DATE("DATE"),
    VARCHAR("VARCHAR"),
    INTEGER("INTEGER"),
    DOUBLE("DOUBLE");

    private String typeString;

    private FRSqlType(String typeString) {
        this.typeString = typeString;
    }

    public Class<?> getLangType() {

        switch (this) {
            case DATE:
                return Date.class;
            case VARCHAR:
                return String.class;
            case INTEGER:
                return Integer.class;
            case DOUBLE:
                return Double.class;
            default:
                return Objects.class;
        }
    }

    public Object getLangObject(String stringValue) {

        switch (this) {
            case DATE:
                //TODO: it's not right here yet
                return Date.parse(stringValue);
            case VARCHAR:
                return stringValue;
            case INTEGER:
                return Integer.parseInt(stringValue);
            case DOUBLE:
                return Double.parseDouble(stringValue);
            default:
                return null;
        }
    }

    public Object getDefaultLangObject() {

        switch (this) {
            case DATE:
                //TODO: it's not right here yet
                return new Date();
            case VARCHAR:
                return new String("");
            case INTEGER:
                return new Integer(0);
            case DOUBLE:
                return new Double(0);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return typeString;
    }
}
