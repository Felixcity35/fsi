package com.teamjcf.sterling.json;


import com.teamjcf.sterling.data.model.BankTransferResponse;
import com.teamjcf.sterling.data.model.ConfirmAccDetailsResponse;
import com.teamjcf.sterling.data.model.TransferRequest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface jsonApi
{
    @Headers({"Sandbox-Key: a02e9790bf8bcde419107861e95675ff",
      "Ocp-Apim-Subscription-Key: t","Ocp-Apim-Trace :true","Appid: 69","Content-Type: application/json","ipval: 0"})
    @FormUrlEncoded
    @GET("/sterling/TransferAPIs/api/Spay/InterbankNameEnquiry?")
    Call<ConfirmAccDetailsResponse> ConfirmAccDetails (@Field("Referenceid") String refId,
                                                       @Field("RequestType") String requestType,
                                                       @Field("Translocation") String transLoca,
                                                       @Field("ToAccount") String toAcc,
                                                       @Field("destinationbankcode") String desBankcode);



    @Headers({"Sandbox-Key: a02e9790bf8bcde419107861e95675ff",
            "Ocp-Apim-Subscription-Key: t","Ocp-Apim-Trace :true","Appid: 69","Content-Type: application/json","ipval: 0"})
    @POST("/sterling/accountapi/api/Spay/InterbankTransferReq")
    Call<BankTransferResponse> InterbankTransfer(@Body TransferRequest transferRequest);


}
