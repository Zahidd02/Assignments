package Method_Overriding_Assignment_2;

public class Event {
    private String eventName;
    private String participantName;
    private double registrationFee;

    public Event(String eventName, String participantName) {
        this.eventName = eventName;
        this.participantName = participantName;
    }

    public void registerEvent() {
        if(this.eventName == "Singing") {
            this.registrationFee = 8;
        }
        else if(this.eventName == "Dancing") {
            this.registrationFee = 10;
        }
        else if(this.eventName == "DigitalArt") {
            this.registrationFee = 12;
        }
        else if(this.eventName == "Acting") {
            this.registrationFee = 15;
        }
        else {
            this.registrationFee = 0;
        }
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getParticipantName() {
        return this.participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public double getRegistrationFee() {
        return this.registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
}
