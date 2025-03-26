package com.example.healthcare.Model;
import org.springframework.stereotype.Component;
@component
public class AvailabilityModel {
	
	private String doctorID;
    private Date date;
    private List<String> timeSlots;
    public String getDoctorID() {
        return doctorID;
    }
    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<String> getTimeSlots() {
        return timeSlots;
    }
    public void setTimeSlots(List<String> timeSlots) {
        this.timeSlots = timeSlots;
    }
 
	
}
