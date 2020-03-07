package com.teamjcf.sterling.data.model;

public class TransferRequest
{
    public TransferRequest() {
    }

    public TransferRequest(String translocation, String destinationBankCode, String paymentReference, String translocation1, String amount, String benefiName, String toAccount, String referenceid, String originatorAccountName, String fromAccount, String NEResponse, String sessionID, String requestType) {
        Translocation = translocation;
        DestinationBankCode = destinationBankCode;
        PaymentReference = paymentReference;
        this.translocation = translocation1;
        Amount = amount;
        BenefiName = benefiName;
        ToAccount = toAccount;
        Referenceid = referenceid;
        OriginatorAccountName = originatorAccountName;
        FromAccount = fromAccount;
        this.NEResponse = NEResponse;
        SessionID = sessionID;
        RequestType = requestType;
    }

    private String Translocation;

        private String DestinationBankCode;

        private String PaymentReference;

        private String translocation;

        private String Amount;

        private String BenefiName;

        private String ToAccount;

        private String Referenceid;

        private String OriginatorAccountName;

        private String FromAccount;

        private String NEResponse;

        private String SessionID;

        private String RequestType;

        public String getTranslocation ()
        {
            return Translocation;
        }

        public void setTranslocation (String Translocation)
        {
            this.Translocation = Translocation;
        }

        public String getDestinationBankCode ()
        {
            return DestinationBankCode;
        }

        public void setDestinationBankCode (String DestinationBankCode)
        {
            this.DestinationBankCode = DestinationBankCode;
        }

        public String getPaymentReference ()
        {
            return PaymentReference;
        }

        public void setPaymentReference (String PaymentReference)
        {
            this.PaymentReference = PaymentReference;
        }

//        public String getTranslocation ()
//        {
//            return translocation;
//        }
//
//        public void setTranslocation (String translocation)
//        {
//            this.translocation = translocation;
//        }

        public String getAmount ()
        {
            return Amount;
        }

        public void setAmount (String Amount)
        {
            this.Amount = Amount;
        }

        public String getBenefiName ()
        {
            return BenefiName;
        }

        public void setBenefiName (String BenefiName)
        {
            this.BenefiName = BenefiName;
        }

        public String getToAccount ()
        {
            return ToAccount;
        }

        public void setToAccount (String ToAccount)
        {
            this.ToAccount = ToAccount;
        }

        public String getReferenceid ()
        {
            return Referenceid;
        }

        public void setReferenceid (String Referenceid)
        {
            this.Referenceid = Referenceid;
        }

        public String getOriginatorAccountName ()
        {
            return OriginatorAccountName;
        }

        public void setOriginatorAccountName (String OriginatorAccountName)
        {
            this.OriginatorAccountName = OriginatorAccountName;
        }

        public String getFromAccount ()
        {
            return FromAccount;
        }

        public void setFromAccount (String FromAccount)
        {
            this.FromAccount = FromAccount;
        }

        public String getNEResponse ()
        {
            return NEResponse;
        }

        public void setNEResponse (String NEResponse)
        {
            this.NEResponse = NEResponse;
        }

        public String getSessionID ()
        {
            return SessionID;
        }

        public void setSessionID (String SessionID)
        {
            this.SessionID = SessionID;
        }

        public String getRequestType ()
        {
            return RequestType;
        }

        public void setRequestType (String RequestType)
        {
            this.RequestType = RequestType;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [Translocation = "+Translocation+", DestinationBankCode = "+DestinationBankCode+", PaymentReference = "+PaymentReference+", translocation = "+translocation+", Amount = "+Amount+", BenefiName = "+BenefiName+", ToAccount = "+ToAccount+", Referenceid = "+Referenceid+", OriginatorAccountName = "+OriginatorAccountName+", FromAccount = "+FromAccount+", NEResponse = "+NEResponse+", SessionID = "+SessionID+", RequestType = "+RequestType+"]";
        }
    }

