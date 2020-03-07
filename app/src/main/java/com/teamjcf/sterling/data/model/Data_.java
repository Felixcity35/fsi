package com.teamjcf.sterling.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_
{
    @SerializedName("AccountName")
    @Expose
    private String accountName;
    @SerializedName("sessionID")
    @Expose
    private String sessionID;
    @SerializedName("AccountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("BVN")
    @Expose
    private String bVN;
    @SerializedName("ResponseText")
    @Expose
    private Object responseText;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBVN() {
        return bVN;
    }

    public void setBVN(String bVN) {
        this.bVN = bVN;
    }

    public Object getResponseText() {
        return responseText;
    }

    public void setResponseText(Object responseText) {
        this.responseText = responseText;
    }

}
