package com.fitechsoft.report.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by chun on 16/8/30.
 */
@Entity
public class FRReportESTA extends FRReportTemplate {
    public FRReportESTA(String name) {
        super(name);
    }
//    public static final String TEMPLATE_ESTA = "ESTA";
//
//
//    public FRReportESTA(String accountName, Date createDate, String accountBalance) {
//        super(TEMPLATE_ESTA);
//
//        this.accountName = new AccountNameField(accountName);
//        this.createDate = new DateField(createDate);
//    }
//
//    public AccountNameField getAccountName() {
//        return accountName;
//    }
//
//    public void setAccountName(AccountNameField accountName) {
//        this.accountName = accountName;
//    }
//
//    @OneToOne(cascade = CascadeType.ALL)
//    private AccountNameField accountName;
//
//
//    public DateField getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(DateField createDate) {
//        this.createDate = createDate;
//    }
//
//    @OneToOne(cascade = CascadeType.ALL)
//    private DateField createDate;


//    @Override
//    public List<FRReportField<?>> getFields() {
//        List<FRReportField<?>> fields = new ArrayList<>();
//        fields.add(fieldAccountName);
//        return fields;
//    }
}
