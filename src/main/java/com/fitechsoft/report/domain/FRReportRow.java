package com.fitechsoft.report.domain;

import com.fitechsoft.domain.core.FDEntity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chun on 16/8/26.
 */
public class FRReportRow extends FDEntity implements Cloneable {



    public FRReportRow(String name) {
        this.templateName = name;
        this.fields = new HashMap<>();
    }

    private String templateName;

    public String getTemplateName() {
        return templateName;
    }

//    public void setTemplateName(String templateName) {
//        this.templateName = templateName;
//    }


    public Map<String, FRReportField> getFields() {
        return fields;
    }

    public void setFields(Map<String, FRReportField> fields) {
        this.fields = fields;
    }

    @OneToMany
    @Cascade(CascadeType.ALL)
    private Map<String, FRReportField> fields;

    public void addField(FRReportField<?> field) {
        this.fields.put(field.getFieldName(),field);
    }

    @Override
    public FRReportRow clone() throws CloneNotSupportedException {
        FRReportRow newRow = (FRReportRow) super.clone();
        Map<String, FRReportField> fields = new HashMap<>();

        for (Map.Entry<String, FRReportField> field : this.getFields().entrySet()) {
            fields.put(field.getKey(),field.getValue().clone());
        }
        newRow.setFields(fields);

        return newRow;
    }

    public void setFieldWithString(String fieldName, String fieldStringValue){

        FRReportField<?> field = this.getFields().get(fieldName);

        if( null!= field){
            field.setFieldValueWithString(fieldStringValue);
        }

    }

}
