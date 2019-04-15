package com.teaplantation.demo.entity;

import java.util.Date;

public class Sensor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.sid
     *
     * @mbg.generated
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.locus_id
     *
     * @mbg.generated
     */
    private Integer locusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.sensor_name
     *
     * @mbg.generated
     */
    private String sensorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.sensor_type
     *
     * @mbg.generated
     */
    private Byte sensorType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.sensor_info
     *
     * @mbg.generated
     */
    private String sensorInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.sid
     *
     * @return the value of sensor.sid
     *
     * @mbg.generated
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.sid
     *
     * @param sid the value for sensor.sid
     *
     * @mbg.generated
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.locus_id
     *
     * @return the value of sensor.locus_id
     *
     * @mbg.generated
     */
    public Integer getLocusId() {
        return locusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.locus_id
     *
     * @param locusId the value for sensor.locus_id
     *
     * @mbg.generated
     */
    public void setLocusId(Integer locusId) {
        this.locusId = locusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.sensor_name
     *
     * @return the value of sensor.sensor_name
     *
     * @mbg.generated
     */
    public String getSensorName() {
        return sensorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.sensor_name
     *
     * @param sensorName the value for sensor.sensor_name
     *
     * @mbg.generated
     */
    public void setSensorName(String sensorName) {
        this.sensorName = sensorName == null ? null : sensorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.sensor_type
     *
     * @return the value of sensor.sensor_type
     *
     * @mbg.generated
     */
    public Byte getSensorType() {
        return sensorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.sensor_type
     *
     * @param sensorType the value for sensor.sensor_type
     *
     * @mbg.generated
     */
    public void setSensorType(Byte sensorType) {
        this.sensorType = sensorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.add_time
     *
     * @return the value of sensor.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.add_time
     *
     * @param addTime the value for sensor.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.sensor_info
     *
     * @return the value of sensor.sensor_info
     *
     * @mbg.generated
     */
    public String getSensorInfo() {
        return sensorInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.sensor_info
     *
     * @param sensorInfo the value for sensor.sensor_info
     *
     * @mbg.generated
     */
    public void setSensorInfo(String sensorInfo) {
        this.sensorInfo = sensorInfo == null ? null : sensorInfo.trim();
    }
}