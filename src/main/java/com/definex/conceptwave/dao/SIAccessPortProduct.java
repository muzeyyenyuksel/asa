package com.definex.conceptwave.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SI_ACCESS_PORT_PRODUCT")
public class SIAccessPortProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PI_CW_ID")
    private String  pICWID;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "SUBSCRIPTION_ID")
    private String subscriptionId;

    @Column(name = "PARENT_SUBSCRIPTION_ID")
    private String parentSubscriptionId;

    @Column(name = "PRODUCT_STATUS")
    private String productStatus;

    @Column(name = "ACTION_TYPE")
    private String actionType;

    @Column(name = "BILLING_ACCOUNT_ID")
    private String billingAccountId;

    @Column(name = "SERVICE_ORDER_ID")
    private String serviceOrderId;

    @Column(name = "OI_RELATION_ID")
    private String oiRelationId;

    @Column(name = "UPDATEDDATE")
    private Date updateDate;

    @Column(name = "NOTE")
    private String note;

    public SIAccessPortProduct() {}

    public SIAccessPortProduct(String  pICWID, String productCode, String subscriptionId, String parentSubscriptionId, String productStatus, String actionType, String billingAccountId,
                               String serviceOrderId, String oiRelationId, Date updateDate, String note) {
        this.pICWID = pICWID;
        this.productCode = productCode;
        this.subscriptionId = subscriptionId;
        this.parentSubscriptionId = parentSubscriptionId;
        this.productStatus = productStatus;
        this.actionType = actionType;
        this.billingAccountId = billingAccountId;
        this.serviceOrderId = serviceOrderId;
        this.oiRelationId = oiRelationId;
        this.updateDate = updateDate;
        this.note = note;
    }

    public String getpICWID() {
        return pICWID;
    }

    public void setpICWID(String pICWID) {
        this.pICWID = pICWID;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getParentSubscriptionId() {
        return parentSubscriptionId;
    }

    public void setParentSubscriptionId(String parentSubscriptionId) {
        this.parentSubscriptionId = parentSubscriptionId;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public String getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(String serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getOiRelationId() {
        return oiRelationId;
    }

    public void setOiRelationId(String oiRelationId) {
        this.oiRelationId = oiRelationId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
