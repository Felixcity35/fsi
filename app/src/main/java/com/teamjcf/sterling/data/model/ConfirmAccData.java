package com.teamjcf.sterling.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConfirmAccData
{


    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private String response;
    @SerializedName("data")
    @Expose
    private Data_ data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Data_ getData() {
        return data;
    }

    public void setData(Data_ data) {
        this.data = data;
    }

}

