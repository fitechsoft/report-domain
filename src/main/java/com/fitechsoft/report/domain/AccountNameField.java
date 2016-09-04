package com.fitechsoft.report.domain;

import javax.persistence.Entity;

/**
 * Created by chun on 16/8/31.
 */
@Entity
public class AccountNameField extends FRReportField<String> {

    public static final String FIELD_ACCOUNTNAME = "户名";

    public AccountNameField(String name, String accountName){
        super(name);
        super.setFieldName(FIELD_ACCOUNTNAME);
        super.setFieldValue(accountName);
    }
}
