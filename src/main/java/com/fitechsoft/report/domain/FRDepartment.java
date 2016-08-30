package com.fitechsoft.report.domain;

import com.fitechsoft.domain.core.FDSubject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * The class represents departments in some institution.

 * @author Chun Cao
 */
@Entity
public class FRDepartment extends FDSubject {


    public FRDepartment(String departmentName) {
        super(departmentName);
        subDepartments = new HashSet<FRDepartment>();
        staff = new HashSet<FRUser>();
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false)
    private Set<FRDepartment> subDepartments;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false)
    private Set<FRUser> staff;


    @Override
    public void setSuperior(FDSubject superior) {

        if (!(superior instanceof FRInstitution || superior instanceof FRDepartment)) {
            throw new IllegalArgumentException();
        }

        super.setSuperior(superior);

        if (superior instanceof FRInstitution){
            ((FRInstitution) superior).addDepartment(this);
        }else{
            ((FRDepartment) superior).addSubDepartment(this);
        }

    }

    private void addSubDepartment(FRDepartment department) {
        this.subDepartments.add(department);
    }

    public Set<FRDepartment> getSubDepartments() {
        return this.subDepartments;
    }

    public Set<FRUser> getStaff() {
        return staff;
    }

    protected void addOneToStaff(FRUser one) {
        this.staff.add(one);
    }

}
