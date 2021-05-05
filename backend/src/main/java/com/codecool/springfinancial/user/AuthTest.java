//package com.codecool.springfinancial.user;
//
//import com.codecool.springfinancial.location.Location;
//import com.codecool.springfinancial.location.LocationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/test")
//public class AuthTest {
//
//    private final LocationService locationService;
//
//    @Autowired
//    public AuthTest(LocationService locationService) {
//        this.locationService = locationService;
//    }
//
//    @GetMapping("/all")
//    public List<Location> allAccess() {
//        return locationService.getLocations();
//    }
//}
