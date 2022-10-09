package com.ramesh.rameshwedding.guests;

import javax.persistence.*;
import java.util.Date;


//Entity(table with primary in a database)
@Entity
@Table(name="guest")
public class GuestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

//    To access these private variable we need getter and setter methods
    private String guestName;
    private Boolean withFamily;
    private Date invitationdate;

    //not creating id bcoz it will automatically be created
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Boolean getWithFamily() {
        return withFamily;
    }

    public void setWithFamily(Boolean withFamily) {
        this.withFamily = withFamily;
    }

    public Date getInvitationdate() {
        return invitationdate;
    }

    public void setInvitationdate(Date invitationdate) {
        this.invitationdate = invitationdate;
    }
}
