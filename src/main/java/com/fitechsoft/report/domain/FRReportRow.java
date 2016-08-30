package com.fitechsoft.report.domain;

import com.fitechsoft.domain.core.FDEntity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by chun on 16/8/26.
 */
public class FRReportRow extends FDEntity {

    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<FRReportField> fields;

}
