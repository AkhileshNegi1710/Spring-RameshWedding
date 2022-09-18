package com.ramesh.rameshwedding.guests;
//All the Restful APIs
//Controller is used to handle/pass the request of APIs like GET, POST, DELETE


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/guest")
public class GuestController {

//we can create an object through Autowired annotation or through constructor

    //    @Autowired
    GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping("/registerGuest")
//    ResponseEntity represents the whole HTTP response: status code, headers, and body.
//    Adding param values like guestName and withFamily with ? Question Mark and values will come from Postman
//    Example here {t0} & {t1} are taken as parameter(user has to add values for these) in postman
//    {{url}}/streams/users/{{uuid}}/homes/{{hid}}/gws/2/gb.json?t0={{t0}}&t1={{t1}}
//guestname and withFamily values will come from Postman(frontend)
//    public ResponseEntity<?> registerGuest(@RequestParam String guestName, @RequestParam Boolean withFamily)
    public ResponseEntity registerGuest(@RequestParam String guestName, @RequestParam Boolean withFamily)
    {
    var response=guestService.registerGuest(guestName,withFamily);
    return ResponseEntity.ok(response);
    }

    @GetMapping("/getGuests")
    public ResponseEntity<?> getGuest()
    {

        return null;
    }

    @GetMapping("/getGuestid/{guestid}")
    public ResponseEntity<?> getGuestid()
    {

        return null;
    }
}
