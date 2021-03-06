package com.redhat.demo.iot.utils;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DataSet implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "timestamp")
   private java.lang.String timestamp;
   @org.kie.api.definition.type.Label(value = "deviceType")
   private java.lang.String deviceType;
   @org.kie.api.definition.type.Label(value = "deviceID")
   private java.lang.Integer deviceID;
   @org.kie.api.definition.type.Label(value = "payload")
   private java.lang.Integer payload;
   @org.kie.api.definition.type.Label(value = "required")
   private java.lang.Integer required;
   @org.kie.api.definition.type.Label(value = "average")
   private java.lang.Float average;
   @org.kie.api.definition.type.Label(value = "errorMessage")
   private java.lang.String errorMessage;
   @org.kie.api.definition.type.Label(value = "errorCode")
   private java.lang.Integer errorCode;

   public DataSet()
   {
   }

   public java.lang.String getTimestamp()
   {
      return this.timestamp;
   }

   public void setTimestamp(java.lang.String timestamp)
   {
      this.timestamp = timestamp;
   }

   public java.lang.String getDeviceType()
   {
      return this.deviceType;
   }

   public void setDeviceType(java.lang.String deviceType)
   {
      this.deviceType = deviceType;
   }

   public java.lang.Integer getDeviceID()
   {
      return this.deviceID;
   }

   public void setDeviceID(java.lang.Integer deviceID)
   {
      this.deviceID = deviceID;
   }

   public java.lang.Integer getPayload()
   {
      return this.payload;
   }

   public void setPayload(java.lang.Integer payload)
   {
      this.payload = payload;
   }

   public java.lang.Integer getRequired()
   {
      return this.required;
   }

   public void setRequired(java.lang.Integer required)
   {
      this.required = required;
   }

   public java.lang.Float getAverage()
   {
      return this.average;
   }

   public void setAverage(java.lang.Float average)
   {
      this.average = average;
   }

   public java.lang.String getErrorMessage()
   {
      return this.errorMessage;
   }

   public void setErrorMessage(java.lang.String errorMessage)
   {
      this.errorMessage = errorMessage;
   }

   public java.lang.Integer getErrorCode()
   {
      return this.errorCode;
   }

   public void setErrorCode(java.lang.Integer errorCode)
   {
      this.errorCode = errorCode;
   }

   public DataSet(java.lang.String timestamp, java.lang.String deviceType,
         java.lang.Integer deviceID, java.lang.Integer payload,
         java.lang.Integer required, java.lang.Float average,
         java.lang.String errorMessage, java.lang.Integer errorCode)
   {
      this.timestamp = timestamp;
      this.deviceType = deviceType;
      this.deviceID = deviceID;
      this.payload = payload;
      this.required = required;
      this.average = average;
      this.errorMessage = errorMessage;
      this.errorCode = errorCode;
   }

}