package com.fitechsoft.report.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by chun on 16/8/30.
 */
@Entity
public class FRReportESTA extends FRReportTemplate {

    public static final String TEMPLATE_ESTA = "ESTA";


    public FRReportESTA(String accountName, Date createDate, String accountBalance) {
        super(TEMPLATE_ESTA);

        fieldAccountName = new AccountNameField(accountName);
        this.createDate = new DateField(createDate);
    }

    public AccountNameField getFieldAccountName() {
        return fieldAccountName;
    }

    public void setFieldAccountName(AccountNameField fieldAccountName) {
        this.fieldAccountName = fieldAccountName;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private AccountNameField fieldAccountName;


    public DateField getCreateDate() {
        return createDate;
    }

    public void setCreateDate(DateField createDate) {
        this.createDate = createDate;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private DateField createDate;


//    @Override
//    public List<FRReportField<?>> getFields() {
//        List<FRReportField<?>> fields = new ArrayList<>();
//        fields.add(fieldAccountName);
//        return fields;
//    }
}
