package com.fitechsoft.report.domain;

import com.fitechsoft.domain.core.FDEntity;
import com.fitechsoft.domain.core.FDObject;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by chun on 16/8/26.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class FRReportField<T> extends FDObject {

    private String fieldName;

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

//    @Any(metaColumn = @Column(name = "field_type"))
//    @Cascade(CascadeType.ALL)
//    @AnyMetaDef(
//            idType = "long",
//            metaType = "string",
//            metaValues = {
//                    @MetaValue(value = "Integer", targetEntity = Integer.class),
//                    @MetaValue(value = "String", targetEntity = String.class),
//                    @MetaValue(value = "Double", targetEntity = Double.class),
//                    @MetaValue(value = "Date", targetEntity = Date.class)
//            })
//    @JoinColumn(name="FIELDVALUE_ID")
    private T fieldValue;

}
