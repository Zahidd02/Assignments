package Method_Overriding_Assignment_2;

public class TeamEvent extends Event {
    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    @Override
    public void registerEvent() {
        double fee = 0;
        if(super.getEventName().equals("Singing")) {
            fee = (double) 4*this.noOfParticipants;
            super.setRegistrationFee(fee);
        }
        else if (super.getEventName().equals("Dancing")) {
            fee = (double) 6*this.noOfParticipants;
            super.setRegistrationFee(fee);
        }
        else if (super.getEventName().equals("DigitalArt")) {
            fee = (double) 8*this.noOfParticipants;
            super.setRegistrationFee(fee);
        }
        else if (super.getEventName().equals("Acting")) {
            fee = (double) 10*this.noOfParticipants;
            super.setRegistrationFee(fee);
        }
        else {
            super.setRegistrationFee(0);
        }
    }

    public int getNoOfParticipants() {
        return this.noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return this.teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    } 
}
