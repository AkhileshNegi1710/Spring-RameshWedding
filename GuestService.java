package com.ramesh.rameshwedding.guests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

//Service will allow logic, calulation and objects creation
@Service
public class GuestService {


    public GuestEntity registerGuest(String guestName, Boolean withFamily) {
    GuestEntity newGuest=new GuestEntity();
        newGuest.setGuestName(guestName);
        newGuest.setWithFamily(withFamily);
        newGuest.setInvitationdate(new Date());
        System.out.println("***********"+newGuest.getId());
        return newGuest;
//       TODO: save in database

    }
}
