package com.fitechsoft.report.domain;

import com.fitechsoft.domain.core.FDObject;

import javax.persistence.*;

/**
 * Created by chun on 16/8/26.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class FRReportField<T> extends FDObject implements Cloneable {


    private String fieldName;

    public FRSqlType getSqlType() {
        return sqlType;
    }

    public void setSqlType(FRSqlType sqlType) {
        this.sqlType = sqlType;
    }

    private FRSqlType sqlType;


    public FRReportField(String name) {
        this.fieldName = name;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public T getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(T fieldValue) {
        this.fieldValue = fieldValue;
    }

    private T fieldValue;


    @Override
    protected FRReportField<T> clone() throws CloneNotSupportedException {
        FRReportField<T> newField = (FRReportField<T>) super.clone();


        try {
            newField.setFieldValue((T)newField.getSqlType().getDefaultLangObject());

        } catch (Exception e) {
            return null;
        }
        return newField;

    }

    public void setFieldValueWithString(String stringValue) {
        setFieldValue((T) getSqlType().getLangObject(stringValue));
    }

}
