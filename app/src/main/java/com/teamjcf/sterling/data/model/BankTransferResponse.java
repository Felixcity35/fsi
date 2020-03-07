package com.teamjcf.sterling.data.model;

public class BankTransferResponse
{

        private Data data;

        private String message;

        public Data getData ()
        {
            return data;
        }

        public void setData (Data data)
        {
            this.data = data;
        }

        public String getMessage ()
        {
            return message;
        }

        public void setMessage (String message)
        {
            this.message = message;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [data = "+data+", message = "+message+"]";
        }
    }



