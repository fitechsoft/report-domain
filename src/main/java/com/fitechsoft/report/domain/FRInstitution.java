package com.fitechsoft.report.domain;

import com.fitechsoft.domain.core.FDSubject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * The class represents institutions aka Banks here.

 * @author Chun Cao
 */
@Entity
public class FRInstitution extends FDSubject {

    public FRInstitution(String institutionID) {
        super(institutionID);
        this.inferiors = new HashSet<FRInstitution>();
        this.departments = new HashSet<FRDepartment>();
    }


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false)
    private Set<FRInstitution> inferiors;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false)
    private Set<FRDepartment> departments;


    @Override
    public void setSuperior(FDSubject superior) {

        if (!(superior instanceof FRInstitution)) {
            throw new IllegalArgumentException();
        }

        super.setSuperior(superior);
        ((FRInstitution) superior).addInferiorInstitution(this);
    }


    private void addInferiorInstitution(FRInstitution inferior) {
        this.inferiors.add(inferior);
    }

    public Set<FRInstitution> getInferiors() {
        return this.inferiors;
    }

    public Set<FRDepartment> getDepartments() {
        return this.departments;
    }

    public void addDepartment(FRDepartment department) {
        this.departments.add(department);
    }
}
