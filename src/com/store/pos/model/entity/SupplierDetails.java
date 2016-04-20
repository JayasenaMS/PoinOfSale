/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.pos.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Sanjeewa;
 */
@Entity
public class SupplierDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long supplierID;
    
    private String supplierName;
    private String contactName;
    private int telNo;
    private int faxNo;
    private String address;
    private String addressField1;
    private String addressField2;
    private String addressField3;
    private String category; //government or private
    private int loan; // given loan price
    private String loanPeriod; //ex: one month

    public Long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Long id) {
        this.supplierID = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierID != null ? supplierID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierDetails)) {
            return false;
        }
        SupplierDetails other = (SupplierDetails) object;
        if ((this.supplierID == null && other.supplierID != null) || (this.supplierID != null && !this.supplierID.equals(other.supplierID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.store.pos.model.entity.SupplierDetails[ SupplierID=" + supplierID + " ]";
    }

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * @param contactName the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @return the telNo
     */
    public int getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }

    /**
     * @return the faxNo
     */
    public int getFaxNo() {
        return faxNo;
    }

    /**
     * @param faxNo the faxNo to set
     */
    public void setFaxNo(int faxNo) {
        this.faxNo = faxNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the loan
     */
    public int getLoan() {
        return loan;
    }

    /**
     * @param loan the loan to set
     */
    public void setLoan(int loan) {
        this.loan = loan;
    }

    /**
     * @return the loanPeriod
     */
    public String getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * @param loanPeriod the loanPeriod to set
     */
    public void setLoanPeriod(String loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    /**
     * @return the addressField1
     */
    public String getAddressField1() {
        return addressField1;
    }

    /**
     * @param addressField1 the addressField1 to set
     */
    public void setAddressField1(String addressField1) {
        this.addressField1 = addressField1;
    }

    /**
     * @return the addressField2
     */
    public String getAddressField2() {
        return addressField2;
    }

    /**
     * @param addressField2 the addressField2 to set
     */
    public void setAddressField2(String addressField2) {
        this.addressField2 = addressField2;
    }

    /**
     * @return the addressField3
     */
    public String getAddressField3() {
        return addressField3;
    }

    /**
     * @param addressField3 the addressField3 to set
     */
    public void setAddressField3(String addressField3) {
        this.addressField3 = addressField3;
    }
    
}
