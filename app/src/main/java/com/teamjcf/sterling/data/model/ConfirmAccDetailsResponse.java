package com.teamjcf.sterling.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConfirmAccDetailsResponse {


    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private ConfirmAccData data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ConfirmAccData getData() {
        return data;
    }

    public void setConfirmAccData(ConfirmAccData data) {
        this.data = data;
    }

}
