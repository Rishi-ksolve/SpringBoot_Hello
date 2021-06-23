package com.userlogin.springuser.Entiry;

import javax.persistence.Column;

public class Evnt {
    private String eventName;
    private String eventLocation;

    public Evnt(String eventName, String eventLocation) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
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
