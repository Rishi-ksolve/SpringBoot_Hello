package com.userlogin.springuser.Entiry;

import javax.persistence.*;

@Entity
public class Events{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eId;

    private Long userId;

    public Long getUserId() {
        return userId;
    }



    public Events(String eventName, String eventLocation) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
    }

    public Events(Long userId, String eventName, String eventLocation) {
        this.userId = userId;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
    }

    public Events(Long eId, Long userId, String eventName, String eventLocation) {
        this.eId = eId;
        this.userId = userId;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name="EventName")
    private String eventName;

    @Column(name = "Location")
    private String eventLocation;



    public Events() {
        super();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
}
