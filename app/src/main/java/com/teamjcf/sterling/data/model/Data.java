package com.teamjcf.sterling.data.model;

public class Data
{
        private String ResponseText;

        private String status;

        public String getResponseText ()
        {
            return ResponseText;
        }

        public void setResponseText (String ResponseText)
        {
            this.ResponseText = ResponseText;
        }

        public String getStatus ()
        {
            return status;
        }

        public void setStatus (String status)
        {
            this.status = status;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [ResponseText = "+ResponseText+", status = "+status+"]";
        }
    }

