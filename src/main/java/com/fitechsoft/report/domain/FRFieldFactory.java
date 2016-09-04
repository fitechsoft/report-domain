package com.fitechsoft.report.domain;

import java.util.Date;

/**
 * Created by chun on 16/9/4.
 */
public class FRFieldFactory {


    public FRReportField<?> getFieldInstance(String fieldName, String fieldType) throws IllegalArgumentException {

        switch (FRSqlType.valueOf(fieldType)) {
            case DATE:
                FRReportField<Date> dateField =  new FRReportField<>(fieldName);
                dateField.setFieldValue(new Date());
                dateField.setSqlType(FRSqlType.DATE);
                return dateField;
            case DOUBLE:
                FRReportField<Double> doubleField =  new FRReportField<>(fieldName);
                doubleField.setFieldValue(new Double(0));
                doubleField.setSqlType(FRSqlType.DOUBLE);
                return doubleField;
            case INTEGER:
                FRReportField<Integer> integerField =  new FRReportField<>(fieldName);
                integerField.setFieldValue(new Integer(0));
                integerField.setSqlType(FRSqlType.INTEGER);
                return integerField;
            case VARCHAR:
                FRReportField<String> stringField =  new FRReportField<>(fieldName);
                stringField.setFieldValue(new String(""));
                stringField.setSqlType(FRSqlType.VARCHAR);
                return stringField;
        }

        throw new IllegalArgumentException("Field type " + fieldName + " not supported!");

    }
}
