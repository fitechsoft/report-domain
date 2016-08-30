package com.fitechsoft.report.domain;

import com.fitechsoft.domain.core.FDEntity;
import com.fitechsoft.domain.core.FDObject;

import javax.persistence.*;
import java.util.List;

/**
 * Created by chun on 16/8/30.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class FRReportTemplate extends FDObject {


    public FRReportTemplate(String name) {
        this.templateName = name;
    }

    private String templateName;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

}
