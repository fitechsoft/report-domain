package com.fitechsoft.report.domain;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by chun on 16/8/31.
 */
@Entity
public class DateField extends FRReportField<Date> {

    public static final String FIELD_DATE = "日期";

    public DateField(String name, Date date){
        super(name);
        super.setFieldName(FIELD_DATE);
        super.setFieldValue(date);
    }
}

