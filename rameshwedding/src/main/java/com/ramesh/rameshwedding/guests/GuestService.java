package com.ramesh.rameshwedding.guests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

//Service will allow logic, calulation and objects creation
@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public GuestEntity registerGuest(String guestName, Boolean withFamily) {
    GuestEntity newGuest=new GuestEntity();
        newGuest.setGuestName(guestName);
        newGuest.setWithFamily(withFamily);
//        automatic date will be created
        newGuest.setInvitationdate(new Date());
        System.out.println("***********THis will not show with Get ID as null bcoz we are not saving the table"+newGuest+"****Checking "+newGuest.getId());

        var savedGuest=guestRepository.save(newGuest);
        System.out.println("********Above(savedGuest) we are saving so it will show with updated ID as we continously saving table "+savedGuest.getId());
        return savedGuest;
//       TODO: save in database

    }
}
